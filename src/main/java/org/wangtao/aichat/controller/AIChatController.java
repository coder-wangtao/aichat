package org.wangtao.aichat.controller;

import jakarta.annotation.Resource;
import org.springframework.ai.chat.client.ChatClientCustomizer;
import org.springframework.ai.chat.client.DefaultChatClient;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.ai.ollama.OllamaChatModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;


@RestController
@CrossOrigin(origins = "*")
public class AIChatController {

    private OllamaChatModel chatClient;

    @Autowired
    public AIChatController(OllamaChatModel chatClient){
        this.chatClient = chatClient;
    }

    @PostMapping("/chat")
    public Map<String,Object> doChat(@RequestBody String text){
        return Map.of("message",chatClient.call(text));
    }

}
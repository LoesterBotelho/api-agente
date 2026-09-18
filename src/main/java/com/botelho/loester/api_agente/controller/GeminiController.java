package com.botelho.loester.api_agente.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.botelho.loester.api_agente.service.GeminiService;

@RestController
@RequestMapping("/gemini")
public class GeminiController {

    private final GeminiService geminiService;

    public GeminiController(GeminiService geminiService) {
        this.geminiService = geminiService;
    }

    @PostMapping
    public ResponseEntity<String> chamarGemini(@RequestBody String prompt) {

        String resposta = geminiService.chamarGemini(prompt);

        return ResponseEntity.ok(resposta);
    }
}
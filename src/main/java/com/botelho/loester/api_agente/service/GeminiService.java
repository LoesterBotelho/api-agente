package com.botelho.loester.api_agente.service;

import org.springframework.stereotype.Service;

import com.google.genai.Client;
import com.google.genai.types.GenerateContentResponse;

@Service
public class GeminiService {

    private final Client client;

    public GeminiService() {
        this.client = Client.builder()
                .apiKey(System.getenv("GOOGLE_API_KEY"))
                .build();
    }

    public String chamarGemini(String prompt) {

        GenerateContentResponse response =
                client.models.generateContent(
                        "gemini-3.6-flash",
                        prompt,
                        null
                );

        return response.text();
    }
}
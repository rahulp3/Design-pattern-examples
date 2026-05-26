package com.rpb.structural.adaptor;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class TranslationRequest {
    String text;
    String sourceLanguage;
    String targetLanguage;
    Double confidenceThreshold;
}

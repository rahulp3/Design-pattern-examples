package com.rpb.structural.adaptor;

import java.util.List;

import com.rpb.structural.adaptor.external.*;

public class GoogleTranslationAdapter implements TranslationProviderAdapter{

    private GoogleTranslateApi googleTranslateApi = new GoogleTranslateApi();

    @Override
    public String translate(TranslationRequest request) {
        GoogleTranslationRequest googleTranslationRequest = new GoogleTranslationRequest(request.text, request.sourceLanguage, request.targetLanguage, 0.8 );
        return googleTranslateApi.convert(googleTranslationRequest);
    }

    @Override
    public List<String> getSupportedLanguages() {
        return googleTranslateApi.getLanguages();
    }
    
}

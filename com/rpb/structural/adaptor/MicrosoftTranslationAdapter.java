package com.rpb.structural.adaptor;

import java.util.List;

import com.rpb.structural.adaptor.external.MicrosoftTranslateApi;

public class MicrosoftTranslationAdapter implements TranslationProviderAdapter{

    private MicrosoftTranslateApi microsoftTranslateApi = new MicrosoftTranslateApi();

    @Override
    public String translate(TranslationRequest request) {
        return microsoftTranslateApi.translate(request.text, request.sourceLanguage, request.targetLanguage);
    }

    @Override
    public List<String> getSupportedLanguages() {
        return microsoftTranslateApi.getSupportedLanguages();
    }
    
    
}

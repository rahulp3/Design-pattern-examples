package com.rpb.structural.adaptor;

import java.util.List;

public interface TranslationProviderAdapter {
    String translate(TranslationRequest request);
    List<String> getSupportedLanguages();
}

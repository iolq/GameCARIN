package com.company;

public interface Tokenizer {
    String peek();
    Pair<String, String> consume();
}

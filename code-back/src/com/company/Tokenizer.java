package com.company;

public interface Tokenizer {
    String peek();
    String consume();
    String command();
}

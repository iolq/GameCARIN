package com.company;
import java.util.Map;
public interface Expression extends Node{
    int eval(Map<String,Integer> binding);
}

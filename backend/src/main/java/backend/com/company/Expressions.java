package backend.com.company;

import java.util.Map;

public interface Expressions extends Node{
    int eval(Map<String,Integer> binding);
    int number();
}

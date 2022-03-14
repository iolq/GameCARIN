package backend.com.company;

public interface Statement extends Node {
    void eval();
    Pair<Integer,Integer> evalPair();
}

package com.company;

import java.util.Iterator;
import java.util.LinkedList;

public class ExTokenizer implements Tokenizer{
    LinkedList<Pair<String,String>> list;
    Iterator<Pair<String, String>> run;


    ExTokenizer(LinkedList<Pair<String,String>> ac){
        list = ac;
        run = list.iterator();
    }

    @Override
    public String peek() {
        Iterator<Pair<String, String>> peek = run;
        Pair<String, String> re = peek.next();
        return re.fst;
    }

    @Override
    public Pair<String, String> consume() {
        return run.next();
    }
}

package com.company;

import org.junit.jupiter.api.Test;

import java.beans.Expression;

import static org.junit.jupiter.api.Assertions.*;

class MainTest2 {
    String[] arr = new String[]{"1+1","-1-2","2+s"};
    @Test
    int parseE(){
        assertEquals(parseE(),2);
        return 0;
    }
}
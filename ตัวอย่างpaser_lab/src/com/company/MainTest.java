package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    String[] arr = new String[]{"1+1","2+2/3","2+s","2%2","2.0+4.5"};
    @org.junit.jupiter.api.Test
    void calculate() throws Exception {
        assertEquals(Main.Calculate(arr[0]),"1+1=2");
        assertEquals(Main.Calculate(arr[3]),"2%2=0");
        assertEquals(Main.Calculate(arr[1]),"2+2/3=1");
        assertEquals(Main.Calculate(arr[2]),"Throw exception");
        assertEquals(Main.Calculate(arr[4]),"throw exception");
    }

}
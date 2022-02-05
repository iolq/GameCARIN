package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest5 {
    String[] arr = new String[]{"1 + 2","2 / 2","3 % 3","4 - ( 1 - 5 )","0 * ( 8 * 0 )","-1+-1","s + s"};
    @Test
    void calculate() throws SyntaxError {
        assertEquals(Main.Calculate(arr[0]),"(1+2) = 3");
        assertEquals(Main.Calculate(arr[1]),"(2/2) = 1");
        assertEquals(Main.Calculate(arr[2]),"(3%3) = 0");
        assertEquals(Main.Calculate(arr[3]),"(4-(1-5)) = 8");
        assertEquals(Main.Calculate(arr[4]),"(0*(8*0)) = 0");
        //assertEquals(Main.Calculate(arr[5]),"SyntaxError");
        //assertEquals(Main.Calculate(arr[6]),"SyntaxError");
    }
}
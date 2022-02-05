package com.company;

import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class MainTest3 {

    @Test
    void calculate() throws Exception {
        assertEquals(Main.Calculate("2%2"),"2%2=0");
    }
}
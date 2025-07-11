package com.vetias.java.workshop.lambdas;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SquareText {

    @Test
    public void testSquare() {
        Square square = (int x) -> x*x;
        Assertions.assertEquals(36, square.findSquare(6));
        
    }
}

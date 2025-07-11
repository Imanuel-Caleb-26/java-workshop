package com.vetias.java.workshop.basics.string;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import com.java.workshop.lambda.Square;

public class SquareText {

    @Test 
    public void testsquare(){
        Square square = (int x) -> x * x;
        Assertions.assertEquals(25, square.findsquare(5));
    }


}

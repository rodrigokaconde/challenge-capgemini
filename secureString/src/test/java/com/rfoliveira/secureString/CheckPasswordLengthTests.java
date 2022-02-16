package com.rfoliveira.secureString;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CheckPasswordLengthTests {

    @Test
    public void checkPasswordEqualsOne(){
        int passworSizeAdd = CheckPasswordLength.checkPassword("a");
        assertEquals(5, passworSizeAdd);
    }

    @Test
    public void checkPasswordLargerOneSmallerSix(){
        int passworSizeAdd = CheckPasswordLength.checkPassword("aaa");
        assertEquals(3, passworSizeAdd);
    }

    @Test
    public void checkPasswordEqualsSix(){
        int passworSizeAdd = CheckPasswordLength.checkPassword("aaaaaa");
        assertEquals(0, passworSizeAdd);
    }

    @Test
    public void checkPasswordLargerSix(){
        int passworSizeAdd = CheckPasswordLength.checkPassword("aaaaaaaaaaaaaa");
        assertEquals(0, passworSizeAdd);
    }

    @Test
    public void checkPasswordExample(){
        int passworSizeAdd = CheckPasswordLength.checkPassword("Ya3");
        assertEquals(3, passworSizeAdd);
    }
}

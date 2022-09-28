package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    public void isLowerNull(){
        //given
        int inputValue = -5;
        //when
        int actual = Main.faculty(inputValue);
        //then
        assertEquals(0,actual);
    }

    @Test
    public void zeroIsOne(){
        //given
        int inputValue = 0;
        //when
        int actual = Main.faculty(inputValue);
        //then
        assertEquals(1,actual);
    }

    @Test
    public void oneIsOne(){
        //given
        int inputValue = 1;
        //when
        int actual = Main.faculty(inputValue);
        //then
        assertEquals(1,actual);
    }

    @Test
    public void threeIsSix(){
        //given
        int inputValue = 3;
        //when
        int actual = Main.faculty(inputValue);
        //then
        assertEquals(6,actual);
    }
}
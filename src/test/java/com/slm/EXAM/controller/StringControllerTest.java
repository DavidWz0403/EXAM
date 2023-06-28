package com.slm.EXAM.controller;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringControllerTest {

    @Test
    void modifyStringTest() {
        StringController controller = new StringController();
        String modifiedString = controller.modifyString("hello");

        assertEquals("hElLo", modifiedString);
    }

    @Test
    void modifyFalsyStringTest(){
        StringController controller = new StringController();
        String modifiedString = controller.modifyString("hello");

        assertNotEquals("hELLO", modifiedString);
    }

    @Test
    void getValueOfStringTest(){
        StringController controller = new StringController();
        String word = controller.getLastWord("hello");

        assertEquals("hello", word);
    }

    @Test
    void getLengthOfStringTest(){
        StringController controller = new StringController();
        String modifiedString = controller.modifyString("hello");
        int word = controller.getLastWordLength();

        assertEquals(5, word);
    }

}
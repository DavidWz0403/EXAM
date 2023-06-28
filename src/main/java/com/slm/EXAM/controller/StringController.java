package com.slm.EXAM.controller;
import org.springframework.web.bind.annotation.*;

@RestController
public class StringController {

    private String lastWord;

    @PostMapping("/modify")
    public String modifyString(@RequestBody String input) {
        String modifiedString = convertString(input);
        this.lastWord = getLastWord(modifiedString);
        return modifiedString;
    }
    public String convertString(String input) {
        StringBuilder sb = new StringBuilder(input.length());

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (i % 2 == 1) {
                c = Character.toUpperCase(c);
            }
            sb.append(c);
        }
        return sb.toString();
    }

    public String getLastWord(String input) {
        return input.split(" ")[input.split(" ").length - 1];
    }


    @GetMapping("/modify/length")
    public int getLastWordLength() {
        if (lastWord == null) {
            return 0;
        }
        return this.lastWord.length();
    }

}

package com.slm.EXAM.controller;
import org.springframework.web.bind.annotation.*;

@RestController
public class StringController {

    @PostMapping("/modify")
    public String modifyString(@RequestBody String input) {
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
}

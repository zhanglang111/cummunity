package com.learnmajiang.cummunity.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Code by langlang on 2020/1/25
 */

@Controller
public class helloController {


    @GetMapping("test")
    public String test(){
        return "index";
    }
}

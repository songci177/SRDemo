package com.example.headline.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class testController {
    @RequestMapping("index")
    public String sauHello(){
        return "index";
    }
}

package com.example.mydemo.controlle;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/myDemo")
public class MyDemoController {

    @RequestMapping("/getStart")
    public String getStart() {
        return "hello";
    }

}

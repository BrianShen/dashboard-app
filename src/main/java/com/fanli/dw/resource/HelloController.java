package com.fanli.dw.resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by brian on 2016/1/24.
 */
@RestController
public class HelloController {

    @RequestMapping("/")
    public String getHello() {
        return "hello shenwei";
    }
}

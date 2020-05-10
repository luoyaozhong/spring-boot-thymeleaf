package com.lxd.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * IndexController
 *
 * @author lxd
 * @date 2020/5/10
 **/
@Controller
public class IndexController {

    @GetMapping("/string")
    @ResponseBody
    public String StringResult() {
        return "attitude details target action";
    }

    @GetMapping("/index")
    public String toIndex() {
        return "index";
    }
}

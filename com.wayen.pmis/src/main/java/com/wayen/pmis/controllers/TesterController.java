package com.wayen.pmis.controllers;

import org.springframework.stereotype.Controller;
import com.wayen.utils.StringUtils;

@Controller
public class TesterController {
    public void test(){
        StringUtils.isEmpty("");
    }
}

package com.scrapbook.digitalscrapbook.DigitalScrapbook;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DigitalScratchpadApplicationController {

    @RequestMapping
    public String helloWorld() {
        return "Hello World";
    }
}

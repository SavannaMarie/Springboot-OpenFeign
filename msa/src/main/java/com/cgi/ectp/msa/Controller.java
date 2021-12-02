package com.cgi.ectp.msa;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping("/date/v1")
public class Controller {

    @GetMapping("/now")
    public Date now() {
        return new Date();
    }
}

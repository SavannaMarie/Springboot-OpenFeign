package com.cgi.ectp.msb;

import com.cgi.ectp.msb.client.MSAClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


import java.util.Date;

@RestController
@RequestMapping("/getdate/v1")
public class Controller {

    @Autowired private Properties properties;
    @Autowired private RestTemplate restTemplate;
    @Autowired private MSAClient msaClient;

    @GetMapping("/now")
    public Date now() {
        return restTemplate.getForObject(properties.getNowURL(), Date.class);
    }
    @GetMapping("/now2")
    public Date now2() {
        return msaClient.now();
    }
}

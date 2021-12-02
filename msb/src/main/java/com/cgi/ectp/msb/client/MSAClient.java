package com.cgi.ectp.msb.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Date;

@FeignClient(name = "MSAClient", url = "${MSAURL}")
public interface MSAClient {

    @GetMapping("/now")
    Date now();
    @GetMapping("/now")
    Date nowString();
}

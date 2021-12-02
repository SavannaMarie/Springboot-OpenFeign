package com.cgi.ectp.msb;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Getter
public class Properties {

    @Value("${nowURL}")
    private String nowURL;
}

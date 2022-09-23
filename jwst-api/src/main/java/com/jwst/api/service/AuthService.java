package com.jwst.api.service;

import com.jwst.api.controller.ApiController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;

@Service
public class AuthService {
    @Value("${auth.username}")
    private String username;

    @Value("${auth.password}")
    private String password;

    Logger logger = LoggerFactory.getLogger(ApiController.class);


    public HttpHeaders authentication(){
        logger.info("Calling authentication and setting keys");

        try {
            String userCredentials = username + ":" + password;
            byte[] encodedAuth = org.apache.tomcat.util.codec.binary.Base64.encodeBase64(userCredentials.getBytes(StandardCharsets.UTF_8));
            String basicAuth = "Basic " + new String(encodedAuth);
            HttpHeaders httpHeaders = new HttpHeaders();
            httpHeaders.set("Authorization", basicAuth);
            httpHeaders.setContentType(MediaType.APPLICATION_JSON);

            return httpHeaders;
        }catch(Exception e){
            logger.info("AuthService failed with exception: " + Arrays.toString(e.getStackTrace()));
            throw new RuntimeException();
        }

    }

}

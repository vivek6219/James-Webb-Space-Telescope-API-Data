package com.jwst.api.controller;

import com.jwst.api.model.Body;
import com.jwst.api.model.JpgData;
import com.jwst.api.service.AuthService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

import java.io.IOException;
import java.util.List;


@RestController
public class ApiController {

    Logger logger = LoggerFactory.getLogger(ApiController.class);
    private AuthService authService;

    private final String url = "https://api.jwstapi.com/";

    public ApiController(AuthService authService) {
        this.authService = authService;
    }

//    @GetMapping("/images")
//    public String returnImages() throws IOException {
//        logger.info("Entering /images mapping");
//        String imageUrl = url + "all/type/jpg";
////        Unirest.setTimeouts(0, 0);
//        HttpResponse<String> response = Unirest.get("https://api.jwstapi.com/all/type/jpg")
//                .header("X-API-KEY", "37a535b3-2943-4c70-9c1c-799c8b7b16cf")
//                .asString();
//
//        return response.getBody();
//
//    }

    @GetMapping("/images")
    public String returnImagesWebClient() throws IOException {
        logger.info("Entering /images mapping");
        String imageUrl = url + "all/type/jpg";

        String response = WebClient.builder()
                .build()
                .mutate()
                .codecs(configurer -> configurer
                        .defaultCodecs()
                        .maxInMemorySize(16 * 1024 * 1024) //increases memory size so that the resposne doesn't reach memory limit
                )
                .build()
                .get()
                .uri(imageUrl)
                .header("X-API-KEY", "37a535b3-2943-4c70-9c1c-799c8b7b16cf")
                .retrieve()
                .bodyToMono(String.class)
                .block();

//        ObjectMapper objectMapper = new ObjectMapper();
//        objectMapper.configure(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY, true);
//        CollectionType bodyType = objectMapper.getTypeFactory().constructCollectionType(List.class, String.class);
//
//        List<Body> bodies = new ArrayList<>();
//
//        String body = objectMapper.readValue(response, bodyType);

        return response;
    }

    @GetMapping("/imagesList")
    public Mono<JpgData> returnImagesListWebClient() throws IOException {
        logger.info("Entering /images mapping");
        String imageUrl = url + "all/type/jpg";

        try{
            return WebClient.builder()
                    .build()
                    .mutate()
                    .codecs(configurer -> configurer
                            .defaultCodecs()
                            .maxInMemorySize(16 * 1024 * 1024) //increases memory size so that the resposne doesn't reach memory limit
                    )
                    .build()
                    .get()
                    .uri(imageUrl)
                    .header("X-API-KEY", "REMOVED THIS")
                    .accept(MediaType.APPLICATION_JSON)
                    .retrieve()
                    .bodyToMono(JpgData.class)
                    .log();


        }catch(Exception e){
            logger.error("Error: " + e);
            throw new IOException();
        }

    }
}



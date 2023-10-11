package com.bichelyauhen.texttoimage.controller;

import com.bichelyauhen.texttoimage.entity.GeneratedImage;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("/image")
public class ImageController {
    @GetMapping(value = "/{id}",
            produces={MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
    public ResponseEntity<GeneratedImage> findById(@PathVariable("id") final Long id) {

        GeneratedImage image = new GeneratedImage();
        image.setId(UUID.randomUUID().toString());
        image.setFilePath("test path");
        image.setUrl("http://localhost:8080");

        return ResponseEntity.ok()
                .eTag(image.toString())
                .body(image);
    }
}

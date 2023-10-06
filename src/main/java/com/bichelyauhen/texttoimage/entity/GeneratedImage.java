package com.bichelyauhen.texttoimage.entity;

import org.springframework.data.redis.core.RedisHash;

import java.io.Serializable;

@RedisHash("GeneratedImage")
public class GeneratedImage implements Serializable {
    private String id;
    private String url;
    private String filePath;
}

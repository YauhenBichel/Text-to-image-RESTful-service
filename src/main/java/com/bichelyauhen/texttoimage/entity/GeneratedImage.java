package com.bichelyauhen.texttoimage.entity;

//import org.springframework.data.redis.core.RedisHash;

import java.io.Serializable;

//@RedisHash("GeneratedImage")
public class GeneratedImage implements Serializable {
    private String id;
    private String url;
    private String filePath;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof GeneratedImage)) return false;

        GeneratedImage that = (GeneratedImage) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (url != null ? !url.equals(that.url) : that.url != null) return false;
        return filePath != null ? filePath.equals(that.filePath) : that.filePath == null;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (url != null ? url.hashCode() : 0);
        result = 31 * result + (filePath != null ? filePath.hashCode() : 0);
        return result;
    }
}

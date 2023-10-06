package com.bichelyauhen.texttoimage.repository;

import com.bichelyauhen.texttoimage.entity.GeneratedImage;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ImageRepository extends CrudRepository<GeneratedImage, String> { }

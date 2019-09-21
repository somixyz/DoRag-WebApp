package com.durag.service;

 

import java.util.List;

import com.durag.model.Photo;
import com.durag.model.User;

/**
 * Created by lede on 4/29/16.
 */
public interface PhotoService {
    Photo save(Photo photo);

    List<Photo> findAll();

    List<Photo> findByUser(User user);

    Photo findByPhotoId(Long photoId);

}

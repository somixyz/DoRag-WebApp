package com.durag.dao;
 
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.durag.model.Photo;
import com.durag.model.User;

import java.util.List;
 
@Repository
public interface PhotoDao extends CrudRepository<Photo, Long> {
    Photo save(Photo photo);

    List<Photo> findByUser(User user);

    List<Photo> findAll();

    Photo findByPhotoId(Long photoId);
}

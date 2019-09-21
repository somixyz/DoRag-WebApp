package com.durag.controller;
 
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.durag.model.Comment;
import com.durag.model.Photo;
import com.durag.service.CommentService;
import com.durag.service.PhotoService;
 
@RestController
@RequestMapping("/rest")
public class CommentResources {

    @Autowired
    private PhotoService photoService;

    @Autowired
    private CommentService commentService;

    @RequestMapping(value = "/comment/add", method = RequestMethod.POST)
    public void addComment (@RequestBody Comment comment) {
        Photo photo = photoService.findByPhotoId(comment.getPhotoId());
        List<Comment> commentList=photo.getCommentList();
        comment.setPhoto(photo);
//        if (commentList==null) {
//            commentList = new ArrayList<Comment>();
//        }
//        commentList.add(comment);
//        photo.setCommentList(commentList);
//        photoService.save(photo);
        commentService.save(comment);
    }
}

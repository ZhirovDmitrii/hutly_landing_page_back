package hutly.comments_api.service;

import hutly.comments_api.entities.Comment;

import java.util.List;
import java.util.Optional;

public interface IComment {
    List<Comment> getAllComments();
    void addComment(Comment comment);
    void deleteComment(String id);
    Optional<Comment> getCommentById(String id);
}

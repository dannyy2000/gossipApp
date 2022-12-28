package africa.semicolon.gossip.services;

import africa.semicolon.gossip.data.models.Comment;
import africa.semicolon.gossip.dto.request.CreateCommentRequest;

import java.util.List;

public interface CommentService {

    void createComment(CreateCommentRequest createCommentRequest );

    List<Comment> viewAll();
}

package africa.semicolon.gossip.controllers;

import africa.semicolon.gossip.dto.request.CreateCommentRequest;
import africa.semicolon.gossip.services.CommentService;
import africa.semicolon.gossip.services.CommentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CommentController {

    @Autowired
    private CommentService commentService ;

    @PostMapping("/comment")
    public String addComment(@RequestBody  CreateCommentRequest createCommentRequest){
        commentService.createComment(createCommentRequest);
        return "Comment added";
    }
}

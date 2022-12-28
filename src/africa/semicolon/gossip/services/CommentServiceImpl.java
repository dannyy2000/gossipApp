package africa.semicolon.gossip.services;

import africa.semicolon.gossip.data.models.Comment;
import africa.semicolon.gossip.data.repositories.CommentRepository;
//import africa.semicolon.gossip.data.repositories.CommentRepositoryImpl;
import africa.semicolon.gossip.dto.request.CreateCommentRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CommentServiceImpl implements CommentService{
    @Autowired
    private CommentRepository commentRepository ;
    @Autowired
    private PostService postService;

    @Override
    public void createComment(CreateCommentRequest createCommentRequest) {
        Comment comment = new Comment();
        comment.setComment(createCommentRequest.getComment());
        comment.setCommenterName(createCommentRequest.getCommenterName());
        Comment savedComment  = commentRepository.save(comment);
        postService.addComment(createCommentRequest.getPostId(),savedComment);

    }

    @Override
    public List<Comment> viewAll(){
        return commentRepository.findAll();
    }
}

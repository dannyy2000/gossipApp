package africa.semicolon.gossip.services;

import africa.semicolon.gossip.dto.request.CreateCommentRequest;
import africa.semicolon.gossip.dto.request.CreatePostRequest;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CommentServiceTest {
    private CommentService commentService;
    private PostService postService;

    @BeforeEach
    public void setUp(){
        commentService = new CommentServiceImpl();
        postService = new PostServiceImpl();
    }

    @Test
    public void createCommentTest(){

        CreatePostRequest createPostRequest = new CreatePostRequest();
        createPostRequest.setTitle("Title");
        createPostRequest.setBody("Body");
        postService.createPost(createPostRequest);

        CreateCommentRequest createCommentRequest = new CreateCommentRequest();
        createCommentRequest.setCommenterName("Daniel");
        createCommentRequest.setComment("I love you");
        commentService.createComment(createCommentRequest);


        assertEquals(1,commentService.viewAll().size());
        PostService postService1 = new PostServiceImpl();


    }
}

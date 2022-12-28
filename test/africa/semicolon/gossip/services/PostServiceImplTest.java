package africa.semicolon.gossip.services;

import africa.semicolon.gossip.data.models.Comment;
import africa.semicolon.gossip.data.models.Post;
import africa.semicolon.gossip.dto.request.CreatePostRequest;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PostServiceImplTest {

    private PostService postService;
    private CreatePostRequest  createPostRequest;

    @BeforeEach
    void setUp() {

        postService = new PostServiceImpl();
        createPostRequest = new CreatePostRequest();

    }

    @Test
    public void createPostTest(){
        createPostRequest.setBody("Egusi is my best soup");
        createPostRequest.setTitle("New post");

        postService.createPost(createPostRequest) ;

        assertEquals(1, postService.viewAllPost().size());
    }

    @Test
    public void viewPostTest(){
        createPostRequest.setBody("Egusi is my best soup");
        createPostRequest.setTitle("New Post");
        postService.createPost(createPostRequest) ;
        assertEquals(1, postService.viewAllPost().size());

        Post post = postService.viewPost(1);
        assertEquals("New Post",post.getTitle());
        assertEquals("Egusi is my best soup",post.getBody());
    }

    @Test
    public void addCommentTest(){
        // given i have a saved post
        // given i have a comment
        // when i save the comment to post
        // confirm that post comment is now 1

        createPostRequest.setBody("Post Body");
        createPostRequest.setTitle("Post Title");
        postService.createPost(createPostRequest);
        Comment comment = new Comment();
        comment.setComment("I love your post");
        postService.addComment("1",comment);

        Post savedPost = postService.viewPost(1);
        assertEquals(1,savedPost.getComments().size());
        List<Comment> comments = savedPost.getComments();
        Comment firstComment = comments.get(0);
        assertEquals("I love your post",firstComment.getComment());
    }
}
package africa.semicolon.gossip.controllers;

import africa.semicolon.gossip.data.models.Post;
import africa.semicolon.gossip.dto.request.CreatePostRequest;
import africa.semicolon.gossip.services.PostService;
import africa.semicolon.gossip.services.PostServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class PostController {
    @Autowired
    private PostService postService;

   @PostMapping("/post")
    public String createPost(@RequestBody CreatePostRequest createPostRequest){
        postService.createPost(createPostRequest);
        return "Successful";
    }

    @GetMapping("/post/{postId}")
     public Post viewPost(@PathVariable int postId){
        return postService.viewPost(postId);
     }


}

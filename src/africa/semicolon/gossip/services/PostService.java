package africa.semicolon.gossip.services;

import africa.semicolon.gossip.data.models.Comment;
import africa.semicolon.gossip.data.models.Post;
import africa.semicolon.gossip.dto.request.CreatePostRequest;

import java.util.List;

public interface PostService {

    void createPost(CreatePostRequest createPostRequest);

    void updatePost(String id,String title,String body);

    void deletePost(String id);

    Post viewPost(int id);

    List<Post> viewAllPost();

    void addComment(String PostId, Comment comment);
}

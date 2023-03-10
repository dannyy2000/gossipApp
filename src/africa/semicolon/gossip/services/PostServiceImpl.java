package africa.semicolon.gossip.services;

import africa.semicolon.gossip.data.models.Comment;
import africa.semicolon.gossip.data.models.Post;
import africa.semicolon.gossip.data.repositories.PostRepository;
//import africa.semicolon.gossip.data.repositories.PostRepositoryImpl;
import africa.semicolon.gossip.dto.request.CreatePostRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostServiceImpl implements PostService{
   @Autowired
    private  PostRepository postRepository ;
    @Override
    public void createPost(CreatePostRequest createPostRequest) {
      Post post = new Post();
      post.setBody(createPostRequest.getBody());
      post.setTitle(createPostRequest.getTitle());
      postRepository.save(post);
    }

    @Override
    public void updatePost(String id, String title, String body) {

    }




    @Override
    public void deletePost(String id) {

    }

    @Override
    public Post viewPost(int id) {
        return null;
    }

//    @Override
//    public Post viewPost(String id) {
//      return postRepository.findPostById(String.valueOf(id));
//    }

    @Override
    public List<Post> viewAllPost() {
        return postRepository.findAll();
    }

    @Override
    public void addComment(String postId, Comment comment) {
        Post savedPost = postRepository.findPostById(postId);
        savedPost.getComments().add(comment);
        postRepository.save(savedPost);
    }
}

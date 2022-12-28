package africa.semicolon.gossip.data.repositories;

import africa.semicolon.gossip.data.models.Post;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostRepository extends MongoRepository<Post,String> {

    Post findPostById(String id);

//    Post save(Post post);
//
//    Post findById(int id);
//
//    List<Post> findAll();
//
//    long count();
//
//    void delete(Post post);
//
//    void delete(int id);
}

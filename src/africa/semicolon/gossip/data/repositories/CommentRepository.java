package africa.semicolon.gossip.data.repositories;

import africa.semicolon.gossip.data.models.Comment;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface CommentRepository extends MongoRepository<Comment,String> {
//    Comment save(Comment comment);
//
//    List<Comment> findAll();
}

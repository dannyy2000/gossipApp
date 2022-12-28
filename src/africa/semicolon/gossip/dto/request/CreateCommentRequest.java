package africa.semicolon.gossip.dto.request;

import lombok.*;
@Data


public class CreateCommentRequest {

    private String postId;

    private String commenterName;

    private String comment;


}

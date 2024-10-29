package org.technischhols.TECHNIBOOK.Posts;

import lombok.Builder;
import lombok.Data;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Builder
@Document("Posts")
public class Post {
    @Id
    private String id;
    private String uuid;
    private String userId;
    private String content;

}

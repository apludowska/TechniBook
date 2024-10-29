package org.technischhols.TECHNIBOOK.Posts.API;
import lombok.Data;
@Data
public class CreatePostRequest {
    private String userId;
    private String content;
}
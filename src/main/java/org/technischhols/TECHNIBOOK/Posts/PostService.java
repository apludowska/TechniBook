package org.technischhols.TECHNIBOOK.Posts;
import org.springframework.stereotype.Service;
import org.technischhols.TECHNIBOOK.Posts.API.CreatePostRequest;
import java.util.Date;
import java.util.UUID;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class PostService {
    private final PostRepository postRepository;

    public Post createPost(CreatePostRequest createPostRequest) {
        Post newPost = Post.builder()
                .uuid(UUID.randomUUID().toString())
                .content(createPostRequest.getContent())
                .build();
        Post createdPost = postRepository.save(newPost);
        return createdPost;
    }

    public Post getPost(String uuid) {
        return postRepository.findByUuid(uuid);
    }
}
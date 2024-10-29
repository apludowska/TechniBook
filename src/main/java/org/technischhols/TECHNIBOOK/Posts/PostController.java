package org.technischhols.TECHNIBOOK.Posts;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import org.technischhols.TECHNIBOOK.Posts.API.CreatePostRequest;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/posts")
public class PostController {
    private final PostService postService;

    @PostMapping("")
    public Post createPost(@RequestBody CreatePostRequest createPostRequest) {
        return postService.createPost(createPostRequest);
    }

    @GetMapping("/{uuid}")
    public Post getPost(@PathVariable("uuid") String uuid) {
        return postService.getPost(uuid);
    }
}
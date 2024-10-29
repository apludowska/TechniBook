

package org.technischhols.TECHNIBOOK.Posts;


import org.springframework.data.mongodb.repository.MongoRepository;
public interface PostRepository extends MongoRepository<Post, String> {
    Post findByUuid(String uuid);
}
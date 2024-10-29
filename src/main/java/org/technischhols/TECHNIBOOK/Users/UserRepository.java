package org.technischhols.TECHNIBOOK.Users;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String> {
    User findByUuid(String uuid);
}

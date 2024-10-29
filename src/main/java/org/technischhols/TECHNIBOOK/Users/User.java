package org.technischhols.TECHNIBOOK.Users;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Data
@Builder
@Document("Users")
public class User {
    @Id
    private String id;
    private Date createDate;
    private Date updatedDate;
    private String uuid;
    private String email;
    private String password;

}
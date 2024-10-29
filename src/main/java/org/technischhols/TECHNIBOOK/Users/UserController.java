package org.technischhols.TECHNIBOOK.Users;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import org.technischhols.TECHNIBOOK.Users.API.CreateUserRequest;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/users")
public class UserController {
    private final UserService userService;

    @PostMapping("")
    public User createUsers(@RequestBody CreateUserRequest createUserRequest){
        return userService.createUser(createUserRequest);
    }

    @GetMapping("/{uuid}")
    public User getUser(@PathVariable("uuid") String uuid){
        return userService.getUser(uuid);
    }

}

package com.example.demo.controller;

import com.example.demo.dto.UserProfileDto;
import com.example.demo.service.UserProfileService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/user")
public class UserController {

    UserProfileService userProfileService;

    public UserController(UserProfileService userProfileService) {
        this.userProfileService = userProfileService;
    }

    @PostMapping
    public ResponseEntity<UserProfileDto> createUser(UserProfileDto userProfileDto){
        return new ResponseEntity<>(userProfileService.createProfile(userProfileDto), HttpStatus.CREATED);
    }

    @GetMapping("{id}")
    public ResponseEntity<UserProfileDto> getUser(@PathVariable Long id){
        return ResponseEntity.ok(userProfileService.getProfile(id));
    }

    @PutMapping("{id}")
    public ResponseEntity<UserProfileDto> addFriend(@PathVariable Long id,
                                                    Long friendId){
        return new ResponseEntity<>(userProfileService.addFriend(id, friendId), HttpStatus.ACCEPTED);
    }

}

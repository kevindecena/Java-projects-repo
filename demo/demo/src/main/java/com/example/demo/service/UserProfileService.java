package com.example.demo.service;

import com.example.demo.dto.UserProfileDto;

public interface UserProfileService {

    UserProfileDto createProfile(UserProfileDto userProfileDto);

    UserProfileDto getProfile(Long id);

    UserProfileDto addFriend(Long id, Long friendId);

}

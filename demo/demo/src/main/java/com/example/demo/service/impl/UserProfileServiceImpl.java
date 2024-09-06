package com.example.demo.service.impl;


import com.example.demo.dto.UserProfileDto;
import com.example.demo.entity.FriendProfile;
import com.example.demo.entity.UserProfile;
import com.example.demo.mapper.UserProfileMapper;
import com.example.demo.repository.FriendRepository;
import com.example.demo.repository.ProfileRepository;
import com.example.demo.service.UserProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserProfileServiceImpl implements UserProfileService {

    ProfileRepository profileRepository;
    FriendRepository friendRepository;

    @Autowired
    public UserProfileServiceImpl(ProfileRepository profileRepository, FriendRepository friendRepository) {
        this.profileRepository = profileRepository;
        this.friendRepository = friendRepository;
    }


    @Override
    public UserProfileDto createProfile(UserProfileDto userProfileDto) {
        UserProfile userProfile = UserProfileMapper.userMapper(userProfileDto);
        profileRepository.save(userProfile);
        return UserProfileMapper.userMapperToDto(userProfile);
    }

    @Override
    public UserProfileDto getProfile(Long id) {
        UserProfile userProfile = profileRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("No existing Profile"));

        return UserProfileMapper.userMapperToDto(userProfile);
    }

    @Override
    public UserProfileDto addFriend(Long id, Long friendId) {
        UserProfile userProfile = profileRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("No existing Profile"));

        FriendProfile friendProfile = friendRepository.findById(friendId)
                .orElseThrow(() -> new RuntimeException("No existing Profile"));

        userProfile.getFriendsList().add(friendProfile);

        profileRepository.save(userProfile);

        return null;
    }


}

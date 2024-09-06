package com.example.demo.mapper;

import com.example.demo.dto.FriendProfileDto;
import com.example.demo.dto.UserProfileDto;
import com.example.demo.entity.FriendProfile;
import com.example.demo.entity.UserProfile;

import java.util.List;
import java.util.stream.Collectors;

public class UserProfileMapper {

    public static UserProfileDto userMapperToDto(UserProfile userProfile){
        List<FriendProfileDto> friendProfileDtos = userProfile.getFriendsList().stream()
                .map(friendProfile -> new FriendProfileDto(friendProfile.getId(), friendProfile.getUsername()))
                .collect(Collectors.toList());


        UserProfileDto userProfileDto = new UserProfileDto(
                userProfile.getId(),
                userProfile.getUsername(),
                friendProfileDtos
        );
        return userProfileDto;
    }

    public static UserProfile userMapper(UserProfileDto userProfileDto){

        List<FriendProfile> friendProfiles = userProfileDto.getFriendsList().stream()
                .map(friendProfileDto -> new FriendProfile(friendProfileDto.getId(), friendProfileDto.getUsername()))
                .collect(Collectors.toList());

        UserProfile userProfile = new UserProfile(
          userProfileDto.getId(),
                userProfileDto.getUsername(),
                friendProfiles
        );
    return userProfile;
    }
}

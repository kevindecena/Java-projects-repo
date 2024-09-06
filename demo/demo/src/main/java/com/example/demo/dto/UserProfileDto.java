package com.example.demo.dto;

import com.example.demo.entity.FriendProfile;
import lombok.*;

import java.util.List;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserProfileDto {

    private Long id;
    private String username;
    private List<FriendProfileDto> friendsList;
}

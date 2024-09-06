package com.example.demo.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.util.List;



@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table
@Getter
@Setter
public class UserProfile {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String username;

//    @ElementCollection
//    @CollectionTable(name = "user_friends", joinColumns = @JoinColumn(name = "user_profile_id"))
//    @Column(name = "friend")
    @OneToMany
    private List<FriendProfile> friendsList;

}

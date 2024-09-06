package com.example.demo.repository;

import com.example.demo.entity.FriendProfile;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FriendRepository extends JpaRepository<FriendProfile, Long>{
}

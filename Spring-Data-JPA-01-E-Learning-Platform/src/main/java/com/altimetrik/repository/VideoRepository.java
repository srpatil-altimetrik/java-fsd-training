package com.altimetrik.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.altimetrik.model.Video;

public interface VideoRepository extends JpaRepository<Video, Integer> {

}

package com.InfoSpring.API.services.impl;

import com.InfoSpring.API.domain.Review;
import com.InfoSpring.API.repository.BaseRepository;
import com.InfoSpring.API.repository.ReviewRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;
@Service
@Slf4j
public class ReviewServiceImpl extends BaseServiceImpl<Review, UUID>{
    private ReviewRepository reviewRepository;

    @Autowired
    public ReviewServiceImpl(BaseRepository<Review, UUID> baseRepository) {
        super(baseRepository);
    }
}

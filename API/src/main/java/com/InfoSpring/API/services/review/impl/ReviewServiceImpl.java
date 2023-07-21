package com.InfoSpring.API.services.review.impl;

import com.InfoSpring.API.domain.Review;
import com.InfoSpring.API.mapper.review.impl.ReviewMapperImpl;
import com.InfoSpring.API.model.dto.review.ReviewDto;
import com.InfoSpring.API.repository.BaseRepository;
import com.InfoSpring.API.repository.ReviewRepository;
import com.InfoSpring.API.services.base.impl.BaseServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;
@Service
@Slf4j
public class ReviewServiceImpl extends BaseServiceImpl<Review, UUID, ReviewDto> {

    @Autowired
    private final ReviewRepository reviewRepository;

    @Autowired
    public ReviewServiceImpl(BaseRepository<Review, UUID> baseRepository, ReviewMapperImpl entityMapper, ReviewRepository reviewRepository) {
        super(baseRepository,entityMapper);
        this.reviewRepository = reviewRepository;
    }
}

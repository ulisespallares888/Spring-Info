package com.InfoSpring.API.mapper.review.impl;

import com.InfoSpring.API.domain.Review;
import com.InfoSpring.API.mapper.EntityMapper;
import com.InfoSpring.API.mapper.review.ReviewMapper;
import com.InfoSpring.API.model.dto.review.ReviewDto;
import org.springframework.stereotype.Component;

@Component
public class ReviewMapperImpl implements EntityMapper<Review, ReviewDto> , ReviewMapper {
    @Override
    public Review dtoToEntity(ReviewDto reviewDto) {
        return null;
    }

    @Override
    public ReviewDto entityToDto(Review entity) {
        return null;
    }
}

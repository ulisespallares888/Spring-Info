package com.InfoSpring.API.mapper.review.impl;

import com.InfoSpring.API.domain.Review;
import com.InfoSpring.API.mapper.mapperbase.impl.EntityMapperImpl;
import com.InfoSpring.API.mapper.review.ReviewMapper;
import com.InfoSpring.API.model.dto.DTO;
import com.InfoSpring.API.model.dto.review.ReviewDto;
import org.springframework.stereotype.Component;

@Component
public class ReviewMapperImpl extends EntityMapperImpl<Review, ReviewDto> implements ReviewMapper {
    @Override
    public Review dtoToEntity(ReviewDto reviewDto) {
        Review review = Review.builder()
                            .title(reviewDto.getTitle())
                            .nameBook(reviewDto.getNameBook())
                            .content(reviewDto.getContent())
                            .ratingEnum(reviewDto.getRatingEnum())
                            .creationDate(reviewDto.getCreationDate()).build();
        return review;
    }

    @Override
    public ReviewDto entityToDto(Review entity) {
        ReviewDto reviewDto = ReviewDto.builder()
                            .title(entity.getTitle())
                            .nameBook(entity.getNameBook())
                            .content(entity.getContent())
                            .ratingEnum(entity.getRatingEnum())
                            .creationDate(entity.getCreationDate()).build();
        return reviewDto;
    }
}

package com.InfoSpring.API.services.review;

import com.InfoSpring.API.domain.Review;
import com.InfoSpring.API.model.dto.review.ReviewDto;
import com.InfoSpring.API.services.base.BaseService;

import java.util.UUID;

public interface ReviewService extends BaseService<Review, UUID, ReviewDto> {
}

package com.InfoSpring.API.repository;

import com.InfoSpring.API.domain.Review;
import com.InfoSpring.API.model.dto.review.ReviewDto;
import org.springframework.stereotype.Repository;

import java.util.UUID;
@Repository
public interface ReviewRepository extends BaseRepository<Review, UUID>{

}

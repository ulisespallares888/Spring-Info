package com.InfoSpring.API.controllers.impl;

import com.InfoSpring.API.domain.Review;
import com.InfoSpring.API.mapper.mapperbase.impl.EntityMapperImpl;
import com.InfoSpring.API.mapper.review.ReviewMapper;
import com.InfoSpring.API.model.dto.DTO;
import com.InfoSpring.API.model.dto.review.ReviewDto;
import com.InfoSpring.API.services.review.impl.ReviewServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/review")
public class ReviewController extends BaseControllerImpl<Review, ReviewServiceImpl,ReviewDto> {

    @Autowired
    private final ReviewServiceImpl reviewService;

    @Autowired
    private ReviewMapper reviewMapper;

    @Autowired
    public ReviewController (ReviewServiceImpl reviewService, ReviewMapper reviewMapper){
        super(reviewService,  (EntityMapperImpl<Review, DTO>) reviewMapper);
        this.reviewService = reviewService;
    }

}

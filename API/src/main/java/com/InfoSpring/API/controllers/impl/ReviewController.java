package com.InfoSpring.API.controllers.impl;

import com.InfoSpring.API.domain.Review;
import com.InfoSpring.API.services.impl.ReviewServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/review")
public class ReviewController extends BaseControllerImpl<Review, ReviewServiceImpl> {

    ReviewServiceImpl reviewService;
    @Autowired
    public ReviewController (ReviewServiceImpl reviewService){
        this.reviewService = reviewService;
    }

}

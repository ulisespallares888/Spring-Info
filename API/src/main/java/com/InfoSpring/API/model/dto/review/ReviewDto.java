package com.InfoSpring.API.model.dto.review;

import com.InfoSpring.API.domain.enumeration.RatingEnum;
import com.InfoSpring.API.model.dto.DTO;
import lombok.*;


import java.time.LocalDate;
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@ToString
public class ReviewDto extends DTO {
    private String title;
    private String nameBook;
    private String content;
    private RatingEnum ratingEnum;
    private LocalDate creationDate;
}

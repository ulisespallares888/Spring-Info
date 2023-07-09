package com.InfoSpring.API.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;

import java.time.LocalDate;
import java.util.UUID;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "review")
public class Review extends BaseEntity{

    @Column(length = 100,nullable = false)
    private String title;
    @Column(length = 100,nullable = false)
    private String nameBook;
    @Column(nullable = false)
    private String content;
    @Column(nullable = false)
    private Integer score;
    @Column()
    private LocalDate creationDate;

    public static ReviewBuilder builder(){
        return new ReviewBuilder(new Review());
    }

    public static class ReviewBuilder{
        public Review review;

        public ReviewBuilder(Review review){
            this.review = review;
        }

        public Review.ReviewBuilder uuid(UUID uuid){
            this.review.setUuid(uuid);
            return this;
        }
    }

}

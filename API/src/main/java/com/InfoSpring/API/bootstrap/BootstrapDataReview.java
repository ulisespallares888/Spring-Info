package com.InfoSpring.API.bootstrap;


import com.InfoSpring.API.domain.Review;
import com.InfoSpring.API.model.ReviewRecordCsv;
import com.InfoSpring.API.repository.ReviewRepository;
import com.InfoSpring.API.services.csv.review.ReviewServiceCsv;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Component;
import org.springframework.util.ResourceUtils;

import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.UUID;


@RequiredArgsConstructor
@Slf4j
@Component
public class BootstrapDataReview implements CommandLineRunner {

    private final  ReviewServiceCsv reviewServiceCsv;
    private final  ReviewRepository reviewRepository;

    @Override
    public void run(String... args) throws Exception {
        log.info("Running BootstrapDataReview");

        loadReviewData();
    }


    private void loadReviewData() throws FileNotFoundException {

        if (reviewRepository.count() < 100){
            File file = ResourceUtils.getFile("classpath:csvdata/review_data.csv");
            log.info("antes de crear la lista");
            List<ReviewRecordCsv> reviewRecordCsvlist = reviewServiceCsv.convertCSV(file);
            log.info("despues de crear la lista");
            if (!reviewRecordCsvlist.isEmpty()){
                log.info("Loading database with reviews");
                for (ReviewRecordCsv ReviewRecordCsv: reviewRecordCsvlist) {
                    reviewRepository.save(
                                Review.builder()
                                .uuid(UUID.randomUUID())
                                .nameBook(ReviewRecordCsv.getNameBook())
                                .title(ReviewRecordCsv.getTitle())
                                .content(ReviewRecordCsv.getContent())
                                .score(ReviewRecordCsv.getScore())
                                .creationDate(ReviewRecordCsv.getCreationDate())
                                .build()
                    );
                }
            }
        }

    }


}

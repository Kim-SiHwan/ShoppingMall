package com.example.atelier.mapper;

import com.example.atelier.domain.Review;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface ReviewMapper {

    List<Review> selectReviewList(Long pid);

    void insertReview(Review review);

    void deleteReview(Long pid, Long rno);

}

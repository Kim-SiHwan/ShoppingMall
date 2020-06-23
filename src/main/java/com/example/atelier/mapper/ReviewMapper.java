package com.example.atelier.mapper;

import com.example.atelier.domain.Review;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("com.example.atelier.mapper.ReviewMapper")
public interface ReviewMapper {
    public List<Review> reviewList(Long pid);
    public void addReview(Review review);
    public void deleteReview(Long pid, Long rno);

}

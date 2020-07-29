package com.example.atelier.service;

import com.example.atelier.domain.Review;
import com.example.atelier.dto.ReviewRequestDto;
import com.example.atelier.mapper.ReviewMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ReviewService {
    private final ReviewMapper reviewMapper;

    public List<Review> selectReviewLists(Long pid) {
        System.out.println("servicelog"+pid);
        return reviewMapper.selectReviewList(pid);
    }

    public void insertReview(ReviewRequestDto requestDto) {
        reviewMapper.insertReview(requestDto.toEntity(requestDto));
    }

    public void deleteReview(Long pid, Long rno) {
        reviewMapper.deleteReview(pid,rno);
    }
}

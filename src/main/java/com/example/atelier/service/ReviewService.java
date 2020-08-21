package com.example.atelier.service;

import com.example.atelier.domain.Review;
import com.example.atelier.dto.ReviewRequestDto;
import com.example.atelier.mapper.ReviewMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Slf4j
@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class ReviewService {
    private final ReviewMapper reviewMapper;

    public List<Review> selectReviewLists(Long pid) {
        return reviewMapper.selectReviewList(pid);
    }

    @Transactional
    public void insertReview(ReviewRequestDto requestDto) {
        reviewMapper.insertReview(requestDto.toEntity(requestDto));
    }

    @Transactional
    public void deleteReview(Long pid, Long rno) {
        reviewMapper.deleteReview(pid,rno);
    }
}

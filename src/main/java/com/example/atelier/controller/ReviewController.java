package com.example.atelier.controller;

import com.example.atelier.domain.Review;
import com.example.atelier.dto.ReviewRequestDto;
import com.example.atelier.service.ReviewService;
import lombok.RequiredArgsConstructor;
import lombok.extern.java.Log;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@Slf4j
@RestController
@RequestMapping("/review/**")
@RequiredArgsConstructor
public class ReviewController {

    private final ReviewService reviewService;

    @GetMapping("/{pid}")
    public ResponseEntity<List<Review>> getAllReviews(@PathVariable("pid") Long pid) {
        return new ResponseEntity<>(getReviews(pid), HttpStatus.OK);
    }

    @PostMapping("/{pid}")
    public ResponseEntity insertReview(@PathVariable("pid") Long pid,
                                       @RequestBody ReviewRequestDto review) {
        reviewService.insertReview(review);
        return new ResponseEntity(getReviews(pid),HttpStatus.CREATED);
    }
    @DeleteMapping("/{pid}/{rno}")
    public ResponseEntity deleteReview (@PathVariable ("pid")Long pid,
                                       @PathVariable ("rno")Long rno) {
        reviewService.deleteReview(pid,rno);
        return new ResponseEntity(getAllReviews(pid),HttpStatus.OK);
    }

    public List<Review> getReviews(Long pid) {
        return reviewService.selectReviewLists(pid);
    }
}

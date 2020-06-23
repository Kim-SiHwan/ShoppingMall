package com.example.atelier.controller;

import com.example.atelier.domain.Review;
import com.example.atelier.dto.RequestDto;
import com.example.atelier.mapper.ReviewMapper;
import com.example.atelier.service.ReviewService;
import lombok.RequiredArgsConstructor;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Log
@RestController
@RequestMapping("/review/**")
@RequiredArgsConstructor
public class ReviewController {

    private final ReviewService reviewService;

    public List<Review> getReviews(Long pid)
    {
        return reviewService.reviewListService(pid);
    }

    @GetMapping("/{pid}")
    public ResponseEntity<List<Review>> getAllReviews(@PathVariable("pid") Long pid)
    {
        return new ResponseEntity<>(getReviews(pid), HttpStatus.OK);
    }

    @PostMapping("/{pid}")
    public ResponseEntity insertReview(@PathVariable("pid") Long pid,
                                       @RequestBody RequestDto review)
    {
        reviewService.reviewInsertService(review);
        return new ResponseEntity(getAllReviews(pid),HttpStatus.CREATED);
    }
    @DeleteMapping("/{pid}/{rno}")
    public ResponseEntity deleteReview (@PathVariable ("pid")Long pid,
                                       @PathVariable ("rno")Long rno)
    {
        reviewService.reviewDeleteService(pid,rno);
        return new ResponseEntity(getAllReviews(pid),HttpStatus.OK);
    }
}

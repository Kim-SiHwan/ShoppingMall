package com.example.atelier.service;

import com.example.atelier.domain.Review;
import com.example.atelier.dto.RequestDto;
import com.example.atelier.mapper.ReviewMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ReviewService {
    private final ReviewMapper reviewMapper;
    public List<Review> reviewListService(Long pid)
    {
        return reviewMapper.reviewList(pid);
    }

    public void reviewInsertService(RequestDto requestDto)
    {
        Review addReview = new Review();
        addReview.setPid(requestDto.getPid());
        addReview.setUid(requestDto.getUid());
        addReview.setContent(requestDto.getContent());
        addReview.setPoint(requestDto.getPoint());
        reviewMapper.addReview(addReview);
    }

    public void reviewDeleteService(Long pid, Long rno)
    {
        reviewMapper.deleteReview(pid,rno);
    }
}

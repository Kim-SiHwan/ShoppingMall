package com.example.atelier.service;

import com.example.atelier.domain.Bucket;
import com.example.atelier.dto.CartRequestDto;
import com.example.atelier.mapper.BucketMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CartService {

    private final BucketMapper bucketMapper;

    public List<Bucket> bucketListService(String uid) {
        return bucketMapper.bucketList(uid);
    }

    public void bucketAddService(CartRequestDto requestDto) {
        bucketMapper.addBucket(requestDto.toEntity(requestDto));
    }
}

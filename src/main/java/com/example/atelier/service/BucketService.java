package com.example.atelier.service;

import com.example.atelier.domain.Bucket;
import com.example.atelier.dto.RequestDto;
import com.example.atelier.mapper.BucketMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BucketService {

    private final BucketMapper bucketMapper;

    public List<Bucket> bucketListService(String uid)
    {
        return bucketMapper.bucketList(uid);
    }

    public void bucketAddService(RequestDto requestDto)
    {

        Bucket bucket=new Bucket();
        bucket.setPid(requestDto.getPid());
        bucket.setUid(requestDto.getUid());
        bucket.setQuantity(requestDto.getQuantity());
        bucket.setTotalPrice(requestDto.getTotalPrice());
        bucket.setBucketUrl(requestDto.getBucketUrl());
        bucketMapper.addBucket(bucket);
    }
}

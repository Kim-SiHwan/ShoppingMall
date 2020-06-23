package com.example.atelier.mapper;

import com.example.atelier.domain.Bucket;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("com.example.atelier.mapper.BucketMapper")
public interface BucketMapper {

    public int addBucket(Bucket bucket);

    public List<Bucket> bucketList(String uid);
}

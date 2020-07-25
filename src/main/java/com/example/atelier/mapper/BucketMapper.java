package com.example.atelier.mapper;

import com.example.atelier.domain.Bucket;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BucketMapper {

    int addBucket(Bucket bucket);

    List<Bucket> bucketList(String uid);
}

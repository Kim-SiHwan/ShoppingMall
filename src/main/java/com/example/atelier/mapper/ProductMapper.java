package com.example.atelier.mapper;

import com.example.atelier.domain.Bucket;
import com.example.atelier.domain.Product;
import com.example.atelier.dto.PageVo;
import com.example.atelier.dto.RequestDto;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("com.example.atelier.mapper.ProductMapper")
public interface ProductMapper {
    public int productCount(String productType);

    public List<Product> productList(PageVo pageVo);

    public int productInsert(Product product);

    public Product productDetail(Long productId);

    public List<Product> typeList(String productType);

}

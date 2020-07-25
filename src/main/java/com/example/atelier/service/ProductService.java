package com.example.atelier.service;

import com.example.atelier.domain.Product;
import com.example.atelier.dto.PageVo;
import com.example.atelier.dto.ProductRequestDto;
import com.example.atelier.mapper.ProductMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class ProductService {

    private final ProductMapper productMapper;

    public int countProduct(String productType) {
        return productMapper.countProduct(productType);
    }

    public List<Product> selectProductList(PageVo pageVo) {
        return productMapper.selectProductList(pageVo);
    }

    @Transactional
    public void insertProduct(ProductRequestDto requestDto) {
        productMapper.insertProduct(requestDto.toEntity(requestDto));
    }

    public Product selectProductDetail(Long pid) {
        return productMapper.selectProductDetail(pid);
    }

    public List<Product> selectProductTypeList(String productType) {
        return productMapper.selectProductTypeList(productType);
    }

}

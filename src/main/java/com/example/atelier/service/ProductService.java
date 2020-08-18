package com.example.atelier.service;

import com.example.atelier.domain.Product;
import com.example.atelier.domain.Qna;
import com.example.atelier.dto.PageVo;
import com.example.atelier.dto.ProductRequestDto;
import com.example.atelier.mapper.ProductMapper;
import com.example.atelier.mapper.QnaMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class ProductService {

    private final ProductMapper productMapper;
    private final QnaMapper qnaMapper;

    public int countQna(Long pid){return qnaMapper.qnaCount(pid);}

    public int countReview(Long pid){return productMapper.countReview(pid);}

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

    public int countOrderList(){
        return productMapper.countOrderList();
    }

    public int needAnswerCount(){
        return qnaMapper.needAnswerCount();
    }

}

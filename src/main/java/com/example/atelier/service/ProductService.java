package com.example.atelier.service;

import com.example.atelier.domain.Product;
import com.example.atelier.dto.PageVo;
import com.example.atelier.dto.RequestDto;
import com.example.atelier.mapper.ProductMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductService {
    private final ProductMapper productMapper;

    public int productCountService(String productType)
    {
        return productMapper.productCount(productType);
    }
    public List<Product> productListService(PageVo pageVo)
    {
        return productMapper.productList(pageVo);
    }
    public void productInsertService(RequestDto requestDto)
    {

        Product product=new Product();

        product.setProductContent(requestDto.getProductContent());
        product.setProductTitle(requestDto.getProductTitle());
        product.setProductPrice(requestDto.getProductPrice());
        product.setProductType(requestDto.getProductType());
        productMapper.productInsert(product);
    }
    public Product productDetailService(Long pid)
    {
        return productMapper.productDetail(pid);
    }
    public List<Product> typeListService(String productType) { return productMapper.typeList(productType);}

}

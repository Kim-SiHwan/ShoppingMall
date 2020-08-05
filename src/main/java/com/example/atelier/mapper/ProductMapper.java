package com.example.atelier.mapper;

import com.example.atelier.domain.Product;
import com.example.atelier.dto.PageVo;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductMapper {

   int countProduct(String productType);

   List<Product> selectProductList(PageVo pageVo);

   int insertProduct(Product product);

   Product selectProductDetail(Long productId);

   List<Product> selectProductTypeList(String productType);

   int countOrderList();

}

package com.example.atelier.controller;

import com.example.atelier.dto.PageVo;
import com.example.atelier.dto.RequestDto;
import com.example.atelier.service.ProductService;
import lombok.RequiredArgsConstructor;
import lombok.extern.java.Log;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Log
@Controller
@RequiredArgsConstructor
@RequestMapping("/shop")
public class ProductController {

    private final ProductService productService;

    @GetMapping("/main")
    public void productList(Model model, PageVo pageVo)
    {
        model.addAttribute("pageVo",pageVo);
    }

    @ResponseBody
    @PostMapping("/imgList")
    public ResponseEntity imgList(@RequestBody PageVo pageVo)
    {
        return new ResponseEntity<>(productService.productListService(pageVo),HttpStatus.OK);
    }

    @GetMapping("/addProduct")
    public String addProductForm()
    {
        return "shop/addProduct";
    }
    @PostMapping("/addProduct")
    public String addProduct(RequestDto requestDto)
    {
        productService.productInsertService(requestDto);
        return "redirect:/shop/main";
    }
    @GetMapping("/view")
    public void productDetail(Long pid, Model model)
    {
        model.addAttribute("view",productService.productDetailService(pid));
    }

    @GetMapping("/type")
    public String productTypeList(String productType, Model model)
    {
        model.addAttribute("count",productService.productCountService(productType));
        model.addAttribute("list",productService.typeListService(productType));
        return "shop/type";
    }


}

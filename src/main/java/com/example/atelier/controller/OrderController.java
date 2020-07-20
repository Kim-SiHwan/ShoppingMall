package com.example.atelier.controller;

import com.example.atelier.domain.Order;
import com.example.atelier.dto.RequestDto;
import com.example.atelier.mapper.OrderMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.security.Principal;

@Slf4j
@Controller
@RequiredArgsConstructor
@RequestMapping("/shop")
public class OrderController {

    @Autowired
    OrderMapper orderMapper;
    @PostMapping("/order_form")
    public void orderForm(RequestDto requestDto, Model model, Principal principal)
    {
        model.addAttribute("buyer",orderMapper.getUserInfo(principal.getName()));
        log.info("이름 "+principal.getName());
        model.addAttribute("productInfo",orderMapper.getProductInfo(requestDto.getPid()));
        log.info("pid "+requestDto.getPid());
    }
    @GetMapping("/order")
    public String orderSubmit(RequestDto requestDto)
    {
        Order order= new Order();
        order.setOrderAddress(requestDto.getOrderAddress());
        order.setOrderPrice(requestDto.getTotalPrice());
        order.setOrderState(requestDto.getOrderState());
        order.setPid(requestDto.getPid());
        order.setUid(requestDto.getUid());
        orderMapper.orderInput(order);
        return "redirect:/shop/main";
    }

}

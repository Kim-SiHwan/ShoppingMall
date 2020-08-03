package com.example.atelier.controller;

import com.example.atelier.dto.OrderRequestDto;
import com.example.atelier.service.OrderService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.security.Principal;

@Slf4j
@Controller
@RequiredArgsConstructor
@RequestMapping("/shop")
public class OrderController {

    private final OrderService orderService;

    @PostMapping("/order_form")
    public void orderForm(OrderRequestDto requestDto, Model model, Principal principal) {
        model.addAttribute("buyer",orderService.getUserInfo(principal.getName()));
        model.addAttribute("productInfo",orderService.getProductInfo(requestDto.getOid()));
        model.addAttribute("orderPrice",requestDto.getOrderPrice());
        //현재 장바구니의 전체구매 상태 막혀있음. 해결해야함
    }

    @PostMapping("/order")
    public String orderSubmit(OrderRequestDto requestDto) {
        orderService.orderInput(requestDto.getOid(),requestDto.getUid(),requestDto.getOrderAddress(),requestDto.getOrderPrice2());
        return "redirect:/shop/main";
    }

    @DeleteMapping("/del_order")
    public String orderDelete(OrderRequestDto requestDto){
        orderService.deleteOrder(requestDto.getOno());
        return "redirect:/shop/my_page";
    }

}

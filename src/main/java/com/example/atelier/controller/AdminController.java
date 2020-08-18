package com.example.atelier.controller;

import com.example.atelier.dto.OrderRequestDto;
import com.example.atelier.dto.QnaRequestDto;
import com.example.atelier.service.AdminService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
@RequiredArgsConstructor
@RequestMapping("/shop")
public class AdminController {
    private final AdminService adminService;

    @GetMapping("/admin_order_confirm")
    public void getOrderList(Model model){
        model.addAttribute("list",adminService.orderList());
    }

    @GetMapping("/admin_answer")
    public void getQnaList(Model model){
        model.addAttribute("list",adminService.qnaList());
    }

    @PutMapping("/confirm_order")
    public String confirmOrder(OrderRequestDto requestDto){
        adminService.updateOrderState(requestDto.getOnoList());
        return "redirect:/shop/admin_order_confirm";
    }

    @PutMapping("/submit_answer")
    public String updateAnswer(QnaRequestDto requestDto){
        adminService.updateAnswer(requestDto);
        return "redirect:/shop/admin_answer" ;
    }




}

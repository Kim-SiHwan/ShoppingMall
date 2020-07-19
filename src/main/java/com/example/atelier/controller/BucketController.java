package com.example.atelier.controller;

import com.example.atelier.dto.RequestDto;
import com.example.atelier.service.CartService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
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
public class BucketController {

    private final CartService cartService;

    @GetMapping("/bucket")
    public void bucketHome(Model model, Principal principal)
    {
        model.addAttribute("bucketList", cartService.bucketListService(principal.getName()));
    }
    @PostMapping("/bucket")
    public String bucketInsert(RequestDto requestDto)
    {
        cartService.bucketAddService(requestDto);
        return "redirect:/shop/main";
    }
}

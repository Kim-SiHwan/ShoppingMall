package com.example.atelier.controller;

import com.example.atelier.dto.CartRequestDto;
import com.example.atelier.service.CartService;
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
public class CartController {

    private final CartService cartService;

    @GetMapping("/cart")
    public void cartHome(Model model, Principal principal) {
        model.addAttribute("cartList", cartService.cartList(principal.getName()));
    }

    @PostMapping("/cart")
    public String cartInsert(CartRequestDto requestDto) {
        cartService.addCart(requestDto);
        return "redirect:/shop/main";
    }

    @GetMapping("/delCart")
    public String cartDelete(CartRequestDto requestDto){
        cartService.deleteCart(requestDto);
        return "redirect:/shop/cart";
    }
}

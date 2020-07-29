package com.example.atelier.controller;

import com.example.atelier.service.MyPageService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import java.security.Principal;

@Slf4j
@Controller
@RequiredArgsConstructor
@RequestMapping("/shop")
public class MyPageController {

    private final MyPageService myPageService;

    @GetMapping("/my_page")
    public void myPage()
    {

    }
    @GetMapping("/order_page")
    public void showUserInfo(Model model, Principal principal) {
        model.addAttribute("info", myPageService.viewUserInfoService(principal.getName()));
        model.addAttribute("oinfo",myPageService.viewOrderInfoService(principal.getName()));
    }
}

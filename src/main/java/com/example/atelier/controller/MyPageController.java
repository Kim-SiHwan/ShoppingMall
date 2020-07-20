package com.example.atelier.controller;

import com.example.atelier.mapper.MyPageMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.security.Principal;

@Slf4j
@Controller
@RequiredArgsConstructor
@RequestMapping("/shop")
public class MyPageController {

    @Autowired
    MyPageMapper mp;
    @GetMapping("/my_page")
    public void showUserInfo(Model model, Principal principal)
    {
        model.addAttribute("info",mp.viewUserInfo(principal.getName()));
        model.addAttribute("oinfo",mp.viewOrderInfo(principal.getName()));
    }
}

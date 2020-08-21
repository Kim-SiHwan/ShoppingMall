package com.example.atelier.controller;

import com.example.atelier.dto.MemberRequestDto;
import com.example.atelier.service.MemberService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
@RequiredArgsConstructor
@RequestMapping("/shop")
public class MemberController {
    private final MemberService memberService;

    @GetMapping("/join")
    public void joinForm(){}

    @PostMapping("/join")
    public String join(MemberRequestDto requestDto){
        memberService.join(requestDto);
        return "redirect:/shop/main";
    }




}

package com.example.atelier.controller;

import com.example.atelier.domain.Bucket;
import com.example.atelier.domain.Member;
import com.example.atelier.dto.RequestDto;
import com.example.atelier.service.BucketService;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.security.Principal;


@Log
@Controller
@RequiredArgsConstructor
@RequestMapping("/shop")
public class BucketController {

    private final BucketService bucketService;

    @GetMapping("/bucket")
    public void bucketHome(Model model, Principal principal)
    {
        model.addAttribute("bucketList",bucketService.bucketListService(principal.getName()));
    }
    @PostMapping("/bucket")
    public String bucketInsert(RequestDto requestDto)
    {
        bucketService.bucketAddService(requestDto);
        return "redirect:/shop/main";
    }
}

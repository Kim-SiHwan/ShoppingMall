package com.example.atelier.controller;

import com.example.atelier.domain.Qna;
import com.example.atelier.dto.QnaRequestDto;
import com.example.atelier.service.QnaService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/qna/**")
public class QnaController {
    private final QnaService qnaService;

    @GetMapping("/{pid}")
    public ResponseEntity<List<Qna>> getAllQna(@PathVariable("pid") Long pid) {
        return new ResponseEntity<>(getQna(pid), HttpStatus.OK);
    }
    @PostMapping("/{pid}")
    public ResponseEntity<List<Qna>> insertQna(@PathVariable("pid") Long pid,
                                               @RequestBody QnaRequestDto requestDto){
        qnaService.insertQna(requestDto);
        return new ResponseEntity<>(getQna(pid),HttpStatus.CREATED);
    }

    public List<Qna> getQna(Long pid) {
        return qnaService.qnaList(pid);
    }

}

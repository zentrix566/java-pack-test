package com.fengqiao.controller;

import com.fengqiao.entity.Quote;
import com.fengqiao.service.QuoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/quotes")
public class QuoteController {

    @Autowired
    private QuoteService quoteService;

    @GetMapping("/random")
    public Quote getRandom() {
        // 调用业务层获取数据
        return quoteService.getRandomQuote();
    }
}
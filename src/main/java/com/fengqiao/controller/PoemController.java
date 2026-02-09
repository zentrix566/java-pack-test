package com.fengqiao.controller;
import com.fengqiao.entity.Poem;
import com.fengqiao.entity.Quote;
import com.fengqiao.service.PoemService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/poems")

public class PoemController {
    @Autowired
    private PoemService poemService;

    @GetMapping("/random")
    public Poem getRandom() {
        // 调用业务层获取数据
        return poemService.getRandomPoem();
    }
}

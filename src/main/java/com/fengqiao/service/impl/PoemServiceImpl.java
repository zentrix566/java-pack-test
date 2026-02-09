package com.fengqiao.service.impl;

import com.fengqiao.entity.Poem;
import com.fengqiao.repository.PoemRepository;
import com.fengqiao.repository.QuoteRepository;
import com.fengqiao.service.PoemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PoemServiceImpl implements PoemService {
    @Autowired
    private PoemRepository poemRepository;

    @Override
    public Poem getRandomPoem() {
        return poemRepository.findRandomOne();
    }
}

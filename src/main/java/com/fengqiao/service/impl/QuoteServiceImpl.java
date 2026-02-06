package com.fengqiao.service.impl;

import com.fengqiao.entity.Quote;
import com.fengqiao.repository.QuoteRepository;
import com.fengqiao.service.QuoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class QuoteServiceImpl implements QuoteService {

    @Autowired
    private QuoteRepository quoteRepository;

    @Override
    public Quote getRandomQuote() {
        return quoteRepository.findRandomOne();
    }
}
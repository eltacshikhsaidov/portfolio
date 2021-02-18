package me.eltacshikhsaidov.portfolio.service;

import org.springframework.stereotype.Service;

@Service
public class CountService {

    private static int countVisitor = 0;

    public synchronized int incerement() {
        countVisitor ++;
        return countVisitor;
    }
}

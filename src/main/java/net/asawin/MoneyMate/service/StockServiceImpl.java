package net.asawin.MoneyMate.service;

import net.asawin.MoneyMate.model.Stock;
import net.asawin.MoneyMate.repository.StockRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class StockServiceImpl implements StockService {

    @Autowired
    private StockRepository stockRepository;

    public List<Stock> findAllStocks(){
        return stockRepository.findAll();
    }
}

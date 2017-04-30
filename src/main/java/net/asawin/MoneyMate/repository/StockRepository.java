package net.asawin.MoneyMate.repository;

import net.asawin.MoneyMate.model.Stock;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StockRepository extends JpaRepository<Stock, String> {

    Stock findStockBySymbol(String symbol);
}

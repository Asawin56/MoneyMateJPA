package net.asawin.MoneyMate;

import net.asawin.MoneyMate.model.Stock;
import net.asawin.MoneyMate.repository.StockRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class MainController {

    @Autowired
    private StockRepository stockRepository;

    @RequestMapping(value = {"/", "/home"}, method = RequestMethod.GET)
    public String home() {
        return "home";
    }

    @RequestMapping(value={ "/listStocks" }, method = RequestMethod.GET)
    public String listStocks(Model model) {
        List<Stock> stockList = stockRepository.findAll();
        model.addAttribute("stockList", stockList);
        return ("listStocks");
    }

    @RequestMapping(value={ "/newStock" }, method = RequestMethod.GET)
    public String newStock( ) {
        return ("stockForm");
    }

}

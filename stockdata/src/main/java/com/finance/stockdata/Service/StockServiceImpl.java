package com.finance.stockdata.Service;

import com.finance.stockdata.DTO.StockDto;
import org.springframework.stereotype.Service;
import yahoofinance.Stock;
import yahoofinance.YahooFinance;

import java.io.IOException;

/**
 * @author Wayne Sidney
 * Created on {27/03/2022}
 */

@Service
public class StockServiceImpl implements StockService{
    @Override
    public StockDto getStock(String stockName) throws IOException {

        StockDto dto = null;
        Stock stock = YahooFinance.get(stockName);
        dto = new StockDto(stock.getName(), stock.getQuote().getPrice(), stock.getQuote().getChange(), stock.getCurrency(), stock.getQuote().getBid());
        return dto;
    }


}

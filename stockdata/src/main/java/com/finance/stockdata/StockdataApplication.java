package com.finance.stockdata;

import com.finance.stockdata.DTO.StockDto;
import com.finance.stockdata.Service.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import yahoofinance.Stock;
import yahoofinance.YahooFinance;

import java.io.IOException;

@SpringBootApplication
public class StockdataApplication {

	public static StockDto getStock(String stockName) throws IOException {

		StockDto dto = null;
		Stock stock = YahooFinance.get(stockName);
		dto = new StockDto(stock.getName(), stock.getQuote().getPrice(), stock.getQuote().getChange(), stock.getCurrency(), stock.getQuote().getBid());
		return dto;

	}



	public static void main(String[] args) throws IOException {


		SpringApplication.run(StockdataApplication.class, args);
		System.out.println(getStock("GOOG").getPrice());



	}

}

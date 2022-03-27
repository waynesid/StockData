package com.finance.stockdata.Service;

import com.finance.stockdata.DTO.StockDto;

import java.io.IOException;

/**
 * @author Wayne Sidney
 * Created on {27/03/2022}
 */
public interface StockService {
     public StockDto getStock (String stockName )throws IOException;
}

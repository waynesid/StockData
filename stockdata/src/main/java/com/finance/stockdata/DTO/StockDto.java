package com.finance.stockdata.DTO;

import lombok.*;

import java.math.BigDecimal;

/**
 * @author Wayne Sidney
 * Created on {27/03/2022}
 */

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class StockDto {
    private String name;
    private BigDecimal price;
    private BigDecimal change;
    private String currency;
    private BigDecimal bid;
}

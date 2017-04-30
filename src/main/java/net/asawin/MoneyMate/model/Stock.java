package net.asawin.MoneyMate.model;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Date;

@Entity
@Table(name = "stock")
public class Stock {
    private String symbol;
    private String marketId;
    private BigDecimal lastPrice;
    private BigDecimal targetBuy;
    private BigDecimal targetSell;
    private BigDecimal parValue;
    private Date statisticDate;
    private BigDecimal highestPrice6Monthes;
    private BigDecimal lowestPrice6Monthes;
    private BigDecimal highestPrice1Year;
    private BigDecimal lowestPrice1Year;
    private BigDecimal highestPrice2Years;
    private BigDecimal lowestPrice2Years;
    private BigDecimal priceEarningRatio;
    private BigDecimal earningPerShare;
    private BigDecimal priceBookValueRatio;
    private BigDecimal dividendYield;
    private BigDecimal dividendPerShare;
    private Integer stockDividend;
    private Double listedShares;
    private BigDecimal marketCap;

    @Id
    @Column(name = "symbol")
    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    @Basic
    @Column(name = "market_id")
    public String getMarketId() {
        return marketId;
    }

    public void setMarketId(String marketId) {
        this.marketId = marketId;
    }

    @Basic
    @Column(name = "last_price")
    public BigDecimal getLastPrice() {
        return lastPrice;
    }

    public void setLastPrice(BigDecimal lastPrice) {
        this.lastPrice = lastPrice;
    }

    @Basic
    @Column(name = "target_buy")
    public BigDecimal getTargetBuy() {
        return targetBuy;
    }

    public void setTargetBuy(BigDecimal targetBuy) {
        this.targetBuy = targetBuy;
    }

    @Basic
    @Column(name = "target_sell")
    public BigDecimal getTargetSell() {
        return targetSell;
    }

    public void setTargetSell(BigDecimal targetSell) {
        this.targetSell = targetSell;
    }

    @Basic
    @Column(name = "par_value")
    public BigDecimal getParValue() {
        return parValue;
    }

    public void setParValue(BigDecimal parValue) {
        this.parValue = parValue;
    }

    @Basic
    @Column(name = "statistic_date")
    public Date getStatisticDate() {
        return statisticDate;
    }

    public void setStatisticDate(Date statisticDate) {
        this.statisticDate = statisticDate;
    }

    @Basic
    @Column(name = "highest_price_6_monthes")
    public BigDecimal getHighestPrice6Monthes() {
        return highestPrice6Monthes;
    }

    public void setHighestPrice6Monthes(BigDecimal highestPrice6Monthes) {
        this.highestPrice6Monthes = highestPrice6Monthes;
    }

    @Basic
    @Column(name = "lowest_price_6_monthes")
    public BigDecimal getLowestPrice6Monthes() {
        return lowestPrice6Monthes;
    }

    public void setLowestPrice6Monthes(BigDecimal lowestPrice6Monthes) {
        this.lowestPrice6Monthes = lowestPrice6Monthes;
    }

    @Basic
    @Column(name = "highest_price_1_year")
    public BigDecimal getHighestPrice1Year() {
        return highestPrice1Year;
    }

    public void setHighestPrice1Year(BigDecimal highestPrice1Year) {
        this.highestPrice1Year = highestPrice1Year;
    }

    @Basic
    @Column(name = "lowest_price_1_year")
    public BigDecimal getLowestPrice1Year() {
        return lowestPrice1Year;
    }

    public void setLowestPrice1Year(BigDecimal lowestPrice1Year) {
        this.lowestPrice1Year = lowestPrice1Year;
    }

    @Basic
    @Column(name = "highest_price_2_years")
    public BigDecimal getHighestPrice2Years() {
        return highestPrice2Years;
    }

    public void setHighestPrice2Years(BigDecimal highestPrice2Years) {
        this.highestPrice2Years = highestPrice2Years;
    }

    @Basic
    @Column(name = "lowest_price_2_years")
    public BigDecimal getLowestPrice2Years() {
        return lowestPrice2Years;
    }

    public void setLowestPrice2Years(BigDecimal lowestPrice2Years) {
        this.lowestPrice2Years = lowestPrice2Years;
    }

    @Basic
    @Column(name = "price_earning_ratio")
    public BigDecimal getPriceEarningRatio() {
        return priceEarningRatio;
    }

    public void setPriceEarningRatio(BigDecimal priceEarningRatio) {
        this.priceEarningRatio = priceEarningRatio;
    }

    @Basic
    @Column(name = "earning_per_share")
    public BigDecimal getEarningPerShare() {
        return earningPerShare;
    }

    public void setEarningPerShare(BigDecimal earningPerShare) {
        this.earningPerShare = earningPerShare;
    }

    @Basic
    @Column(name = "price_book_value_ratio")
    public BigDecimal getPriceBookValueRatio() {
        return priceBookValueRatio;
    }

    public void setPriceBookValueRatio(BigDecimal priceBookValueRatio) {
        this.priceBookValueRatio = priceBookValueRatio;
    }

    @Basic
    @Column(name = "dividend_yield")
    public BigDecimal getDividendYield() {
        return dividendYield;
    }

    public void setDividendYield(BigDecimal dividendYield) {
        this.dividendYield = dividendYield;
    }

    @Basic
    @Column(name = "dividend_per_share")
    public BigDecimal getDividendPerShare() {
        return dividendPerShare;
    }

    public void setDividendPerShare(BigDecimal dividendPerShare) {
        this.dividendPerShare = dividendPerShare;
    }

    @Basic
    @Column(name = "stock_dividend")
    public Integer getStockDividend() {
        return stockDividend;
    }

    public void setStockDividend(Integer stockDividend) {
        this.stockDividend = stockDividend;
    }

    @Basic
    @Column(name = "listed_shares")
    public Double getListedShares() {
        return listedShares;
    }

    public void setListedShares(Double listedShares) {
        this.listedShares = listedShares;
    }

    @Basic
    @Column(name = "market_cap")
    public BigDecimal getMarketCap() {
        return marketCap;
    }

    public void setMarketCap(BigDecimal marketCap) {
        this.marketCap = marketCap;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Stock stock = (Stock) o;

        if (symbol != null ? !symbol.equals(stock.symbol) : stock.symbol != null) return false;
        if (marketId != null ? !marketId.equals(stock.marketId) : stock.marketId != null) return false;
        if (lastPrice != null ? !lastPrice.equals(stock.lastPrice) : stock.lastPrice != null) return false;
        if (targetBuy != null ? !targetBuy.equals(stock.targetBuy) : stock.targetBuy != null) return false;
        if (targetSell != null ? !targetSell.equals(stock.targetSell) : stock.targetSell != null) return false;
        if (parValue != null ? !parValue.equals(stock.parValue) : stock.parValue != null) return false;
        if (statisticDate != null ? !statisticDate.equals(stock.statisticDate) : stock.statisticDate != null)
            return false;
        if (highestPrice6Monthes != null ? !highestPrice6Monthes.equals(stock.highestPrice6Monthes) : stock.highestPrice6Monthes != null)
            return false;
        if (lowestPrice6Monthes != null ? !lowestPrice6Monthes.equals(stock.lowestPrice6Monthes) : stock.lowestPrice6Monthes != null)
            return false;
        if (highestPrice1Year != null ? !highestPrice1Year.equals(stock.highestPrice1Year) : stock.highestPrice1Year != null)
            return false;
        if (lowestPrice1Year != null ? !lowestPrice1Year.equals(stock.lowestPrice1Year) : stock.lowestPrice1Year != null)
            return false;
        if (highestPrice2Years != null ? !highestPrice2Years.equals(stock.highestPrice2Years) : stock.highestPrice2Years != null)
            return false;
        if (lowestPrice2Years != null ? !lowestPrice2Years.equals(stock.lowestPrice2Years) : stock.lowestPrice2Years != null)
            return false;
        if (priceEarningRatio != null ? !priceEarningRatio.equals(stock.priceEarningRatio) : stock.priceEarningRatio != null)
            return false;
        if (earningPerShare != null ? !earningPerShare.equals(stock.earningPerShare) : stock.earningPerShare != null)
            return false;
        if (priceBookValueRatio != null ? !priceBookValueRatio.equals(stock.priceBookValueRatio) : stock.priceBookValueRatio != null)
            return false;
        if (dividendYield != null ? !dividendYield.equals(stock.dividendYield) : stock.dividendYield != null)
            return false;
        if (dividendPerShare != null ? !dividendPerShare.equals(stock.dividendPerShare) : stock.dividendPerShare != null)
            return false;
        if (stockDividend != null ? !stockDividend.equals(stock.stockDividend) : stock.stockDividend != null)
            return false;
        if (listedShares != null ? !listedShares.equals(stock.listedShares) : stock.listedShares != null) return false;
        if (marketCap != null ? !marketCap.equals(stock.marketCap) : stock.marketCap != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = symbol != null ? symbol.hashCode() : 0;
        result = 31 * result + (marketId != null ? marketId.hashCode() : 0);
        result = 31 * result + (lastPrice != null ? lastPrice.hashCode() : 0);
        result = 31 * result + (targetBuy != null ? targetBuy.hashCode() : 0);
        result = 31 * result + (targetSell != null ? targetSell.hashCode() : 0);
        result = 31 * result + (parValue != null ? parValue.hashCode() : 0);
        result = 31 * result + (statisticDate != null ? statisticDate.hashCode() : 0);
        result = 31 * result + (highestPrice6Monthes != null ? highestPrice6Monthes.hashCode() : 0);
        result = 31 * result + (lowestPrice6Monthes != null ? lowestPrice6Monthes.hashCode() : 0);
        result = 31 * result + (highestPrice1Year != null ? highestPrice1Year.hashCode() : 0);
        result = 31 * result + (lowestPrice1Year != null ? lowestPrice1Year.hashCode() : 0);
        result = 31 * result + (highestPrice2Years != null ? highestPrice2Years.hashCode() : 0);
        result = 31 * result + (lowestPrice2Years != null ? lowestPrice2Years.hashCode() : 0);
        result = 31 * result + (priceEarningRatio != null ? priceEarningRatio.hashCode() : 0);
        result = 31 * result + (earningPerShare != null ? earningPerShare.hashCode() : 0);
        result = 31 * result + (priceBookValueRatio != null ? priceBookValueRatio.hashCode() : 0);
        result = 31 * result + (dividendYield != null ? dividendYield.hashCode() : 0);
        result = 31 * result + (dividendPerShare != null ? dividendPerShare.hashCode() : 0);
        result = 31 * result + (stockDividend != null ? stockDividend.hashCode() : 0);
        result = 31 * result + (listedShares != null ? listedShares.hashCode() : 0);
        result = 31 * result + (marketCap != null ? marketCap.hashCode() : 0);
        return result;
    }

    @Override
    public String toString(){
        return "Stock [Symbol: " + symbol +
                ", Market: " + marketId +
                ", Last Price: " + lastPrice +
                "]";
    }
}

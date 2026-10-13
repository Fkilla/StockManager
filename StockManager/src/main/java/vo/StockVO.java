
package vo;

public class StockVO {

    private String stockCode;
    private String stockName;
    private String market;
    private long closePrice;
    private long changePrice;
    private double changeRate;
    private long volume;

    public String getStockCode() {
        return stockCode;
    }

    public void setStockCode(String stockCode) {
        this.stockCode = stockCode;
    }

    public String getStockName() {
        return stockName;
    }

    public void setStockName(String stockName) {
        this.stockName = stockName;
    }

    public String getMarket() {
        return market;
    }

    public void setMarket(String market) {
        this.market = market;
    }

    public long getClosePrice() {
        return closePrice;
    }

    public void setClosePrice(long closePrice) {
        this.closePrice = closePrice;
    }

    public long getChangePrice() {
        return changePrice;
    }

    public void setChangePrice(long changePrice) {
        this.changePrice = changePrice;
    }

    public double getChangeRate() {
        return changeRate;
    }

    public void setChangeRate(double changeRate) {
        this.changeRate = changeRate;
    }

    public long getVolume() {
        return volume;
    }

    public void setVolume(long volume) {
        this.volume = volume;
    }

}
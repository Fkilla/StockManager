# StockManager
2026-10 assignment


DB Info
- MySql

```
CREATE TABLE stock (
    stock_code      VARCHAR(20) PRIMARY KEY,
    stock_name      VARCHAR(100) NOT NULL,
    market          VARCHAR(20) NOT NULL,
    close_price     INT NOT NULL,
    change_price    INT NOT NULL,
    change_rate     DECIMAL(10,2) NOT NULL,
    open_price      INT NOT NULL,
    high_price      INT NOT NULL,
    low_price       INT NOT NULL,
    volume          BIGINT NOT NULL,
    trading_value   BIGINT NOT NULL,
    market_cap      BIGINT NOT NULL,
    listed_shares   BIGINT NOT NULL,
    reg_date        DATETIME DEFAULT CURRENT_TIMESTAMP
) DEFAULT CHARACTER SET utf8mb4;
```

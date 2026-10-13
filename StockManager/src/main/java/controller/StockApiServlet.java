package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import vo.StockVO;
import service.StockService;
import service.StockServiceImpl;

@WebServlet("/api/stocks")
public class StockApiServlet extends HttpServlet {

    private StockService stockService =
            new StockServiceImpl();

    @Override
    protected void doGet(
            HttpServletRequest request,
            HttpServletResponse response)
            throws IOException {

        response.setContentType("application/json");
        response.setCharacterEncoding("UTF-8");

        List<StockVO> stockList =
                stockService.getStockList();

        StringBuilder json = new StringBuilder();
        json.append("[");

        for (int i = 0; i < stockList.size(); i++) {
            StockVO stock = stockList.get(i);

            if (i > 0) {
                json.append(",");
            }

            json.append("{");
            json.append("\"stockCode\":\"")
                    .append(escapeJson(stock.getStockCode()))
                    .append("\",");

            json.append("\"stockName\":\"")
                    .append(escapeJson(stock.getStockName()))
                    .append("\",");

            json.append("\"price\":")
                    .append(stock.getChangePrice());

            json.append("}");
        }

        json.append("]");

        response.getWriter().write(json.toString());
    }

    // JSON 문자열에 필요한 문자 처리
    private String escapeJson(String value) {
        if (value == null) {
            return "";
        }

        return value
                .replace("\\", "\\\\")
                .replace("\"", "\\\"")
                .replace("\n", "\\n")
                .replace("\r", "\\r")
                .replace("\t", "\\t");
    }
}
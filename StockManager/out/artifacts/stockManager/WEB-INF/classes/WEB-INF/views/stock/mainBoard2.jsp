
<%@ page contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ page import="java.util.List" %>
<%@ page import="vo.StockVO" %>

<%
    List<StockVO> stockList =
        (List<StockVO>) request.getAttribute("stockList");
%>

<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <title>KRX 주식정보</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            margin: 40px;
            color: #222;
        }

        h1 {
            color: #183153;
        }

        table {
            width: 100%;
            border-collapse: collapse;
            margin-top: 20px;
        }

        th, td {
            border: 1px solid #ddd;
            padding: 10px;
            text-align: center;
        }

        th {
            background-color: #183153;
            color: white;
        }

        tr:nth-child(even) {
            background-color: #f5f7fa;
        }

        .number {
            text-align: right;
        }
    </style>
</head>
<body>

<h1>KRX 주식정보 관리 시스템</h1>
<p>등록된 종목 목록</p>

<table>
    <thead>
    <tr>
        <th>종목코드</th>
        <th>종목명</th>
        <th>시장</th>
        <th>종가</th>
        <th>전일 대비</th>
        <th>등락률(%)</th>
        <th>거래량</th>
    </tr>
    </thead>

    <tbody>
    <% if (stockList != null && !stockList.isEmpty()) {
           for (StockVO stock : stockList) { %>
        <tr>
            <td><%= stock.getStockCode() %></td>
            <td><%= stock.getStockName() %></td>
            <td><%= stock.getMarket() %></td>
            <td class="number">
                <%= String.format("%,d", stock.getClosePrice()) %>
            </td>
            <td class="number">
                <%= String.format("%+,d", stock.getChangePrice()) %>
            </td>
            <td><%= stock.getChangeRate() %></td>
            <td class="number">
                <%= String.format("%,d", stock.getVolume()) %>
            </td>
        </tr>
    <%     }
       } else { %>
        <tr>
            <td colspan="7">조회된 종목이 없습니다.</td>
        </tr>
    <% } %>
    </tbody>
</table>

</body>
</html>
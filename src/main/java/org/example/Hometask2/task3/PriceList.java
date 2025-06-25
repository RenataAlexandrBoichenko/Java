package org.example.Hometask2.task3;

import java.util.HashMap;
import java.util.Map;

public class PriceList {
    HashMap<String, Double> priceMap = new HashMap<>();

    // Добавление нового товара
    public void addProduct(Product product) {
        priceMap.put(product.getName(), product.getPrice());
    }

    // Изменение цены товара
    public boolean updatePrice(String productName, double newPrice) {
        if (priceMap.containsKey(productName)) {
            priceMap.put(productName, newPrice);
            return true;
        } else {
            return false;
        }
    }
    // Получение цены товара по названию
    public Double getPrice(String productName) {
        return priceMap.get(productName);
    }

    // Вывод всего прайс-листа
    public void printPriceList() {
        System.out.println("Now priceList:");
        for (Map.Entry<String, Double> entry : priceMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue() + " руб.");
        }
    }
}

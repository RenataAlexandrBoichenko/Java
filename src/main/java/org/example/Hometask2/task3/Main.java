package org.example.Hometask2.task3;

import java.util.HashMap;


/**Создайте класс Product с полями для наименования и цены товара.
В классе PriceList используйте HashMap<String, Double> для хранения списка товаров, где ключом является название товара, а значением - его цена.
Реализуйте методы для добавления нового товара в список с его ценой, изменения цены товара и получения цены товара по его названию.
*/

public class Main {
    public static void main(String[] args) {
        PriceList priceList = new PriceList();

        // Создаем товары
        Product milk = new Product("Milk", 85.50);
        Product bread = new Product("Bread", 45.20);
        Product eggs = new Product("Eggs", 120.0);

        // Добавляем товары в прайс-лист
        priceList.addProduct(milk);
        priceList.addProduct(bread);
        priceList.addProduct(eggs);

        // Выводим прайс-лист
        priceList.printPriceList();

        // Получаем цену конкретного товара
        System.out.println("\nPrice milk: " + priceList.getPrice("Eggs") + " rub.");

        // Обновляем цену
        System.out.println("\nChange price bread...");
        priceList.updatePrice("Bread", 49.90);
        priceList.printPriceList();

        // Получение цены существующего товара
        System.out.println("\nPrice milk: " + priceList.getPrice("Milk"));

        // Пытаемся получить цену несуществующего товара
        System.out.println("\nPrice tomatos: " + priceList.getPrice("Tomatos"));
    }
}

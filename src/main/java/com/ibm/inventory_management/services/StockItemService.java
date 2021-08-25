package com.ibm.inventory_management.services;

import static java.util.Arrays.asList;

import java.util.List;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.ibm.inventory_management.models.StockItem;

@Service
@Primary
public class StockItemService implements StockItemApi {
        @Override
        public List<StockItem> listStockItems() {
                return asList(new StockItem("1").withName("TV").withStock(100).withPrice(10.5).withManufacturer("Sony"),
                                new StockItem("2").withName("Moto 360").withStock(150).withPrice(100.0)
                                                .withManufacturer("Insignia"),
                                new StockItem("3").withName("AC").withStock(10).withPrice(1000.0)
                                                .withManufacturer("Panasonic"),
                                new StockItem("4").withName("Iwatch").withStock(9).withPrice(990.0)
                                                .withManufacturer("JVC"));
        }
}

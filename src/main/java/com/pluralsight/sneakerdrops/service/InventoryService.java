package com.pluralsight.sneakerdrops.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InventoryService {
    @Autowired
    public InventoryService() {
    }

    public String getModel(){
        return "Inventory module ready.";
    }
}

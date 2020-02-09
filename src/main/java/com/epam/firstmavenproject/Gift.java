package com.epam.firstmavenproject;

import java.util.ArrayList;
import java.util.List;

import com.epam.firstmavenproject.sweets.Sweet;

public class Gift {
    
    private static final int MAX_WEIGHT = 500;
    private int current_weight = 0;    
    private List<Sweet> sweets;
    
    public Gift() {
	sweets = new ArrayList<>();
    }
    
    public void putSweet(Sweet sweet) {
	if (MAX_WEIGHT - current_weight >= sweet.getWeight()) {
	    sweets.add(sweet);
	    current_weight += sweet.getWeight();
	}
    }
    
    public int getTotalWeight() {
	return current_weight;
    }

}

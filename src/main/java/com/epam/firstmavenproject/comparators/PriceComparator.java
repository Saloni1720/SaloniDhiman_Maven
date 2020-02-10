package com.epam.firstmavenproject.comparators;

import java.util.Comparator;

import com.epam.firstmavenproject.sweets.Sweet;

public class PriceComparator implements Comparator<Sweet> {

    @Override
    public int compare(Sweet sweet1, Sweet sweet2) {
	return sweet1.getPrice() >= sweet2.getPrice() ? 1: -1;
    }

}

package com.epam.firstmavenproject.comparators;

import java.util.Comparator;

import com.epam.firstmavenproject.sweets.Sweet;

public class WeightComparator implements Comparator<Sweet> {

    @Override
    public int compare(Sweet sweet1, Sweet sweet2) {
	return sweet1.getWeight() >= sweet2.getWeight() ? 1 : -1;
    }

}

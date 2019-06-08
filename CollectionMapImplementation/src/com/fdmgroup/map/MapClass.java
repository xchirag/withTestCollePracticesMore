package com.fdmgroup.map;
import java.util.HashMap;
import java.util.Map;

public class MapClass implements ProductLookupTable {

	//private int idToProduct;
	int key;
	
	 private final Map<Integer, Product> idToProduct = new HashMap<>();

	 	 
	public Product lookupById(int id) {
		// TODO Auto-generated method stub
		//return null;
		return idToProduct.get(id);
	}

	public void addProduct(Product productToAdd) {
		// TODO Auto-generated method stub
		if(idToProduct.containsKey(key))
			throw new IllegalArgumentException("Unable to add product as there is duplicate id: " + productToAdd);
		else
			idToProduct.put(key, productToAdd);
	}

	
	public void clearTo() {
		// TODO Auto-generated method stub
		idToProduct.clear();
	}
	
	
}

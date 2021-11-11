package it.unibo.oop.lab05.ex3;

import java.util.Set;
import java.util.TreeSet;

public class WarehouseImpl implements Warehouse {
	
	private final Set<Product> set;
	
	public WarehouseImpl() {
		set = new TreeSet<>();
	}
	
	@Override
	public void addProduct(Product p) {
		this.set.add(p);
	}

	@Override
	public Set<String> allNames() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set<Product> allProducts() {
		return new TreeSet<Product>(set);
	}

	@Override
	public boolean containsProduct(Product p) {
		return set.contains(p);
	}

	@Override
	public double getQuantity(String name) {
		// TODO Auto-generated method stub
		return 0;
	}

}

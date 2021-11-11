package it.unibo.oop.lab05.ex3;

import java.util.LinkedHashSet;
import java.util.Set;

public class WarehouseImpl implements Warehouse {
	
	private final Set<Product> set;
	
	public WarehouseImpl() {
		set = new LinkedHashSet<>();
	}
	
	@Override
	public void addProduct(Product p) {
		this.set.add(p);
	}

	@Override
	public Set<String> allNames() {
		var names = new LinkedHashSet<String>();
		for(Product s: this.set) {
			names.add(s.getName());
		}
		return names;
	}

	@Override
	public Set<Product> allProducts() {
		return new LinkedHashSet<Product>(set);
	}

	@Override
	public boolean containsProduct(Product p) {
		return set.contains(p);
	}

	@Override
	public double getQuantity(String name) {
		for(Product p: set) {
			if(p.getName().equals(name)) {
				return p.getQuantity();
			}
		}
		return -1;
	}

}

package it.unibo.oop.lab05.ex4;

import java.util.Set;
import java.util.TreeSet;

import it.unibo.oop.lab05.ex3.Product;
import it.unibo.oop.lab05.ex3.WarehouseImpl;

public class OrderedWarehouse extends WarehouseImpl {
	
	public Set<Product> allProducts(){
		Set<Product> set = new TreeSet<>();
		set.addAll(super.allProducts());
		return set;
	}

}

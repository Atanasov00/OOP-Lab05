package it.unibo.oop.lab05.ex1;

import java.util.Arrays;
import java.util.Collection;
import java.util.Set;
import java.util.TreeSet;

/**
 * Example class using {@link Set}.
 * 
 */
public final class UseSet {

    private UseSet() {
    }

    /**
     * @param args
     *            ignored
     */
    public static void main(final String[] args) {
    	final int DIVISIBLE_NUMBER = 3;
    	final int LAST_NUMBER = 20;
    	final int FIRST_NUMBER = 1;
    	/*1) Builds a TreeSet containing Strings*/
    	final Collection<String> collString = new TreeSet<>();
    	/*2) Populates such Collection with all the Strings ranging from "1" to "20"*/
    	//collString.addAll(Arrays.asList("2", "4", "6"));
    	for(int i = FIRST_NUMBER; i <= LAST_NUMBER; i++) {
    		collString.add(Integer.toString(i));
    	}
    	/*3) Prints its content*/
    	System.out.println(collString);
    	/*for(String s: collString) {
    		if((Integer.parseInt(s) % DIVISIBLE_NUMBER) == 0) {
    			collString.remove(s);
    		}
    	}*/
    	var iterator = collString.iterator();
    	/*4) Removes all those strings whose represented number is divisible by three*/
    	while (iterator.hasNext()) {
    		if((Integer.parseInt(iterator.next()) % DIVISIBLE_NUMBER) == 0){
    			iterator.remove();
    		}
    	}
    	/*5) Prints the content of the Set using a for-each costruct*/
    	for(String s: collString) {
    			System.out.print("|" + s);
    	}
    	
    	int cont = 0;
    	/*6) Verifies if all the numbers left in the set are even*/
	    for(String s: collString) {
			if((Integer.parseInt(s) % 2) != 0) {
				System.out.println("|\nNon tutti i numeri all'interno del set sono pari.");
				break;
			}
			else {
				cont++;
			}
		}
	    
	    if(cont == collString.size()) {
	    	System.out.println("|\nTutti i numeri all'interno del set sono pari.");
	    }
    }
}

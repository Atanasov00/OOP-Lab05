package it.unibo.oop.lab05.ex5;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 */
public final class Utilities {

    private Utilities() { }

    /**
     * @param setA
     *            a set
     * @param setB
     *            another set
     * @param <X>
     *            Returned collection type
     * @return a new set that is the union of the input sets.
     */
    public static <X> Set<X> setUnion(final Set<? extends X> setA, final Set<? extends X> setB) {
    	Set<X> set = new TreeSet<>();
    	set.addAll(setA);
    	set.addAll(setB);
        return set;
    }

    /**
     * @param setA
     *            a set
     * @param setB
     *            another set
     * @param <X>
     *            Returned collection type
     * @return a new set that is the intersection of the input sets.
     */
    public static <X> Set<X> setIntersection(final Set<? extends X> setA, final Set<? extends X> setB) {
    	Set<X> set = new TreeSet<>();
    	for(X a: setA) {
    		for(X b: setB) {
    			if(a.equals(b)) {
    				set.add(a);
    			}
    		}
    	}
        return set;
    }

    /**
     * @param setA
     *            a set
     * @param setB
     *            another set
     * @param <X>
     *            Returned collection type
     * @return a new set that is the symmetric difference of the input sets.
     */
    public static <X> Set<X> setSymmetricDifference(final Set<? extends X> setA, final Set<? extends X> setB) {
    	Set<X> set = new TreeSet<>(setA);
    	set.addAll(setB);
    	
    	for(X b: setB) {
    		for(X a: setA) {
    			if(b.equals(a)) {
    				set.remove(b);
    			}
    		}
    	}
    	
        return set;
    }

    /**
     * @param coll
     *            the collection
     * @param <X>
     *            collection type
     * @return a random element from the collection
     *
     */
    public static <X> X getRandomElement(final Collection<X> coll) {
    	List<X> list = new ArrayList<>(coll);
    	Random ran = new Random();
        return list.get(ran.nextInt(list.size()));
    }

    /**
     * @param first
     *            first collection
     * @param second
     *            second collection
     * @param <X>
     *            First collection type
     * @param <Y>
     *            Second collection type
     * @return a pair with two random elements
     */
    public static <X, Y> Pair<X, Y> getRandomPair(final Collection<X> first, final Collection<Y> second) {
    	Random ran = new Random();
    	List<X> listX = new ArrayList<>(first);
    	List<Y> listY = new ArrayList<>(second);
    	X firstE = listX.get(ran.nextInt(listX.size()));
    	Y secondE = listY.get(ran.nextInt(listY.size()));
        return new Pair<X, Y>(firstE, secondE);
    }
}

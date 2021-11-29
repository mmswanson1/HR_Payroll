package edu.waketech.csc251.collection;

import java.util.*;

import edu.waketech.csc251.tools.Screener;

public class DataSetGeneric<E extends Measurable> extends java.util.ArrayList<E> 
	implements java.io.Serializable, java.lang.Cloneable, java.lang.Iterable<E>, java.util.Collection<E>, java.util.List<E>, java.util.RandomAccess {
	
	public DataSetGeneric() {
		
	}
	
	// add and size methods are provided via extending java.util.ArrayList<> and do not need to be explicitly stated here
	
	
	public List<E> getList() {
		return this;
	}
	
	public List<E> getList(Screener<E> elementScreener) {
		List<E> screened = new ArrayList<E>();
		for (E e : this) {
			if (elementScreener.test(e)) {
				screened.add(e);
			}
		}
		return screened;
	}
	
	// get smallest object in DataSetGeneric
	public E getMin() {
		if (isEmpty()) {
			return null;
		}
		E mEle = get(0);
		for (int i = 1; i < size(); i++) {
			if (mEle.getMeasure() > (get(i).getMeasure())) {
				mEle = get(i);
			}
		}
		return mEle;
	}
	
	// get largest object in DataSetGeneric
	public E getMax() {
		if (isEmpty()) {
			return null;
		}
		E mEle = get(0);
		for (int i = 1; i < size(); i++) {
			if (mEle.getMeasure() < (get(i).getMeasure())) {
				mEle = get(i);
			}
		}
		return mEle;
	}
	
	
	public java.util.List<E> sortBy(java.util.Comparator<? super E> comparator) {
		List<E> sortedList = new ArrayList<E>(this);
		Collections.sort(sortedList, comparator);
		
		return sortedList;
	}

	
	@Override
	public String toString() {
		 String x = "";
			
		 for(E e:this) {
			e.toString();
			x += "\t[" + indexOf(e) + "] " + e.toString() + "\n";
		}
				
		return x;
	}
}
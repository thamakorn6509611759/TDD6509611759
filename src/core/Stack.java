package core;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

public class Stack implements IStack {
	private ArrayList<Object> ele = new ArrayList<Object>();
	int count = 0 ;
	
	@Override
	public boolean isEmpty() {
		return true ;
	}
	@Override
	public int getSize() {
		return 0 ;
	}
	public void push(Object element) {
		ele.add(element);
	}
	@Override
	public boolean isFull() {
		return false ;
	}
	public Object Top() {
		// TODO Auto-generated method stub
		return ele.get(ele.size()-1) ;
	}
	
	
}


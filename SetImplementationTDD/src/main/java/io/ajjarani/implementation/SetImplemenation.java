/**
 * 
 */
package io.ajjarani.implementation;

import java.util.ArrayList;
import java.util.List;

/**
 * @author A.Ajjarani
 * 
 *
 */
public class SetImplemenation {	

	private int SetLength = 0;
	private boolean isEmpty = true;	
	//int[] strArry = new int[10];
	
	List<Object> strArray1 = new ArrayList<Object>();
	
	
	public SetImplemenation(){
		
	}

	public boolean isEmpty() {		
		return isEmpty;
	}

	public int getSize() {
		return SetLength;
	}

	public boolean contains(Object Value) {
		boolean isContains = false;
		
		for(int i=0; i< SetLength ; i++){
			if(Value instanceof String){
				if(strArray1.get(i).equals(Value)){
					isContains = true;
				}
			} else if(Value instanceof Integer){
				if(strArray1.get(i) == Value){
					isContains = true;
				}
			}			
		}		
		return isContains;
	}
	
	
	public boolean add(Object testValue) {
		boolean isAdded = false;
		if(!contains(testValue)){
			//strArry[SetLength] = testValue;
			strArray1.add(testValue);
			SetLength++;
			isAdded = true;
		} 
		return isAdded;
	}

		
	
	public Object remove(Object o) {
		// TODO Auto-generated method stub
		return null;
	}

	public Object containsAll(Object o) {
		// TODO Auto-generated method stub
		return null;
	}

	public Object addAll(Object o) {
		// TODO Auto-generated method stub
		return null;
	}

	public Object retainAll(Object o) {
		// TODO Auto-generated method stub
		return null;
	}

	public Object removeAll(Object o) {
		// TODO Auto-generated method stub
		return null;
	}

	public Object clear(Object o) {
		// TODO Auto-generated method stub
		return null;
	}

}

/**
 * 
 */
package io.ajjarani.implementation;

/**
 * @author A.Ajjarani
 * @param <E>
 *
 */
public class SetImplemenation {	

	private int SetLength = 0;
	private boolean isEmpty = true;	
	int[] strArry = new int[10];
	
	
	public SetImplemenation(){
		
	}

	public boolean isEmpty() {		
		return isEmpty;
	}

	public int getSize() {
		return SetLength;
	}

	public boolean contains(int intValue) {
		boolean isContains = false;
		
		for(int i=0; i< SetLength ; i++){
			if(strArry[i] == intValue){
				isContains = true;
			}
		}		
		return isContains;
	}
	
	
	public boolean add(int testValue) {
		boolean isAdded = false;
		if(!contains(testValue)){
			strArry[SetLength] = testValue;
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

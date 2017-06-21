package io.ajjarani.implementation;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SetBusinessUsage {

	public static void main(String[] args) {
		setTestingMyImplementation();
		SetTestingFromJDK();
	}

	private static void SetTestingFromJDK() {
		Set<Object> set2 = new HashSet<Object>();
		System.out.println("Is the Set Empty as Not Initialized ? "+set2.isEmpty() +" "+
							"If so what is the current Length : "+set2.size());
		
		// Testing
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Set Length Needed ?");
		int num = sc.nextInt();
		
		
		System.out.println("Enter each data into Set :");		
		for(int i=0 ; i< num ; i++){
			set2.add(sc.next());
		}
				
		System.out.println("Length of Set : "+set2.size());
		
	}

	private static void setTestingMyImplementation() {
		
		try {
			SetImplemenation set1 = new SetImplemenation();
			
			System.out.println("Is the Set Empty as Not Initialized ? "+set1.isEmpty() +" "+
								"If so what is the current Length : "+set1.size());
			
			@SuppressWarnings("resource")
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Set Length Needed ?");
			int num = sc.nextInt();
			
			
			System.out.println("Enter each data into Set :");		
			for(int i=0 ; i< num ; i++){
				set1.add(sc.next());
			}
					
			System.out.println("Length of Set : "+set1.size());
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}

}

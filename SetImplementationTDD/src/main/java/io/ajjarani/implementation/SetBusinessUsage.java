package io.ajjarani.implementation;

import java.util.Scanner;

public class SetBusinessUsage {

	public static void main(String[] args) {		
		SetImplemenation set1 = new SetImplemenation();
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Set Length Needed ?");
		int num = sc.nextInt();
		
		
		System.out.println("Enter each data into Set :");		
		for(int i=0 ; i< num ; i++){
			set1.add(sc.next());
		}
				
		System.out.println("Length of Set : "+set1.getSize());

	}

}

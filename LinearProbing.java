package linearProbing;

import java.util.HashMap;
import java.util.Scanner;
import java.util.*;

public class LinearProbing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//create HashMap
		HashMap <Integer, Integer> numberMap = new HashMap<Integer,Integer>();
		numberMap.put(0, 7);
		numberMap.put(1, 2);
		numberMap.put(2, null);
		numberMap.put(3, 5);
		numberMap.put(4, 8);
		numberMap.put(5, null);
		numberMap.put(6, 201);
		numberMap.put(7, 234);
		numberMap.put(8, null);
		numberMap.put(9, 120);
		numberMap.put(10, null);
		
		// Declare calculating variables
		int n = 10;
		int hashCode = 69;
		int hashKey = hashCode % n;
		int i = 1;
		int placement;
		//do while loop to insert new hashCode into HashCode into HashMap
		do {
			placement = ((hashKey % i) % n);
			hashKey ++;
		}while(numberMap.get(hashKey) != null);
		//palace into HashMap
		numberMap.put(hashKey, hashCode);
		//Display new HashMap
		System.out.println(numberMap);
	}
	
}

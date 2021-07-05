package datastructures_Algorithms.ArrayList;

import java.util.*;

public class ArrayListWithGenerics {

	public static void main(String[] args) {
// As we have defined the type as String therefore we can now only add Strings in it.
		List <String> fruits  = new ArrayList<>();
		
		fruits.add("Apple");
		fruits.add("Bnana");
		fruits.add("Orange");
		fruits.add("Chiku");
		fruits.add("Mango");
		
		System.out.println("Original ArrayList:  " + fruits);
// Some useful functions/Methods of List Interface:
//1. add():		
		fruits.add("Papaya");
		System.out.println();
		System.out.println("1. " + fruits);
//2. addAll(Collections):
		List <String> toAdd = new ArrayList<>();
		toAdd.add("WaterMellon");
		toAdd.add("Sitafal");
		
		fruits.addAll(toAdd);
		System.out.println();
		System.out.println("2. " + fruits);
//3. get(index):		
		System.out.println();
		System.out.println("3. " + fruits.get(2));
//4. set(index, value);
		fruits.set(3, "Element Changed");
		System.out.println();
		System.out.println("4. " + fruits.get(3));
//5. remove(index): removes the element and then fills the position with other elements.
		fruits.remove(3);
		System.out.println();
		System.out.println("5. " + fruits);
//6. removeAll():
		fruits.removeAll(toAdd);
		System.out.println();
		System.out.println("6. toAdd Part Removed: " + fruits);
//7. clear(): Clears the ArrayList.
//8. size():
		System.out.println();
		System.out.println("8. Size of Fruits is :  " + fruits.size());
//9. contains():
		System.out.println();
		System.out.println("9. " + fruits.contains("Mango"));
//10. isEmpty(): checks whether the list is empty.
//11. toArray(): Creates an array of the corresponding ArrayList.
		
		Object myFruits = fruits.toArray();
		
// Or to be specific as we know that its a list of String elements therefore we can add it into an string array.
		
		String arr [] = new String[fruits.size()];
		fruits.toArray(arr);
		System.out.println("11. Array arr of the given ArrayList fruits :  ");
		for (String e: arr) {

			System.out.print(e + " ");
		}
		
		

	}

}

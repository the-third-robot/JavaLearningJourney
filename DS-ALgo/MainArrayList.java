package datastructures_Algorithms.ArrayList;

import java.util.ArrayList;

import java.util.List;

public class MainArrayList {

	public static void main(String[] args) {
// ArrayList Without Generics: Therefore we can add anything in that array.
//		ArrayList fruits = new ArrayList ();
// It's always better to initialize any List as a List so that it can be up-casted easily.
		List fruits = new ArrayList();
		fruits.add("Mango");
		fruits.add(23);
		fruits.add('a');
		
		System.out.println(fruits);
		

	}

}

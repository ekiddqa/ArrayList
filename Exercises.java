package com.qa.main;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;


public class Exercises {
	public static void main(String[] args){
        List<String> food = new ArrayList<>();
		food.add("Pasta");
		food.add("Pizza");
		food.add("Soup");
		food.add("Onion");
		food.add("Cake");
		food.add("Cheese");
		food.add("Miso");
		food.add("Sushi");
		System.out.println(food);
		for (int i=0; i<food.size(); i++){
		    System.out.println(food.get(i));
		}
		for (String i : food){
		    System.out.println(i);
		}
		System.out.println(food.get(2));
		food.set(4, "Biscuit");
		System.out.println(food.get(4));
		food.remove(6);
		System.out.println(food);
		Collections.sort(food);
		for(String i :food) {
			System.out.println(i);
		}
		Collections.reverse(food);
		System.out.println(food);
		Collections.swap(food, 2, 3);
		System.out.println(food);
	
		List<Integer> faveNums = new ArrayList<>();
		faveNums.add(50);
		faveNums.add(1);
		faveNums.add(63098);
		Collections.sort(faveNums);
		for (int i : faveNums){
		 System.out.println(i);
		}
		//Collections.clone()
	} 
}

package com.altimetrik.utilities;

import java.util.ArrayList;
import java.util.function.Consumer;


class MyConsumer<T> implements Consumer<T> {
	public void accept(T t) {
		System.out.println("Consumed: " + t);
		System.out.println("Result after adding 10 : "+ ((int)t+10));
	}
}


public class UtilityConsumer {
	public static void main(String[] args) {
		ArrayList list = new ArrayList<>(5);
		
		Consumer myConsumer = new MyConsumer();
		
		list.add(100);
		list.add(300);
		list.add(500);
		list.add(700);
		list.add(900);
		System.out.println("ArrayList elements: " + list);
		
		list.forEach(myConsumer);
	}
}

package com;

public class Demo_String {
	public static void main(String[] args) {
		String name = new String("Thanesh");
		System.out.println(name);
		System.out.println(name.toUpperCase());
		System.out.println(name.toLowerCase());
		System.out.println(name.endsWith("r"));
		System.out.println(name.startsWith("t"));
		System.out.println(name.length()); // remove the space
		System.out.println(name.trim().length());
		System.out.println(name.equals("  tHaneSH iS a jaVa tRainer  "));
		System.out.println(name.equals("  THaneSH iS a jaVa tRainer  "));
		System.out.println(name.equalsIgnoreCase("  THaneSH iS a jaVa tRainer  "));
		System.out.println(name.charAt(3));
		System.out.println(name.isBlank());
		System.out.println(name.isEmpty());
//		title.instrt							: we cant modify anything 
		System.out.println(name.replace("t", "T"));
		String words[] = name.split(" ");
		for (String wrd : words) {
			System.out.println(wrd);
		}
		System.out.println("=================");
		name.concat("Kuame");
		System.out.println(name); // string we can't change / modify : immutable
		StringBuffer sb = new StringBuffer("Thanesh"); // we can change // mutable
		sb.append("Kuamr");
		System.out.println(sb);
		sb.insert(0, "Mr ");
		System.out.println(sb);
		sb.delete(10, 17);
		System.out.println(sb);
		System.out.println("------- String builder ----");
		StringBuilder sb1 = new StringBuilder("Thanesh"); // we can chage // mutable
		sb1.append("Kuamr");
		System.out.println(sb1);
		sb1.insert(0, "Mr ");
		System.out.println(sb1);
		sb1.delete(10, 17);
		System.out.println(sb1);
		sb1.reverse();
		System.out.println(sb1);

	}
}

package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("Maria");
		list.add("Anna");
		list.add("Bob");
		list.add("Marcos");
		list.add(1, "Narcos");
		
		for (String obj : list) {
			System.out.println(obj);
		}
		
		System.out.println("--------------------------------------------");
		
		list.remove("Narcos");
		list.remove(0);
		
		for (String obj : list) {
			System.out.println(obj);
		}
		
		System.out.println("--------------------------------------------");
		
		list.removeIf(x -> x.charAt(0) == 'M');
		
		for (String obj : list) {
			System.out.println(obj);
		}
		
		System.out.println("--------------------------------------------");
		
		System.out.printf("Index Of Anna: %d", list.indexOf("Anna"));
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
		
		for (String x : result) {
			System.out.println(x);
		}
		
		System.out.println("--------------------------------------------");
		String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
		System.out.println(name);
		
	}
}
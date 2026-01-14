package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		
		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Ana");
		
		list.add(2, "Marco");
		
		System.out.println(list.size());
		
		for(String nomes : list) {
			System.out.println(nomes);
		}
		
		System.out.println("------------------------------------");
		
		//list.remove("Ana");
		//list.remove(1);
		list.removeIf(nomes -> nomes.charAt(0) == 'M');
		
		for(String nomes : list) {
			System.out.println(nomes);
		}
		
		System.out.println("------------------------------------");
		System.out.println("Index of Bob: " + list.indexOf("Bob"));
		System.out.println("Index of Marco: " + list.indexOf("Marco"));
		
		
		System.out.println("------------------------------------");
		List<String> result = list.stream().filter(nomes -> nomes.charAt(0) == 'A').collect(Collectors.toList());
		
		for(String nomes : result) {
			System.out.println(nomes);
		}
		
		System.out.println("------------------------------------");
		String name = list.stream().filter(names -> names.charAt(0) == 'J').findFirst().orElse(null);
		System.out.println(name);

	}

}

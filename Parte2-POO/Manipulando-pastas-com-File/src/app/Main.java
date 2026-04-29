package app;

import java.io.File;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Fale o caminho da pasta: ");
		String strPath = sc.nextLine();
		
		File path = new File(strPath);
		
		File[] folders = path.listFiles(File::isDirectory);
		
		System.out.println("PASTAS:");
		for(File pastas : folders) {
			System.out.println(pastas);
		}
		
		File[] files = path.listFiles(File::isFile);
		System.out.println("ARQUIVOS: ");
		for(File arquivos : files) {
			System.out.println(arquivos);
		}
		
		//boolean success = new File(strPath + "\\novapasta").mkdir();
		//System.out.println("Repositorio criado com sucessor: " + success);
		
		sc.close();
	}

}

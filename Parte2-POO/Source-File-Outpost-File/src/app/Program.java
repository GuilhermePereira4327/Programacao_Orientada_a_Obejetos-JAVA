package app;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.EntitiesException;
import entities.Produto;

public class Program {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		List<Produto> produto = new ArrayList<Produto>();
		
		System.out.println("Enter file path: ");
		String sourceFileStr = scan.nextLine();

		File sourceFile = new File(sourceFileStr);
		String sourceFolderStr = sourceFile.getParent();
		
		boolean success = new File(sourceFolderStr + "\\out").mkdir();
		
		String targetFileStr = sourceFolderStr + "\\out\\summary.csv";
		
		//"C:\\temp\\WS-Eclipse\\Source-File-Outpost-File\\Source-file\\sourceFile.csv";
		
		try(BufferedReader br = new BufferedReader(new FileReader(sourceFileStr))){
			String itemCsv = br.readLine();
			while(itemCsv != null ) {
				for(int i = 0; i < 1; i++) {
					String[] produtos = itemCsv.split(",");
					String nome = produtos[0];
					double preco = Double.parseDouble(produtos[1]);
					int unidade = Integer.parseInt(produtos[2]);
					produto.add(new Produto(nome, preco, unidade));
				}
				itemCsv = br.readLine();
			}
			
			try(BufferedWriter bw = new BufferedWriter(new FileWriter(targetFileStr, true))){
				for(Produto a : produto) {
					bw.write(a.toString());
					bw.newLine();
				}
				System.out.println(targetFileStr + " CREATED!");
			}
			catch(IOException e) {
				e.printStackTrace();
			}
			
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		catch(EntitiesException e) {
			System.out.println(e.getMessage());
		}
		
		scan.close();
	}

}

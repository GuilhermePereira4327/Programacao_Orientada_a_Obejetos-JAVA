package course;

public class Program {

	public static void main(String[] args) {
		String original = "abcde FGHIJ ABC abc DEFG   ";

		//função toLowerCase serve para deixar tudo minusculo
		String s01 = original.toLowerCase();
		//função toUpperCase serve para deixar tudo maiusculo
		String s02 = original.toUpperCase();
		//função trim serve para tira os espaços nas extremidades da string
		String s03 = original.trim();
		//função substring serve para determinar de qual caractere começa a string
		String s04 = original.substring(2);
		//mesma função com mais uma argumento: determinar de onde vai terminar a string
		String s05 = original.substring(2, 9);
		//função replace serve para trocar caracteres dentro da string
		String s06 = original.replace('a', 'x');
		//mesma função, podemos 'trocar' mais de um caractere por vez
		String s07 = original.replace("abc", "xy");
		//função indexOf serve para mostar a primeira posição desses caracteres dentro da string
		int i = original.indexOf("bc");
		//serve do mesmo modo, so alterando que pega a ultima posição do caractere na string
		int j = original.lastIndexOf("bc");
		
		System.out.println("Original: -" + original + "-");
		System.out.println("toLowerCase: -" + s01 + "-");
		System.out.println("toUpperCase: -" + s02 + "-");
		System.out.println("trim: -" + s03 + "-");
		System.out.println("substring(2): -" + s04 + "-");
		System.out.println("substring(2, 9): -" + s05 + "-");
		System.out.println("replace('a', 'x'): -" + s06 + "-");
		System.out.println("replace('abc', 'xy'): -" + s07 + "-");
		System.out.println("Index of 'bc': " + i);
		System.out.println("Last index of 'bc': " + j);
		
		/*substring(2): -cde FGHIJ ABC abc DEFG   -
		substring(2, 9): -cde FGH-
		replace('a', 'x'): -xbcde FGHIJ ABC xbc DEFG   -
		replace('abc', 'xy'): -xyde FGHIJ ABC xy DEFG   -
		Index of 'bc': 1
		Last index of 'bc': 17*/
		
		System.out.printf("\n\n\n");
		
		String s = "potato apple lemon";
		
		//função split, ela quebra uma string em partes, determinada pelo dev
		//neste caso ela quebra nas partes onde tem espaço vazio
		String[] vect = s.split(" ");
		String word1 = vect[0];
		String word2 = vect[1];
		String word3 = vect[2];
		
		System.out.println(word1 + " + " + word2 + " + " + word3);

	}

}

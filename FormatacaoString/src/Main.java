
public class Main {

	public static void main(String[] args) {
		
		String original1 = "abcde FGHIJ ABC abc DEFG    ";
		
		String s01 = original1.toLowerCase(); // Atribui letra minuscula 
		String s02 = original1.toUpperCase(); // Tudo Minuscula
		String s03 = original1.trim(); // Tudo Maiuscula
		String s04 = original1.substring(2); //tirar excesso de espa�o
		String s05 = original1.substring(2, 9); //tira as letras do come�o
		String s06 = original1.replace('a', 'x'); // subtritui uma letra(Char)
		String s07 = original1.replace("abc", "xy"); //substitui um conjunto de letras(String)
		int i = original1.indexOf("bc"); //lugar onde est� o paramentro, ordem do come�o pro final pra encontrar paramento
		int j = original1.lastIndexOf("bc"); //lugar onde est� o paramentro, ordem do final pro come�o pra encontrar paramento
		
		
		System.out.println("Minuscula - " + s01 +"-");
		System.out.println("Maiuscula - " + s02+"-");
		System.out.println("tirar excesso de espa�o - " + s03+"-");
		System.out.println("tira as letras do come�o - " + s04+"-");
		System.out.println("tira a letra do final e do come�o -" + s05+"-");
		System.out.println("subtritui uma letra(Char) - " + s06+"-");
		System.out.println("substitui um conjunto de letras(String) - " + s07+"-");
		System.out.println("lugar onde est� o paramentro, ordem do come�o pro final pra encontrar paramento - " + i+"-");
		System.out.println("lugar onde est� o paramentro, ordem do final pro come�o pra encontrar paramento - " + j+"-");
		
		String s= "Macaco banana bingo";
		
		String[] vect = s.split(" "); //vai dividir uma string baseado no parametro
		
		System.out.println(vect[0]);
		System.out.println(vect[1]);
		System.out.println(vect[2]);
		
		

	}

}

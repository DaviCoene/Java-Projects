package entitie;

public class Produto {
		private String name;
		private int Idade;
		private double altura;
		public Produto(String name, int idade, double altura) {
			this.name = name;
			Idade = idade;
			this.altura = altura;
		}
		public Produto(String name) {
			this.name = name;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getIdade() {
			return Idade;
		}
		public void setIdade(int idade) {
			Idade = idade;
		}
		public double getAltura() {
			return altura;
		}
		public void setAltura(double altura) {
			this.altura = altura;
		}
		
		
}

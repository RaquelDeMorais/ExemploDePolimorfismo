/*
Autor....:	Paulo Roberto Correia Junior
Matricula:	T50262-4
Data.....:	10/11/2015
Problema.: 1) Implemente, em Java, uma classe abstrata de nome Figura onde s�o declarados dois 
				m�todos abstratos:  float calcularArea();  float calcularPerimetro(); 

				2) Crie, como subclasse de Figura, uma classe de nome Ret�ngulo cujas inst�ncias s�o
				caracterizadas pelos atributos lado e altura ambos do tipo float. Implemente na classe
				Ret�ngulo os m�todos herdados de Figura  e outros que ache necess�rios.
				
				3) Crie, como subclasse de Figura, uma classe de nome Circulo cujas inst�ncias s�o 
				caracterizadas pelo atributo raio do tipo float. Implemente na classe Circulo os m�todos
				herdados de Figura e outros que ache necess�rios. 
				
				Nota: poder� obter o valor de Pi fazendo Math.PI.
				
				4) Crie, como subclasse de Retangulo, uma classe de nome Quadrado cujas inst�ncias s�o 
				caracterizadas por terem os atributos lado e altura com o mesmo valor.
				
				5) Elabore um programa de teste onde � declarado um ArrayList, do tipo Figura. Nesse 
				ArrayList devem ser guardadas inst�ncias de Ret�ngulo, Circulo e Quadrado.  Depois 
				implemente um ciclo que percorra o ArrayList evocando, relativamente a cada um dos objetos 
				guardados, os m�todos calcularArea e calcularPerimetro.

*/
import java.util.ArrayList;

public class CriaFigura {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Figura> figuras = new ArrayList<Figura>();
		
		Retangulo retangulo = new Retangulo(3,5);
		figuras.add(retangulo);
		Circulo circulo = new Circulo(3);
		figuras.add(circulo);
		Quadrado quadrado = new Quadrado(3);
		figuras.add(quadrado);
		
		
		// Lista toda as figuras
		for (Figura figura : figuras){
			// Descobrindo a classe de um objeto
			//if(figura instanceof Retangulo) {
				//System.out.println("Retangulo Area: "+ figura.calcularArea()+ " Perimetro: " + figura.calcularPerimetro());
			//}
			//if(figura instanceof Circulo) {
				//System.out.println("Circulo Area: "+ figura.calcularArea()+ " Perimetro: " + figura.calcularPerimetro());
			//}
			//if(figura instanceof Quadrado) {
				//System.out.println("Quadrado Area: "+ figura.calcularArea()+ " Perimetro: " + figura.calcularPerimetro());
			//}
			
			System.out.println(figura.toString());
		}
		
	}

}

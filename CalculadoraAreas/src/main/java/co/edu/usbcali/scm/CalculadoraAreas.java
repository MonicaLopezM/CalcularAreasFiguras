package co.edu.usbcali.scm;

public class CalculadoraAreas implements ICalculadoraAreas {

	private int area=0;
	public void areaTriangulo(int base, int altura) {
		area= (base*altura)/2;
	}

	public void areaCirculo(int radio) {
		area=(int) (3.1416*(radio * radio));
	}

	public void areaCuadrado(int lado) {
		area =lado * lado;
	}

	public void areaRectangulo(int base, int altura) {
		area= base * altura;
	}

	public int getResultado() {
		return area;
	}
	
	public void imprimir() {
		System.out.print("Area: "+getResultado());
	}


}

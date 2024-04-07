package pruebas;

public class Suma {
	private int num1;
	private int num2;
	
	public Suma(int num1, int num2) {
		this.num1=num1;
		this.num2=num2;
	}

	public int getNum1() {
		return num1;
	}

	public void setNum1(int num1) {
		this.num1 = num1;
	}

	public int getNum2() {
		return num2;
	}

	public void setNum2(int num2) {
		this.num2 = num2;
	}

	public int Sumar() {
		int resultado= num1+num2;
		return resultado;
	}
	public int SumarNegativos() {
		int resultado=0;
		if(num1<0 && num2<0) {
			 resultado= num1+num2;
		}
		return resultado;
		
	}
	public int SumarNegativoPositivo() {
		int resultado=0;
		if(num1<0 && num2>0) {
			resultado=num1+num2;
		}else if(num1>0 && num2<0) {
			resultado= num1+num2;
		}
		return resultado;
	}
	

}

package pruebas;

public class Ejecutable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Suma s1=new Suma(2,3);
		Suma s2= new Suma(-2,-3);
		Suma s3= new Suma(-5,7);
		System.out.println(s1.Sumar());
		System.out.println(s2.SumarNegativos());
		System.out.println(s3.SumarNegativoPositivo());

	}

}

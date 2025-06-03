package clases;
//Autor: KenDalisay
//Versión: 1.0
//Clase Main
public class Main implements calcularTiempo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        //Instanciamos
        CK_Coche coche1 = new CK_Coche("1234-MMM", "BMW M5", 4, 155, "GASOLINA", 9.2);
        CK_Coche coche2 = new CK_Coche("5678-ABC", "Audi A4", 5, 140, "DIESEL", 6.5);
        CK_Moto moto1 = new CK_Moto("9939-ZZZ", "Yamaha R6", 2, 120, "GASOLINA", 5.0);
        CK_Moto moto2 = new CK_Moto("5888-XXX", "Honda CB500", 2, 100, "GASOLINA", 3.8);
	    
	    // Método calcular tiempo
	    double tiempo = calculartiempo(coche1);
	    
	    // Método calcular coste
	    double coste = extracted(coche1);
	    
	    double rendimiento = extracted(coche1, coste);
	    
	    // Mostrar información
	    System.out.println("Tiempo: " + tiempo + " horas");
	    System.out.println("Coste: " + coste + " euros");
	    System.out.println("Rendimiento: " + rendimiento + " euros/persona");
	
	}
//CODIGO MODIFICADO
	private static double calculartiempo(CK_Coche coche1) {
		double velocidad = coche1.getVelocidadMedia();
		final double DISTANCIA_EN_METROS = 350;
		double tiempo = DISTANCIA_EN_METROS / velocidad;
		return tiempo;
	}

	private static double extracted(CK_Coche coche1, double coste) {
		// Método calcular rendimiento
	    double rendimiento = coste / coche1.getNumeroPlazas();
		return rendimiento;
	}

	private static double extracted(CK_Coche coche1) {
		double consumo = coche1.getConsumo();
	    double precio = 1.65;
	    double coste = consumo * 350 * 0.01 * precio;
		return coste;
	}

}



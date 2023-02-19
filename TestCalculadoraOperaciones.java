package calcualdoraTest;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import java.awt.Robot;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import calcualdora.CerebroCalculadoraED;
import calcualdora.Operaciones;

class TestCalculadoraOperaciones {
	static CerebroCalculadoraED calc;
	static Robot robot;
	//Inicializamos un objeto de Operaciones
	static Operaciones op;
	// CAMBIÉ A PUBLIC LA CLASE "CalculadoraED"
	@BeforeAll
	static void initCalcTest() {
		//Iniciamos un objeto Calculadora, el cual usaremos durante todas la prueba
		calc = new CerebroCalculadoraED();
		
	}

	// Test para Suma
	// Cambié a public la clase "operarSuma"
	@Test
	void TestSuma() {
		double esperado = 10;
		System.out.println("Introduce 5 y 5 cuando se te pida por cosola ");
		calc.operarSuma(Operaciones.SUMAR);
		assertEquals(esperado,calc.resultado);
	}

	// Test para la resta
	//Cambié a public "operarResta"
	@Test
	void TestResta() {
		double esperado = 2;
		System.out.println("Introduce 10 y 8 cuando se te pida por cosola ");
		calc.operarResta(Operaciones.RESTAR);
		assertEquals(esperado,calc.resultado);
	}
	// Test para la Multiplicación
	//Cambié a public "operarMultiplica"
	@Test
	void TestMultiplicacion() {
		double esperado = 25;
		System.out.println("Introduce 5 y 5 cuando se te pida por cosola ");
		calc.operarMultiplica(Operaciones.MULTIPLICAR);
		assertEquals(esperado,calc.resultado);
	}

	// Test para la División
	//Cambié a public "operarMultiplica"
	@Test
	void TestDivision() {
		double esperado = 3;
		System.out.println("Introduce 6 y 2 cuando se te pida por cosola ");
		calc.operarMultiplica(Operaciones.DIVIDIR);
		assertEquals(esperado,calc.resultado);
	}

	// Test para la Sumar_Res
	//Cambié a public "operarSumaRes"
	@Test
	void TestSumar_Res() {
		double esperado = 51;
		//Ponemos un resultado predefinido al que operar
		calc.resultado=50;
		System.out.println("Introduce 1 cuando se te pida por cosola ");
		calc.operarSumaRes(Operaciones.SUMAR_RES);
		assertEquals(esperado,calc.resultado);
	}

	// Test para la Restar_Res
	//Cambié a public "operarRestaRes"
	@Test
	void TestRestar_Res() {
		double esperado = 1;
		//Ponemos un resultado predefinido al que operar
		calc.resultado=51;
		System.out.println("Introduce 50 cuando se te pida por cosola ");
		calc.operarRestaRes(Operaciones.RESTAR_RES);
		assertEquals(esperado,calc.resultado);
	}

	// Test para Multiplicar_Res
	//Cambié a public "operarMultiplicaRes"
	@Test
	void TestMultiplicar_Res() {
		double esperado = 50;
		//Ponemos un resultado predefinido al que operar
		calc.resultado=25;
		System.out.println("Introduce 2 cuando se te pida por cosola ");
		calc.operarMultiplicaRes(Operaciones.MULTIPLICAR_RES);
		assertEquals(esperado,calc.resultado);
	}

	// Test para DividirRes
	//Cambié a public "operarDivideRes"
	@Test
	void TestDividir_Res() {
		double esperado = 5;
		//Ponemos un resultado predefinido al que operar
		calc.resultado=25;
		System.out.println("Introduce 5 cuando se te pida por cosola ");
		calc.operarDivideRes(Operaciones.DIVIDIR_RES);
		assertEquals(esperado,calc.resultado);
	}

	// Test para Resultado
	// CAMBIÉ "mostrarResultado a public"
	@Test
	void TestMostResult() {
		double numero1 = 12.4;
		double numero2 = 2.6;
		double esperado = 15;
		calc.mostrarResultadoActual(Operaciones.RESULTADO);
	//Comprobamos si muestra el resultado
		assertEquals(esperado, Operaciones.RESULTADO + 	"El resultado de la operación suma es:\n" +
                "12.4 + 2.6 = 15\n");
	}

	// Test para Random
	//Cambié a public "numeroAleatorio"
	@Test
	void TestRandom() {
		    // Llamamos al método a probar
		    calc.numeroAleatorio(Operaciones.RANDOM);
		    // Comprobamos que el resultado está entre 1 y 100
		    double resultado = calc.resultado;
		    assertTrue(resultado >= 1 && resultado <= 100);
		    // Comprobamos que se ha añadido correctamente la operación al historial
		    double historial=calc.resultado;
		    assertEquals(historial, Operaciones.RANDOM.getNombre() + ": " + Double.toString(resultado));
		  }
	//Test para Mostrar historial
	@Test
	void TestOperarHistorial() {
		//Realizamos 5 sumas y lo guardamos en el historial
		double historial = 0;
		System.out.println("Escribe 0 y 1");
		calc.operarSuma(Operaciones.SUMAR);
		historial+=calc.resultado;
		System.out.println("Escribe 0 y 1");
		calc.operarSuma(Operaciones.SUMAR);
		historial+=calc.resultado;
		System.out.println("Escribe 0 y 1");
		calc.operarSuma(Operaciones.SUMAR);
		historial+=calc.resultado;
		System.out.println("Escribe 0 y 1");
		calc.operarSuma(Operaciones.SUMAR);
		historial+=calc.resultado;
		System.out.println("Escribe 0 y 1");
		calc.operarSuma(Operaciones.SUMAR);
		//PONEMOS EN PUBLIC "operarHistorial" 
		calc.operarHistorial(Operaciones.SUMAR);
		//Comprobamos si se muestra el resultado asecuado mostrando el historial 
		//como un String
		assertEquals(Double.toString(historial),calc.resultado);
	}
/*	
	//Test infoOperacion
	//Cambiamos a public infoOperacion para poder trabajar con él
	@Test
	void TestinfoOperacion() {
	
	String esperado= Operaciones.SUMAR.getNombre() + Operaciones.SUMAR.getInfo();
	 //Comprobamos que el método sea igual al esperado
		assertEquals(esperado, calc.infoOperacion(op));
*/		
	

	//Test pedirUnNumero
	//Cambiamos a public pedirUnNumero
	@Test
	void TestpedirUnNumero() {
		//Ejecutamos el método
		double esperado=5;
		System.out.println("Escribe 5");
		calc.pedirUnNumero();
		assertEquals(esperado,calc.resultado);
	}
	
/*
	//Test mostrarResultado
	//Cambiamos a public mostrarResultado
	@Test
	void TestmostrarResultado() {
		double esperado=3;
	System.out.println("Escribe suma de 1 y 2");	
	calc.mostrarResultado(op);	
		assertEquals(esperado,calc.resultado);
	}
	*/
	//Test AñadirHistorial
	//Cambiamos a public AñadirHistorial
		
	void TestAñadirHistorial() {
		double esperado = 1;
		System.out.println("Escribe suma de unos");
		calc.anadirHistorial(op);
		assertEquals(esperado,calc.resultado);
	}
	
	//Test añadirHistorialAleatorio
	//Cambiamos a public AñadirHistorialAleatorio
	
	void TestAñadirHistorialAleatorio() {
		double esperado;
		calc.anadirHistorialAleatorio(op);
	}
	
	
	
	
	
}
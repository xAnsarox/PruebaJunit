/* Nombre: Antonio Salazar
 * Fecha: 17/11/2024
 * Objetivo del programa: Elaborar todos los casos de prueba posibles para la clase "Codigo2".
 */

package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;
import org.junit.jupiter.api.BeforeAll;

import Pruebas2.Codigo2;

public class Codigo2Test {
	private Codigo2 test;

	/* Creamos el método setUp que crea el objeto antes de comenzar los tests, para
	 * evitar tener que crearlo cada vez que queramos llevar a acabo un test. */
	@BeforeAll
	public void setUp() {
		test = new Codigo2();

	}

	// En primer lugar, vamos a probar los dos casos únicos: n = 0 y n = 1,
	@Test
	public void testValor0() {
		assertEquals(1, test.factorial(0));
	}

	@Test
	public void testValor1() {
		assertEquals(1, test.factorial(1));
	}

	/*
	 * A continuación, haremos tres pruebas de números dentro del rango del primer
	 * if (el valor mínimo, el valor máximo, y cualquier valor dentro del rango)
	 */
	@Test
	public void testValorDentroRango() {
		assertEquals(5040, test.factorial(7));
	}

	@Test
	public void testValorLimiteInferior() {
		assertEquals(6, test.factorial(3));
	}

	@Test
	public void testValorLimiteSuperior() {
		assertEquals(738197504, test.factorial(31));
	}

	/*
	 * Por último, vamos a probar con dos valores fuera de rango, siendo uno de
	 * ellos negativo.
	 */
	@Test
	public void testValorFueraRango() {
		assertEquals(-1, test.factorial(999));
	}

	@Test
	public void testValorNegativo() {
		assertEquals(-1, test.factorial(-2));

	}
}

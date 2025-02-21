/**
 * 
 */
package com.concretas;

import logistica.Transporte;

/**
 * 
 */
public class Bicicleta implements Transporte {

	@Override
	public void entregar() {
		System.out.println("Entrega feita por bicicleta");

	}

}

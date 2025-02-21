/**
 * 
 */
package com.concretas;

import logistica.Transporte;

/**
 * 
 */
public class Caminhao implements Transporte {

	@Override
	public void entregar() {
		System.out.println("Entrega feita por caminhão");

	}

}

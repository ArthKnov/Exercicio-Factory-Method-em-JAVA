/**
 * 
 */
package com.concretas;

import logistica.Transporte;

/**
 * 
 */
public class Aéreo implements Transporte {

	@Override
	public void entregar() {
		System.out.println("Entrega feita por avião");

	}

}

/**
 * 
 */
package com.factory;

import com.concretas.Navio;

import logistica.Transporte;

/**
 * 
 */
public class NavioFactory extends TransporteFactory {
	@Override
	public Transporte criarTransporte() {
		return new Navio();
	}
}


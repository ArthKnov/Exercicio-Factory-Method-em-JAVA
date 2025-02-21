/**
 * 
 */
package com.factory;

import com.concretas.Aéreo;

import logistica.Transporte;

/**
 * 
 */
public class AéreoFactory extends TransporteFactory {

	@Override
	public Transporte criarTransporte() {
		return new Aéreo();
	}

}

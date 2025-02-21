/**
 * 
 */
package com.factory;

import com.concretas.Bicicleta;

import logistica.Transporte;

/**
 * 
 */
public class BicicletaFactory extends TransporteFactory {

	@Override
	public Transporte criarTransporte() {
		return new Bicicleta();
	}

}

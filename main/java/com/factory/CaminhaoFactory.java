/**
 * 
 */
package com.factory;

import com.concretas.Caminhao;

import logistica.Transporte;

/**
 * 
 */
public class CaminhaoFactory extends TransporteFactory {
	@Override
	public Transporte criarTransporte() {
		return new Caminhao();
	}

}

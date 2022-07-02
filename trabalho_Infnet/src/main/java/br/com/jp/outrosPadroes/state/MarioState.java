package br.com.jp.outrosPadroes.state;

public interface MarioState {
	MarioState pegarCogumelo();

	MarioState pegarFlor();

	MarioState pegarPena();

	MarioState levarDano();
}

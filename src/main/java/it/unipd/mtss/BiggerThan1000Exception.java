////////////////////////////////////////////////////////////////////
// Sabrina Caniato 2042351
// Veronica Tecchiati 2034309
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

public class BiggerThan1000Exception extends Exception {
	public BiggerThan1000Exception() {
		super("I numeri maggiori di 1000 non sono supportati da questo convertitore.");
	}
}
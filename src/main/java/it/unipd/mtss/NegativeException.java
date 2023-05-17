////////////////////////////////////////////////////////////////////
// Sabrina Caniato 2042351
// Veronica Tecchiati 2034309
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

public class NegativeException extends Exception {
	public NegativeException() {
		super("I numeri negativi non sono rappresentabili nel sistema di numerazione romano.");
	}
}
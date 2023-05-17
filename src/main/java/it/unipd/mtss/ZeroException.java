////////////////////////////////////////////////////////////////////
// Sabrina Caniato 2042351
// Veronica Tecchiati 2034309
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

public class ZeroException extends Exception {
	public ZeroException() {
		super("0 non è rappresentabile nel sistema di numerazione romano.");
	}
}
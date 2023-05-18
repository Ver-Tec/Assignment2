////////////////////////////////////////////////////////////////////
// Sabrina Caniato 2042351
// Veronica Tecchiati 2034309
////////////////////////////////////////////////////////////////////
package it.unipd.mtss;

public class NotRomanException extends Exception{
 public NotRomanException(char c){
  super(c +"Non fa parte del sistema di numerazione romano");
 }
}


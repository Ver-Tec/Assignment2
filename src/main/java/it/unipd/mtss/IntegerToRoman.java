////////////////////////////////////////////////////////////////////
// Sabrina Caniato 2042351
// Veronica Tecchiati 2034309
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

public class IntegerToRoman {

public static String convert(int number) throws ZeroException, 
  NegativeException, BiggerThan1000Exception {
  if(number==0) {throw new ZeroException();}
  if(number<0) {throw new NegativeException();}
  if(number>3999) {throw new BiggerThan1000Exception();}
  String[] thousands = {"","M"};
  String[] hundreds = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
  String[] tens = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
  String[] units = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
  return thousands[number/1000] + hundreds[(number%1000)/100] + tens[(number%100)/10] + units[number%10];
  }
}

////////////////////////////////////////////////////////////////////
// Sabrina Caniato 2042351
// Veronica Tecchiati 2034309
////////////////////////////////////////////////////////////////////
package it.unipd.mtss;

import java.util.Arrays;

public class RomanPrinter {
 public static String print(int num) throws ZeroException, NegativeNumberException,
 BiggerThan1000Exception{
  return printAsciiArt(IntegerToRoman.convert(num));
 }

 private static String printAsciiArt(String romanNumber) throws NotRomanException{

 String[] I ={
 "  _____  ",
 " |_   _| ",
 "   | |   ",
 "   | |   ",
 "  _| |_  ",
 " |_____| "};


 String[] V ={
 " __      __ ",
 " \\ \\    / / ",
 "  \\ \\  / /  ",
 "   \\ \\/ /   ",
 "    \\  /    ",
 "     \\/     "};


 String[] X ={" __   __  ",
 " \\ \\ / /  ",
 "  \\ V /   ",
 "   > <    ",
 "  / . \\   ",
 " /_/ \\_\\  "
 };


 String[] L ={
 "  _       ",
 " | |      ",
 " | |      ",
 " | |      ",
 " | |____  ",
 " |______| "
 };


 String[] C ={
 "   _____   ",
 "  / ____|  ",
 " | |       ",
 " | |       ",
 " | |____   ",
 "  \\_____|  "
 };


 String[] D ={
 "  ____    ",
 " |  __ \\  ",
 " | |  | | ",
 " | |  | | ",
 " | |__| | ",
 " |_____/  "
 };



 String[] M ={
 "  __  __   ",
 " |  \\/  |  ",
 " | \\  / |  ",
 " | |\\/| |  ",
 " | |  | |  ",
 " |_|  |_|  "};


 String res="";


 for (int i=0; i<6;i++){
  for (char c : romanNumber.toCharArray()) {
   if(c =='I') {res+= I[i];}
   if(c =='V') {res+= V[i];}
   if(c =='X') {res+= X[i];}
   if(c =='L') {res+= L[i];}
   if(c =='C') {res+= C[i];}
   if(c =='D') {res+= D[i];}
   if(c =='M') {res+= M[i];}

  if (c!='I'&& c!='V'&& c!= 'X' && c!= 'L' && c!='C' && c!='D'&& c!='M'){
    throw new NotRomanException(c);
 }
}

res+="\n";
}

return res;
}

};
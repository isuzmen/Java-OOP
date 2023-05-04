public class HW2{

  /*The method for determining whether the inputs are the same up to the value x.*/
  public static boolean samePrefix(String input1, String input2, int x){
   int sayac = 0;
   for(int i = 0 ; i < input1.length() && i < input2.length() ; i++){
      if(input1.charAt(i) == input2.charAt(i)){
         sayac = sayac + 1;
      }
   }
   if(sayac == x){
     return true;
   }
   else if(x < sayac){
     return true;
   }
   else if(x > sayac){
     return false;
   }
   else{
    return false;
   }
 }
  
  /*It is a method that deletes the spaces at the beginning of the text and leaves the spaces in it.*/
  public static String trimSpacesFromFront(String value){
    StringBuilder s = new StringBuilder();
    int x = 0;
    for(int i = 0; i < value.length() && value.charAt(i) == ' '; i++){
       x++;
    }
    for(int j = x; j < value.length(); j++){
        s.append(value.charAt(j));
    }
    return s.toString();
  }
  
  /*It is a method that repeats the characters of value1 as much as the value of value2.*/
  public static String repeatChars(String value1, int value2){
    StringBuilder s = new StringBuilder();
    for(int i = 0 ; i < value1.length() ; i++){
      for(int j = 0; j < value2 ; j++){
         s.append(value1.charAt(i));
      }
        
    }
    return s.toString();
  }
  
  /*It is a method for counting the number of words in a text.*/
  public static int countWords(String par){
    int w = 0, d = 0, i = 0;
    while(i < par.length()){
         if(par.charAt(i) == ' '){
            d = 0;
         }
         else if(par.charAt(i) != ' '){
            d = d + 1;
         }
         if(d == 1){
            w = w + 1;
         }
         i++;
    }
    return w;
  }
 
}
  



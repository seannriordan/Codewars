import java.util.*;

public class Isogram {
    public static boolean  isIsogram(String str) {
      StringBuilder word = new StringBuilder(str);
      LinkedList <Character> count = new LinkedList <>();
      LinkedList <Character> mult = new LinkedList <>();
    
 
      for(int i = 0; i < word.length(); i++) {
        if(count.contains(Character.toLowerCase(word.charAt(i)))){
          mult.add(Character.toLowerCase(word.charAt(i)));
        } else {
          count.add(Character.toLowerCase(word.charAt(i)));
        }
      }

      for(int i = 0; i < word.length(); i++) {
        if(mult.contains(Character.toLowerCase(word.charAt(i)))){
          return false;
        }
      }
     
      return true;
    
    } 
}

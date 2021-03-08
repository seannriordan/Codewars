import java.util.*;

public class DuplicateEncoder {
  static String encode(String word){
    
    StringBuilder parent = new StringBuilder(word);
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
        parent.setCharAt(i, ')');
      } else {
        parent.setCharAt(i, '(');
      }
    }
    word = parent.toString();
    return word;
  }
}

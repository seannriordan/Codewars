public class Ugly {
  public static String uglifyWord(String str) {
    
    boolean flag = true;
    StringBuilder word = new StringBuilder(str);
    
    for(int i = 0; i < str.length(); i++) {
      if(!Character.isLetter(str.charAt(i))) {
        flag = true;        
        
      } else {
        
        if(flag){
          word.setCharAt(i, Character.toUpperCase(str.charAt(i)));
          flag = false;
        } else {
          word.setCharAt(i, Character.toLowerCase(str.charAt(i)));
          flag = true;
        }
        
      }
    }
    return word.toString();
  }
}

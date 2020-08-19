package Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Testinterview1 {
	public void demo() {
	List<Map<String,String>> people = new ArrayList<Map<String,String>>();
	
	}
 public static void main(String[] args) {
     String given="Reverse individual words in a given sentence";
String[] str=given.split(" ");
String s="";
  for(String st:str){
      for(int i=st.length()-1;i>=0;i--){
       s+=st.charAt(i);
}
     

}
System.out.println(s);
}
}

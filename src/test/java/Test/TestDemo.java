package Test;

import java.util.HashMap;

import org.testng.annotations.Test;

public class TestDemo {
@Test
 public void testDemo() {
	   HashMap<Object,Object> hs=new HashMap();
	   HashMap<String,String> hs1=new HashMap();
	   HashMap<String,String> hs2=new HashMap();
	     hs1.put("accountNumber","{{accountnumber}}");
	     hs1.put("ifscCode","{{accountnumber}}");
	     hs1.put("name","IDFB0010201");
	     hs1.put("accountNumber","lokesh");
	   hs1.put("note","{{Bffuserid}}"); 
	     hs2.put("conversionRefId","{{Conversationid}}");
	  hs.put(hs1, hs2);
	  System.out.println(hs);

}
}

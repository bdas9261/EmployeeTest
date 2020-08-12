package Test;


import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;


import static io.restassured.RestAssured.given;

import java.util.ArrayList;

import org.apache.tools.ant.types.CommandlineJava.SysProperties;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.sun.xml.fastinfoset.sax.Properties;

import Utils.Base;

public class TestScenario extends Base {
	@Test(priority=1,enabled =true)
	public void validateStatuscode() {
		Response response= given().when().get(prop.getProperty("Endpoint"));
		Assert.assertEquals(200, response.getStatusCode());
		System.out.println(response.getStatusCode());
	}
	@Test(priority=2,enabled =true)
	   public void validateResponseheader() {
			Response response= given().when().get(prop.getProperty("Endpoint"));
			String responsebody=response.asString();
			JsonPath jp=new JsonPath(responsebody);
			Assert.assertEquals("application/json; charset=UTF-8", response.getHeader("Content-Type").toString() );
			Assert.assertEquals("Google Frontend", response.getHeader("Server").toString() );
			Assert.assertEquals("282", response.getHeader("Content-Length").toString() );

			System.out.println(response.getHeaders());
		
	   }
	@Test(priority=3,enabled =true)
   public void validateResponsebody() {
		Response response= given().when().get(prop.getProperty("Endpoint"));
		String responsebody=response.asString();
		JsonPath jp=new JsonPath(responsebody);
		Assert.assertEquals(200, jp.get("status"));
		String  age=jp.getString("employeeData.age");
		String aage=age.substring(1, 3);
		Assert.assertEquals("25", aage);
		String  role=jp.getString("employeeData.role");
		String arole=role.substring(1, 24);
		Assert.assertEquals("QA Automation Developer", arole);
		String  date=jp.getString("employeeData.dob");
		String adate=date.substring(1, 11);
		Assert.assertEquals("25-02-1994", adate);
		Assert.assertEquals("data retrieved successful", jp.get("message"));
   }
	//@Test(priority=4,enabled =true)
	   public void validateResponsebodywithCompanyname() {
			Response response= given().when().get(prop.getProperty("Endpoint"));
			String responsebody=response.asString();
			JsonPath jp=new JsonPath(responsebody);
			Assert.assertEquals("ABC Infotech", jp.get("employeeData.company"));
			
	   }
		
}

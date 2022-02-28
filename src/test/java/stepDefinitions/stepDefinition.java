package stepDefinitions;

import java.util.List;

//import com.sun.tools.javac.util.List;

import io.cucumber.datatable.DataTable;
//import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.testng.*;
//import io.cucumber.testng.*; 


public class stepDefinition {

		
	@Given("^User is on NetBanking landing Page$")
	public void user_is_on_NetBanking_Landing() throws Throwable
	{
		// code here
		System.out.println("User is on NetBanking landing Page");
		//throw new io.cucumber.java.PendingException();
	}
	
	 /* @When("^User login into application with $")
	    public void user_login_into_application_with(DataTable dataList<A>rows Throwable {
		  List<List<String>> obj=data.raw();
		  System.out.println(obj.get(0).get(0))
	        
	        System.out.println("User login into application with username and password_Params");
	        System.out.println("User Name: " + strArg1 + "  Password: " + strArg2 );*/
	 		
	 
	//@When("^User login into application with \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" $")
	@When("^User login into application with$")
	 	    public void user_login_into_application_with(String strArg1, String strArg2, String strArg3) throws Throwable {
	        //throw new PendingException();
	        System.out.println("User login into application with username and password_Params");
	        System.out.println("User Name: " + strArg1 + "  Password: " + strArg2 + strArg3 );
	 
	    }
		
	
	@Then("^Home page is populated$") 
	public void User_home_page () throws Throwable
	{
		System.out.println("Home page is populated");
		//throw new io.cucumber.java.PendingException();
		}
	
	@And("^Cards are displayed \"([^\"]*)\"$") 
	public void Cards_are_displayed(String strArg3) throws Throwable
	{
		System.out.println("Cards are displayed: " + strArg3 );
		//throw new io.cucumber.java.PendingException();
		
	}
	
}

package definitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;

public class fffStepdefs {
    @Given("^I write java code$")
    public void iWriteJavaCode() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Hello world");
        String FirstName = "Vasyly";
        String lastName = "Ttttt";
        String FavoriteColor = "Blue";

        System.out.println(FirstName);
        System.out.println(lastName);
        System.out.println(FavoriteColor);

        System.out.println("Hi my name is "+FirstName+" "+lastName+", my favorite color is "+FavoriteColor);

        System.out.println(FirstName.toUpperCase()+" "+lastName.toUpperCase());



    }

    @Given("^I print \"([^\"]*)\" argument$")
    public void iPrintArgument(String variab) throws Throwable {
        System.out.println(variab);
        System.out.println(variab.equals("Slava"));
    }
}

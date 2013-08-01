package foo;

import cucumber.api.java.en.Then;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class HelloStepdefs {
    @Then("buh")
    public void it_should_answer_with() {
        assertThat(1+1, is(2));
    }
}

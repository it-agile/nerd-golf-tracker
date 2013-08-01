package foo;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import cucumber.api.java.en.Then;

public class HelloStepdefs {
    @Then("buh")
    public void it_should_answer_with() {
        assertThat(1+1, is(2));
    }
}

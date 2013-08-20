package de.itagile.golf;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import cucumber.api.java.en.Then;

public class HelloSteps {
    @Then("buh")
    public void it_should_answer_with() {
        assertThat(1+1, is(2));
    }
}

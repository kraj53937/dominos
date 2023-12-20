package org.real_stepdef;

import org.dominos_Real_baseclass.Real_baseclass_dominos;
import org.dominos_Real_pom.Real_pom_dominos;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Dominos_real_stepdef extends Real_baseclass_dominos {

	Real_pom_dominos rpom = new Real_pom_dominos();

	@Given("user is on dominos website")
	public void user_is_on_dominos_website() {
		driver.get("www.dominos.co.in");

	}

	@When("click the order online")
	public void click_the_order_online() {

	}

	@When("click on location button and enter the location details")
	public void click_on_location_button_and_enter_the_location_details() {

	}

	@When("select the veg pizza and beverages")
	public void select_the_veg_pizza_and_beverages() {

	}

	@When("remove the quantity of the order in the add to cart")
	public void remove_the_quantity_of_the_order_in_the_add_to_cart() {

	}

	@Then("check out the order and close the window")
	public void check_out_the_order_and_close_the_window() {

	}

}
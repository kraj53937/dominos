package org.real_runner;

import org.dominos_Real_baseclass.Real_baseclass_dominos;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\Real_time_step\\Dominos.feature", dryRun = true, glue = "org.real_stepdef")

public class Dominos_real_runner extends Real_baseclass_dominos {

	@BeforeClass
	public static void start() {
		driver = new EdgeDriver();

	}
}

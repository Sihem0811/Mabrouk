package Runner;


import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(

		features = {"src/test/resources/Features/HomePageMabrouk.feature",

				"src/test/resources/Features/ChemiseEtBlousePageMabrouk.feature",

		"src/test/resources/Features/ProductChemiseEtBlousePageMabrouk.feature"	},



		glue="StepDef",

		plugin = {"pretty", "html:target/Cucumber-report.html",
				     "json:target/cucumber-report.json" //
				 }
		)
public class Runner {

}

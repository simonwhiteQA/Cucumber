package com.qa.cucumber;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"classpath:features"},
				 glue = {"classpath:com.qa.cucumber"},
				 snippets = SnippetType.CAMELCASE,
				 plugin = {"summary",
						   "html:target/bing/cucumber-html-report.html",
						   "junit:target/bing/cucumber-junit-report.xml"
				 },
				 monochrome = true,
				 tags = "@alert"
)


public class CucumberRunner {

}

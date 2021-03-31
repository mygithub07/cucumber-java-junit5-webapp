# api-rest-assured-junit5

This project 

- Is used to deploy a sample web app
- Runs api tests using cucumber
- uses junit 5
- uses assertj-core
- uses json-unit
- Integrate with azure pipelines (YAML) and generates cucumber report in the pipeline.
- for intellij - install intellij plugin gherkin and cucumber for java  for proper gherkin formatting
- check that cucumber.execution.dry-run= false in  junit-platform.prperties file before running (otherwise the project will only do a dry-run)
- cucumber.plugin property in  junit-platform.prperties determines the type of report




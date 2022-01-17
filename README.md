[![Scala Exercise](https://github.com/EqualExperts/data-engineering-exercise-scala/actions/workflows/scala-exercise.yml/badge.svg)](https://github.com/EqualExperts/data-engineering-exercise-scala/actions/workflows/scala-exercise.yml)
## Data Engineering Challenge
Thank you for taking the time to participate in this challenge. Please read carefully all the instructions below and don’t hesitate to contact us if you have any queries. 

As a Data Engineer, you should NOT find this exercise to be particularly difficult. 
We are expecting a simple solution that addresses just what is asked, and you should take no more than 90 minutes.

## Exercise Instructions 

Imagine that you are working in an organisation, and the data scientists/analysts need data from Stackexchange (Posts and Votes) to make data analysis. The exercise consists in making a light data pipeline which ingests data from json files into a data warehouse. To simplify the exercise you should consider you just need to ingest the data which is in files, there is no need to implement a strategy to coupe with a continuous ingestion, neither with a large amount of data. Although we'll ask a question at the end that you can elaborate what will you change in your strategy to coupe with that.

This repo contains a bootstrap project to create the data ingestion in scala.
The project is set up to be executed inside an sbt-docker image, so the versions of scala and java and sbt can be easily replicate. You are free to change anything about this bootstrap solution as you see fit (import another libs, create/delete src files, for example), so long as it can still be executed by a reviewer.

- The project is set up to use scala 2.12.10 and sbt 1.3.5
- H2 database provides an infrastructure-free simple data warehouse stand-in
- Testing environment with scalatest
- Facilites to compile, test and run inside the sbt-docker container.

[Makefile](Makefile) is provided with the following targets:
  - `make compile`
  - `make test`
  - `make fetch-data`
  - `make run`

[ExerciseApp.scala](src/main/scala/com/exercise/ExerciseApp.scala) is provided as an entry point with some illustrative code reading one entry of json from one of the files.

[ExerciseSpec.spec](src/test/scala/com/exercise/ExerciseSpec.scala) contains a test showing a sample usage of h2 database.

The sample code and test provided are meant to be deleted when you start to develop your solution.

#### Your data ingestion should take into consideration the following:
- the database schema should be suitable for analytical queries;
- basic data quality issues should be handled on the ingestion;
- the ingestion code and strategy should be production level.

#### Things we value:
- Self-explanatory code – the solution must speak for itself. Multiple paragraphs explaining the solution are a sign that isn’t straightforward enough to understand purely by reading the code. Also, you should ensure your code is correctly formatted and lints cleanly.
- Tests – the solution must be well tested and possibly using a (test­-first) approach.
- Simplicity – We value simplicity as an architectural virtue and a development practice. Solutions should reflect the difficulty of the assigned task, and should NOT be overly complex. Layers of abstraction, patterns, or architectural features that aren’t called for should NOT be included.

### Final notes
Please include instructions about your strategy and important decisions you made. Also please answer the following questions: 
- How did you meet the data scientist needs?
- How did you ensure data quality?
- What would need to change for the solution scale to work with a 10TB dataset with new data arriving each day?

Your submission is your own work, you will not share your submission with others (including sharing your repository on Github) and you will not otherwise engage in activities that dishonestly improve your result.

## Next Phase
We are expecting you to succeed in this phase, so the next phase is an interview where we are expecting that you can show and run your solution on your end. 
You walk us through your solution and we're going to provide feedback and discuss any choices that you made.  
Apart from the exercise, we'll have a conversation about your experience, and you'll let us know in detail your past challenges and your future expectations. Good Luck!

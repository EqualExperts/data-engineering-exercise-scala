docker_run = docker run --mount type=bind,source="$(shell pwd)",target=/root/ --rm hseeberger/scala-sbt:8u222_1.3.5_2.13.1
compile:
	 $(docker_run) sbt clean compile
test:
	 $(docker_run) sbt clean test 
fetch-data:
	./fetch_data.sh
run: fetch-data
	 $(docker_run) sbt run
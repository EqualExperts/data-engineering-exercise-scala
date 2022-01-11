package com.exercise
import scala.io.Source

object ExerciseApp extends App {
      //The following code is purely illustrative
      val source = Source.fromFile("uncommitted/Posts.json")
      val jsonString = source.getLines.mkString
      source.close()
      val data = ujson.read(jsonString)
      print(data(0))
}
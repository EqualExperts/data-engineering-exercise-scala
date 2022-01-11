package com.exercise
import org.scalatest.flatspec.AnyFlatSpec
import java.sql.{Connection, DriverManager, Statement}

class ExerciseSpec extends AnyFlatSpec {
 "Database" should "accept statements" in {
     var row1InsertionCheck = false
     val con: Connection = DriverManager.getConnection("jdbc:h2:./warehouse")
     val stm: Statement = con.createStatement
     val rs = stm.executeQuery("select 1")
     rs.next
     assert((1 == rs.getInt(1)), "Statement didn't execute correctly")
 }   
}
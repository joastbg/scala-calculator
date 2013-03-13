package net.joastbg.scalacalc

import org.specs2.mutable._

class CalcSpecs extends Specification {
  "the ExprParser" should {
    "throw exception on malformed expression string" in {
      val str = "1^2../1"      
      ExprParser.apply(str) must throwA[RuntimeException]
    }
    "return result for correct expresson string" in {
      val str = "(1+2)*3"
      val vals = Map[String, Double]("x" -> 4, "y" -> 3)
      val expr = ExprParser.apply(str)
      val res = ExprEval.eval(expr, vals)
    }
  }
}
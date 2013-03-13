package net.joastbg.scalacalc

object ScalaCalc extends App {

	// Init variables
  val vals = Map[String, Double]("x" -> 4, "y" -> 3)
	vals.foreach(p => println(p._1 + "=" + p._2))

  // Parse expression
  val str = "12.0*2.5 + x*(y+50)*1.23"
  val expr = ExprParser.apply(str)

	// Evaluate expression
	val res = ExprEval.eval(expr, vals)

	println("Expression => " + str)
	println("Equals => " + res)
}
package com.nberserk.scala

/**
 * @author ${user.name}
 */
object App {

  def hello = {println("hello")}
  
  def foo(x : Array[String]) = x.foldLeft("")((a,b) => a + b)
  
  def main(args : Array[String]) {
    println( "Hello World!" )
    println("concat arguments = " + foo(args))
  }

}

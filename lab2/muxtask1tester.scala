// package lab2
//  import chisel3._
//  import chisel3.tester._
//  import org.scalatest.FreeSpec
//  import chisel3.experimental.BundleLiterals._

//  class ex2tester extends FreeSpec with ChiselScalatestTester{
//      " task2 " in {
//          test(new Muxtask1){ a=>
//          a.io.sel.poke(0.U)
//          a.io.out.expect(0.U)
//          a.clock.step(10)
//          }}}
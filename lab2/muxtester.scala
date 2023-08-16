// package lab2
// import chisel3._
// import chisel3.tester._
// import org.scalatest.FreeSpec
// import chisel3.experimental.BundleLiterals._

// class muxtester extends FreeSpec with ChiselScalatestTester{
//     "multiplexer eg 1 " in {
//         test(new Mux2){ a=>
//         a.clock.step(1)
//         a.io.inA.poke(0.U)
//         a.io.inB.poke(1.U)
//         a.io.select.poke(0.B)
//         a.io.out.expect(1.U)
//         }}}
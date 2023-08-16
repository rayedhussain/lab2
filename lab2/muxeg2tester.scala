// package lab2
// import chisel3._
// import chisel3.tester._
// import org.scalatest.FreeSpec
// import chisel3.experimental.BundleLiterals._

// class muxeg2tester extends FreeSpec with ChiselScalatestTester{
//     "multiplexer eg 2 " in {
//         test(new Muxing ){ a=>
//         a.clock.step(10)
//         a.io.in.poke(0.U)
//         a.io.s0.poke(0.B)
//         a.io.s1.poke(1.B)
//         a.io.s2.poke(1.B)
//         a.io.out.expect(1.U)
//         }}}

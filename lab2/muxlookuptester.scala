// package lab2
// import chisel3._
// import chisel3.tester._
// import org.scalatest.FreeSpec
// import chisel3.experimental.BundleLiterals._

// class muxcasetester extends FreeSpec with ChiselScalatestTester{
//     "multiplexer eg 1 " in {
//         test(new MuxLookup){ a=>
//         a.clock.step(1)
//         a.io.in0.poke(0.B)
//         a.io.in1.poke(1.B)
//         a.io.in2.poke(0.B)
//         a.io.in3.poke(1.B)
//         a.io.in4.poke(0.B)
//         a.io.in5.poke(1.B)
//         a.io.in6.poke(0.B)
//         a.io.in7.poke(1.B)
//         a.io.sel.poke(3.U)
//         a.io.out.expect(1.B)
//         }}}
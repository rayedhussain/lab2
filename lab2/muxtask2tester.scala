package lab2
import chisel3._
import chisel3.tester._
import org.scalatest.FreeSpec
import chisel3.experimental.BundleLiterals._

class muxtask2tester extends FreeSpec with ChiselScalatestTester{
    "multiplexer eg 1 " in {
        test(new muxtask2){ a=>
        a.clock.step(20)
        a.io.A.poke(0.B)
        a.io.B.poke(0.B)
        a.io.C.poke(0.B)
        a.io.D.poke(0.B)
        a.io.sel.poke(1.U)
        a.io.shiftsel.poke(0.B)
        a.io.output1.expect(0.B)
        a.io.output2.expect(0.B)
        a.io.output3.expect(0.B)
        a.io.output4.expect(0.B)
        }}}
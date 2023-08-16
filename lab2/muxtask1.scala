// package lab2
// import chisel3 . _
// class LM_IO_Interface extends Bundle {

//     val sel = Input(UInt(3.W)) // 3-bit select signal
//     val out = Output ( UInt (1. W ) )
// }
// class Muxtask1 extends Module {
//     val io = IO ( new LM_IO_Interface )
//      when(io.sel === 0.U) {
//     io.out := 0.U
//   } .elsewhen(io.sel === 1.U) {
//     io.out := 8.U
//   } .elsewhen(io.sel === 2.U) {
//     io.out := 16.U
//   } .elsewhen(io.sel === 3.U) {
//     io.out := 24.U
//   } .otherwise {
//     io.out := 32.U
//   }
// }

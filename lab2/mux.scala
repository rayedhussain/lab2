
// package lab2
// import chisel3 . _
// // Mux IO interface class

// class Mux1 extends Bundle {
// val inA = Input ( UInt (32. W ) )
// val inB = Input ( UInt (32. W ) )
// val select = Input ( Bool () )
// val out = Output ( UInt (32.W) )
// }

// // 2 to 1 Mux implementation
// class Mux2 extends Module {
// val io = IO ( new Mux1 )
// // update the output
// io.out := Mux ( io.select , io.inA , io.inB )
// }
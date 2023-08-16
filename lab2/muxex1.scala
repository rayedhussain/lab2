// 2.2. MUX: A SIMPLE COMBINATIONAL BLOCK 17
// import chisel3 . _
// // Mux IO interface class
// class Muxex1a extends Bundle {
// val inA = Input ( UInt (32. W ) )
// val inB = Input ( UInt (32. W ) )
// val select = Input ( Bool () )
// val out = Output ( UInt () )
// }
// // 2 to 1 Mux implementation
// class Muxex1b extends Module {
// val io = IO ( new Muxex1a )
// // update the output
// io . out :=  io . select & io . in_A |   io . in_B & (~io.select)
// }
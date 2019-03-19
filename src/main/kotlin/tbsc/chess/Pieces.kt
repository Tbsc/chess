package tbsc.chess

interface Piece {
    val board: Board

    fun move(toX: Int, toY: Int)
    fun capture(toX: Int, toY: Int)

    val x: Int
    val y: Int
}

class Pawn(override val board: Board, override val x: Int, override val y: Int) : Piece {
    override fun move(toX: Int, toY: Int) {
    }

    override fun capture(toX: Int, toY: Int) {
    }

}

class Knight : Piece {

}

class Bishop : Piece {

}

class Rook : Piece {

}

class Queen : Piece {

}

class King : Piece {

}
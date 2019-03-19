package tbsc.chess

import com.xenomachina.argparser.ArgParser
import com.xenomachina.argparser.mainBody

fun main(args: Array<String>) = mainBody {
    val args = ArgParser(args).parseInto(::Arguments)
}

class Arguments(parser: ArgParser) {

}
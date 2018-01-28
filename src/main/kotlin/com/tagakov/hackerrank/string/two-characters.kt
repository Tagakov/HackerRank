import java.util.*

fun main(args: Array<String>) {
    val string = Scanner(System.`in`).run { next(); next(); }
    val letters = string.toSet()

    letters.flatMap { one ->
        letters.map { another ->
            string.filter { it == one || it == another }.takeIf { it.isValid() }?.length ?: 0
        }
    }.max().also { print(it) }
}

fun String.isValid() = length > 1 && (0..length - 2).none { get(it) == get(it + 1) }
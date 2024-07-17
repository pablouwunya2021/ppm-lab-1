fun firstNonRepeatingCharacter(string: String): Int {
    val charCount = mutableMapOf<Char, Int>()

    // Contar la frecuencia de cada carácter en la cadena
    for (char in string) {
        charCount[char] = charCount.getOrDefault(char, 0) + 1
    }

    // Encontrar el primer carácter que aparece solo una vez
    for ((index, char) in string.withIndex()) {
        if (charCount[char] == 1) {
            return index
        }
    }

    // Si no hay caracteres no repetidos, devolver -1
    return -1
}

fun main() {
    val string1 = "abcdcaf"
    println(firstNonRepeatingCharacter(string1))  // Output: 1

    val string2 = "aabbcc"
    println(firstNonRepeatingCharacter(string2))  // Output: -1

    val string3 = "aabbc"
    println(firstNonRepeatingCharacter(string3))  // Output: 4
}

fun ubah(input: String): String {
    var hasil = ""
    for (karakter in input) {
        hasil += if (karakter == 'o') 'a' else karakter
    }
    return hasil
}

fun main() {
    val katasebelumnya = "Purwokerto"
    val katasesudahdiubah = ubah(katasebelumnya)

    println("Kata sebelumnya: $katasebelumnya")
    println("Kata setelah diubah: $katasesudahdiubah")
}

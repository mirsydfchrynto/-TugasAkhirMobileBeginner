fun main() {
    println("Masukkan Nilai UN:")
    print("Nilai Bahasa Indonesia: ")
    val indonesia = readLine()?.toDoubleOrNull() ?: return println("Nilai harus diisi dengan angka.")
    print("Nilai Bahasa Inggris: ")
    val inggris = readLine()?.toDoubleOrNull() ?: return println("Nilai harus diisi dengan angka.")
    print("Nilai Matematika: ")
    val matematika = readLine()?.toDoubleOrNull() ?: return println("Nilai harus diisi dengan angka.")
    print("Nilai IPA: ")
    val ipa = readLine()?.toDoubleOrNull() ?: return println("Nilai harus diisi dengan angka.")

    val ratarata = (indonesia + inggris + matematika + ipa) / 4
    val grade = when {
        ratarata >= 90 -> "A"
        ratarata >= 80 -> "B"
        ratarata >= 70 -> "C"
        ratarata >= 60 -> "D"
        else -> "E"
    }

    println("Rata-rata Nilai: $ratarata")
    println("Grade: $grade")
}

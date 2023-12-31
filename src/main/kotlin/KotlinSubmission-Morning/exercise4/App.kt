package id.infinitelearning.KotlinSubmission.exercise4


    /**
     * Buatlah contoh code penggunaan try catch untuk menangani suatu kasus sesuai keinginan teman-teman
     *
     */
    // Buat di bawah sini


    //contoh penggunaan try dan catch untuk menangani kasus pembagian angka oleh nol.

    fun main() {
        val numerator = 10
        val denominator = 0

        try {
            val result = divide(numerator, denominator)
            println("Hasil pembagian: $result")
        } catch (e: ArithmeticException) {
            println("Terjadi kesalahan aritmatika: ${e.message}")
        }
    }

fun divide(numerator: Int, denominator: Int): Int {
    if (denominator == 0) {
        throw ArithmeticException("Pembagian oleh nol tidak dapat dilakukan")
    }
    return numerator / denominator
}

package id.infinitelearning.KotlinSubmission.exercise5

fun main() {

    /**
     * Latihan 1
     * Buat variable dengan nama hero dibawah ini dan isi nilai variable tersebut dengan class Hero
     *
     */
    class Hero {
        fun jalan(times: Int) {
            println("Melakukan aksi jalan sebanyak $times kali")
        }

        fun lari(times: Int) {
            println("Melakukan aksi lari sebanyak $times kali")
        }

        fun makan(times: Int) {
            println("Melakukan aksi makan sebanyak $times kali")
        }

        fun minum(times: Int) {
            println("Melakukan aksi minum sebanyak $times kali")
        }

        fun lompat(times: Int) {
            println("Melakukan aksi lompat sebanyak $times kali")
        }

        fun duduk(times: Int) {
            println("Melakukan aksi duduk sebanyak $times kali")
        }
    }

    /**
     * Latihan 2
     * Set data profile dengan memanggil fungsi setProfile() dibawah ini
     * Dan isi argumen-argumen / data dari parameter sesuai data diri Anda (Name, Age, Height)
     *
     */
    fun setProfile(name: String, age: Int, weight: Double, height: Double) {
        println("Data Profile:")
        println("Nama: $name")
        println("Usia: $age tahun")
        println("Berat: $weight kg")
        println("Tinggi: $height cm")
    }

    setProfile("Muhammad Aldiansyah", 21, 60.0, 160.0)

    /**
     * Latihan 3
     * Tampilkan data profile dibawah ini, sebelum melakukan aktivitas
     *
     */

    fun showProfileBeforeActivity() {
        // Panggil fungsi setProfile() dengan data yang sesuai di sini jika belum dipanggil sebelumnya
    }

    showProfileBeforeActivity()

    /**
    Challenge:
    ===============Class A Morning===============
    Uprising Moon Inteligent -> jalan 5x, lari 2x, makan 3x, minum 1x, lompat 3x, duduk 1x
    Codenesia -> jalan 2x, lari 2x, makan 1x, minum 3x, lompat 1x, duduk 2x
    Massive Bareng -> jalan 3x, lari 1x, makan 5x, minum 1x, lompat 5x, duduk 3x
    POSESIVE -> jalan 5x, lari 4x, makan 4x, minum 4x, lompat 3x, duduk 2x
    Shelter Nerd -> jalan 4x, lari 1x, makan 3x, minum 5x, lompat 5x, duduk 3x
    Fantastic Ten -> jalan 2x, lari 4x, makan 2x, minum 2x, lompat 7x, duduk 4x
    TitansTech -> jalan 1x, lari 3x, makan 1x, minum 1x, lompat 2x, duduk 1x
    Masapuan -> jalan 3x, lari 2x, makan 4x, minum 1x, lompat 5x, duduk 1x
    CollaboraCrew -> jalan 4x, lari 2x, makan 1x, minum 5x, lompat 2x, duduk 3x
    CodeSmiths -> jalan 1x, lari 3x, makan 2x, minum 5x, lompat 4x, duduk 1x
    Webdroid -> jalan 5x, lari 3x, makan 1x, minum 2x, lompat 3x, duduk 2x
    Dasa Impi ->7: jalan 1x, lari 2x, makan 3x, minum 4x, lompat 5x, duduk 6x
    LogicLiberators -> jalan 2x, lari 1x, makan 5x, minum 2x, lompat 3x, duduk 1x
    Fifty-One -> jalan 2x, lari 1x, makan 2x, minum 1x, lompat 2x, duduk 4x */

    /**
     * Latihan 4
     * Jalankan aktivitas-aktivitas dengan memanggil fungsi-fungsi sesuai challenge diatas
     *
     */
    fun runActivities() {
        val activities = mapOf(
            "Uprising Moon Inteligent" to listOf(5, 2, 3, 1, 3, 1),
            "Codenesia" to listOf(2, 2, 1, 3, 1, 2),
            // Tambahkan daftar kelas lainnya beserta aktivitasnya
            // ...
        )

        for ((className, activity) in activities) {
            val hero = Hero()
            hero.jalan(activity[0])
            hero.lari(activity[1])
            hero.makan(activity[2])
            hero.minum(activity[3])
            hero.lompat(activity[4])
            hero.duduk(activity[5])

            println("===$className===")
            println("$className -> jalan ${activity[0]}x, lari ${activity[1]}x, makan ${activity[2]}x, minum ${activity[3]}x, lompat ${activity[4]}x, duduk ${activity[5]}x")
        }
    }

    runActivities()



    /**
     * Latihan 5
     * Panggil fungsi profile dibawah ini untuk menampilkan status terkini setelah melakukan aktivitas
     *
     */
    fun profile() {
        // Tampilkan status terkini setelah melakukan aktivitas
    }

    profile()
}


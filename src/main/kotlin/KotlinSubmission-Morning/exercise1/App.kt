package id.infinitelearning.KotlinSubmission.exercise1

/**
Latihan 1
Lengkapi fungsi myProfile di bawah ini dengan membuat variabel dengan ketentuan dibawah ini:
- Variable bertipe data string yang menyimpan nilai nama depan Anda.
- Variable bertipe data string yang menyimpan nilai nama belakang Anda.
- Variable bertipe data number yang menyimpan nilai umur Anda.
- Variable bertipe data boolean yang menyimpan nilai status Anda (single atau tidak)
Dan Cetak setiap variabel ke layar saat variable myProfile di panggil
 */
fun myProfile() {
    val firstName: String = "Muhammad Aldiansyah"
    val lastName: String = "Putra Pratama"
    val age: Int = 21
    val isSingle: Boolean = true

    println("Nama Depan: $firstName")
    println("Nama Belakang: $lastName")
    println("Umur: $age")
    println("Status: ${if (isSingle) "Single" else "Married"}")
}

/**
 *  Latihan 2
 *  Lengkapi fungsi di bawah ini agar dapat mencetak nilai dari parameter-parameter yang ada dengan fungsi println
 */

fun groupDetail(groupId: String, groupMember: List<Any>, session: String): Any {
    println("Group ID: $groupId")
    println("Group Members: $groupMember")
    println("Session: $session")

    return Any()
}


/**
 * Latihan 3
 * Buat variable yang berisi daftar anggota group kamu,
 * Kemudian akses item yang berisi nama Anda dari variable tersebut, lalu jadikan nilai kembalian untuk fungsi myTeam ini
 *
 */
fun myTeam(): List<Any> {
    val groupMembers = listOf("Aldy", "Muiz", "Abi", "Dina", "Andini")
    val myName = "Aldy"
    println("Nama saya: $myName")

    return groupMembers + myName
}

/**
 * Latihan 4
 * Lengkapi dan perbaiki isi fungsi totalMember() ini dengan rumus:
 *
 *      total mentor + jumlah anggota group
 *
 */

fun totalMember(): Int {
    val mentor = arrayOf("Kak Raihan", "Kak Fatih")
    val countOfGroup = arrayOf("Aldy", "Muiz", "Abi", "Dina", "Andini")

    val totalMember = mentor.size + countOfGroup.size
    return totalMember
}
    /**
     *  Latihan 5
     *  Ubah nilai argumen-argumen dari fungsi groupDetail di bawah ini sesuai dengan data group kamu
     *
     */


fun main() {
    myProfile()

    val groupID = "CollaboraCrew"
    val members = listOf("Aldy", "Muiz", "Abi", "Dina", "Andini")
    val sessionInfo = "Mobile Morning Session"

    groupDetail(groupID, members, sessionInfo)

    val team = myTeam()
    println("Anggota tim: $team")

    val totalMember = totalMember()
    println("Total Member group : $totalMember")

    groupDetail("Group Collaboracrew", listOf("Aldy", "Muiz", "Abi", "Dina", "Andini"), "Mobile Morning Session")
}

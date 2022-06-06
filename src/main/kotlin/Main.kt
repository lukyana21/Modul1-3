//fun main() {
//    penjumlahan(5, 10)
//
//    println(pengurangan(5, 3))
//
//    perkalian(2, 2)
//
//    println(pembagian(9, 3))
//
////<-----\"blabla\" adalah escape string----->
//    println("Nama saya \"Luky\"")
//
//<------ Petik 3 adalah raw string (ditampilkan sama seperti yang ditulis codenya ------>
//    var kalimat = """
//        "Nama Saya Luky Ana Adi Pratama"
//        Asal dari salatiga
//        lagi nyoba raw string
//    """.trimIndent()
//
//    println(kalimat)
//
//    println(percobaan("Nyoba yok..", "ini kalimat kedua"))
//}
//
//fun percobaan(a: String, b: String): String {
//    return ("$a, $b")
//}
//
//fun penjumlahan (a: Int, b: Int){
//    var hasil = a + b
//    println(hasil)
//}
//
//fun pengurangan (a: Int, b: Int): Int{
//    return (a-b)
//}
//
//fun perkalian (a: Int, b: Int){
//    var bre = a*b
//    println(bre)
//}
//
//fun pembagian (a: Int, b: Int): Int{
//    return (a/b)
//}


//fun main(){
//    println(Byte.MIN_VALUE)
//    println(Short.MIN_VALUE)
//    println(Int.MIN_VALUE)
//    println(Long.MIN_VALUE)
//
//    println(Byte.MAX_VALUE)
//    println(Short.MAX_VALUE)
//    println(Int.MAX_VALUE)
//    println(Long.MAX_VALUE)
//
//    val angka: Byte = 129.toByte()
//    println(angka)
//}
//
//

//<-----String template $blaba----->
//fun main(){
//    val nama = "Luky"
//    val umur = 21
//    println("nama saya $nama, umur saya $umur")
//}


//<-----return bisa diganti dengan = apabila hanya ada 1 baris proses----->
//fun main(){
//    println(jumlah(1, 2))
//    println(kurang(4, 2))
//    println(kali(2, 2))
//    println(bagi(6, 2))
//}
//
//fun jumlah(angka1: Int, angka2: Int) = angka1 + angka2
//fun kurang(angka1: Int, angka2: Int) = angka1 - angka2
//fun kali(angka1: Int, angka2: Int) = angka1 * angka2
//fun bagi(angka1: Int, angka2: Int) = angka1 / angka2

//fun main(){
// val nilai = 95
// abjad(nilai)
//}
//
//fun abjad(nilai: Int){
//    if(nilai >= 90 && nilai <= 100){
//        print("A")
//    }else if(nilai >= 80 && nilai <= 89){
//        print("B")
//    }else if(nilai >= 70 && nilai <= 79){
//        print("C")
//    }else if(nilai >= 60 && nilai <= 69){
//        print("D")
//    }else if(nilai >= 50 && nilai <= 59) {
//        print("E")
//    }else{
//        print("SALAH INPUT NILAI")
//    }
//}

//fun main(){
//    val input = 78
//    print(nilai(input))
//}
//
//fun nilai(input: Int): String{
//    if(input >= 90 && input <= 100){
//        return ("A")
//    }else if(input >= 80 && input <= 89){
//        return ("B")
//    }else if(input >= 70 && input <= 79){
//        return ("C")
//    }else if(input >= 60 && input <= 69){
//        return ("D")
//    }else if(input >= 50 && input <= 59) {
//        return ("E")
//    }else{
//        return ("SALAH INPUT NILAI")
//    }
//}

//fun main(){
// var nilai = 95
// print(abjad(nilai))
//}
//
//fun abjad(nilai: Int): String{
//    var luky: String
//    if(nilai >= 90 && nilai <= 100){
//        luky = "A"
//    }else if(nilai >= 80 && nilai <= 89){
//        luky = "B"
//    }else if(nilai >= 70 && nilai <= 79){
//        luky = "C"
//    }else if(nilai >= 60 && nilai <= 69){
//        luky = "D"
//    }else if(nilai >= 50 && nilai <= 59) {
//        luky = "E"
//    }else{
//        luky = "Input Salah Bre.."
//    }
//    return luky
//}

//fun main(){
//    jumlah (50)
//    print(jumlah())
//}
//
//fun jumlah() ="Jumlah1"
//fun jumlah(a: Int) ="jumlah2"

//<-----toBlabla tidak benar benar merubah type datanya----->
//fun main(){
//    var angka1 = 10
//    angka1 = "20".toInt()
//    print(angka1 is String)
//}

//fun main(){
//    var hasil = 10
//    var kalimat: String = hasil.toString()
//    var angka = 20
//    hasil.toString()
//    println(hasil is Int)
//    print(kalimat+angka)
//}

//fun main(){
//    val angka ="10"
//    val hasil: Int = angka.toInt()
//    print(hasil is Int)
//}

//<-----tanda (_)untuk menuliskan spasi pada huruf Int, tidak ditampilkan dilayar----->
//fun main(){
//    val jutaan = 1_000_000_000
//    print(jutaan)
//}

//<-----type array dimulai dari index ke-0----->
//fun main(){
//    var luky = intArrayOf(1,2,3,4,5,6,7,8,9,10)
//    println(luky[4])

//<-----arrayOf digunakan untuk membuat array dengan type data campuran----->
//    var ana = arrayOf(1, "luky", 3.5, 'a')
//    println(ana[3])
//}

//<-----String merupakan array dari kumpulan char----->
//fun main(){
//    val nama ="luky"
//    print(nama[3])
//}

//fun main(){
//    var kumpulanAngka = intArrayOf(1,2,3,4,5,6)
//        kumpulanAngka[2] = 100
//        kumpulanAngka = intArrayOf(1,7,8)
//          print(kumpulanAngka)
//}
//<-----ketika isi di array dirubah, maka array pada index yang dirubah akan hilang(digantikan)----->
//fun main(){
//    val kumpulanAngka = intArrayOf(1,2,3,4,5,6,7,8)
//    kumpulanAngka[2] = 100
//        print(kumpulanAngka[2])
//}

//fun main(){
//    val angka = Array(10){
//        i -> i*10
//    }
//    for(i in angka){
//        if(i == 90){
//            print("$i")
//        }else
//        print("$i, ")
//    }
//}

//fun main(){
//    val luky = Array(100){
//        i -> i + 1
//    }
//
//    val ana = Array(101){
//        i -> i * 1
//    }
//
//    val adi = Array(19){
//        i -> i + 2
//    }
//
//    val pratama = Array(11){
//        i -> i * i
//    }
//
//    val boy = Array(20){
//        i -> (i*2)-1
//    }
//
//    val luna = Array(5){
//        i -> i*(i+1)
//    }
//
//    val hell = Array(10){
//        i -> i*2
//    }
//    print("(1.) ")
//    for(i in luky){
//        print("$i, ")
//    }
//    println("")
//    print("(2.) ")
//    for(i in ana){
//        print("$i, ")
//    }
//    println("")
//    print("(3.) ")
//    for(i in adi){
//        print("$i, ")
//    }
//    println("")
//    print("(4.) ")
//    for(i in pratama){
//        print("$i, ")
//    }
//    println("")
//    print("(5.) ")
//    for(i in boy){
//        print("$i, ")
//    }
//    println("")
//    print("(6.) ")
//    for(i in luna){
//        print("$i, ")
//    }
//    println("")
//    print("(7.) ")
//    for(i in hell){
//        print("$i, ")
//    }
//}

//fun main(){
//    Array(10){
//        i -> i + 1
//        if(i % 2 == 0){
//            print("Genap, ")
//        }else
//        {
//            print("Ganjil, ")
//        }
//    }
//
//    println("")
//
//    Array(10){
//        i -> i + 1
//        if(i % 2 ==0){
//            print("Ganjil, ")
//        }else
//        {
//            print("Genap, ")
//        }
//    }
//
//    println("")
//
//    Array(30){
//        i -> i + 1
//        if(i == 0){
//            print("Luky, ")
//        }else if(i % 10 == 0){
//            print(i*10)
//            print(", ")
//        }else if(i % 2 == 0){
//            print("Genap, ")
//        }else
//        {
//            print("Ganjil, ")
//        }
//    }
//}

//<----tanda tanya (?) artinya boleh null----->
//fun main(){
//    val text: String? = null
//    val textLength = text.length
//    print(textLength)
//    if(text != null){
//        val textLength = text.length
//    }
//    val textLength = text?.length ?: 7
//    print(textLength)
//
//    ? nullable types (boleh null)
//            ?. safe call (apakah yang dipanggil null)
//        ?: elvis operator (tugas nya sama seperti else tapi berfungsi untuk else dari safe call)
//        !! null assertion (tidak boleh null)
//}

//fun main(){
//    val text: String? = "Luky"
//    val textLength = text!!.length
//    print(textLength)
//}

//fun main(){
//    val hour = 7
//    print("Office ${if(hour > 7) "already close" else "is open"}")
//}


//<-----enum class----->
//fun main(){
//    val laki = Gender.Male
//    val perempuan = Gender.Female
//    println(laki)
//    print(perempuan)
//}
//enum class Gender{
//    Male, Female
//}

//fun main(){
//    val luky = Gender.L.umur
//    println(luky)
//    val ana = Gender.L
//    println("Gendernya adalah ${ana.nilai}, Umurnya ${ana.umur}")
//}
//enum class Gender(val nilai: String, val umur: Int, val status: Boolean){
//    L("Laki-laki", 21, true),
//    P("Perempuan", 55, false)
//}

//fun main(){
//    println(luky.l.nama)
//    val luna: Array<luky> = luky.values()
//    luna.forEach{l ->
//        println(l.nama)
//    }
//}
//
//enum class luky(val nama: String){
//    l("on"),
//    u("off")
//}

//
//        1. Statement -> tidak mengembalikan nilai
//        2. expression -> mengembalikan nilai (ada didalam =, buat variabel lalu if)
//        3. condition -> didalam if/ if else
//          Menampilkan kelayar bukan mengembalikan nilai.


//<-----Perulangan menggunakan when----->
//fun main(){
//    val nilai = 10
//    when(nilai){
//        1 -> print("Nilainya adalah satu")
//        2 -> print("Nilainya adalah dua")
//        3 -> print("Nilainya adalah tida")
//        4 -> print("Nilainya adalah empat")
//        5 -> print("Nilainya adalah lima")
//        else -> print("Error")
//    }
//}


//fun main(){
//    val nama = "Luky"
//    when(nama){
//        "Marcel" -> print("Ngegame")
//        "Fahrul" -> print("Janda")
//        "Luky" -> print("AnakMama")
//        "Ridian" -> print("Doi")
//        "Nugroho" -> print("Gombong")
//        else -> print("Salah Woy")
//    }
//}

//fun main(){
//    val nama = "luky"
//    when(nama){
//        "Marcel"->{
//            print(".....")
//            print(".....")
//        }
//        "luky" ->{
//            println("ini print pertama")
//            print("ini print kedua")
//        }
//        else -> println("Salah input mungkin..")
//    }
//}


//fun main(){
//    val nilai = 10
//    when(nilai <= 100 && nilai >=50 || nilai == 10){
//        true -> print("Ya benar")
//        false -> print("Ya salah")
//        else -> print("Salah input anda..")
//    }
//}

//fun main(){
//    val nilai =10
//    val hasil = when(nilai){
//        100 -> "Seratus"
//        10 -> "Yeah"
//        else -> "Salah lu.."
//    }
//    print(hasil)
//}

//fun main(){
//    val nilai: Any = "Luky"
//    when(nilai){
//        is Int -> print("Iya ini Integer")
//        !is Double -> print("Iya ini Double")
//        is String -> print("Iya ini String")
//        else -> print("Error")
//    }
//}

//<-----Rentang menggunakan ".." dibaca sampai dengan----->
//fun main(){
//    val nilai = 21
//    val rentang = 1..50
//    when(nilai){
//        in rentang -> print("Angka berada dalam rentang")
//        !in rentang -> print("Angka tidak berada dalam rentang")
//        else -> print("Error")
//    }
//}

//import kotlin.random.Random
//
//fun main(){
//    when(val nilai = dapetinAngka()){
//        in 1..50 -> print("masuk 1 sampe 50")
//        in 51..100 -> print("masuk 51 sampe 100")
//        else -> print("Error")
//    }
//}
//fun dapetinAngka() = Random.nextInt(100)

//import kotlin.random.Random
//fun main(){
//    when(val nilai = dapetinAngka()){
//        in 1..50 -> print(nilai)
//        in 51..100 -> print(nilai)
//        else -> print("Error")
//    }
//}
//fun dapetinAngka() = Random.nextInt(100)

//fun main(){
//    var counter = 1
//    while(counter <= 10){
//        println("$counter. Hello World")
//        counter++
//    }
//}

//fun main(){
//    var i = 1
//    while(i < 5){
//        var x = 1
//        while(x <= i){
//            print("*")
//            x++
//        }
//        println("")
//        i++
//    }
//}

//fun main(){
//    var i = 1
//    while (i <= 5){
//        var y = 5
//        while (y > i){
//            print(" ")
//            y--
//        }
//        var x = 1
//        while (x <= i){
//            print("*")
//            x++
//        }
//        println("")
//        i++
//    }
//}


//fun main(){
//    var i = 5
//    while(i >= 1){
//        var x = 1
//        while(x <= i){
//            print("* ")
//            x++
//        }
//        println("")
//        i--
//    }
//}

//fun main(){
//    var counter = 1
//    do{
//        println("Hello World !")
//        counter++
//    }while(counter <= 5)
//}

//fun main(){
//    var x = 5
//    do {
//        println("$x. Hello World")
//        x--
//    }while (x >= 1)
//}

//fun main(){
//    val luky = 1..10
//    luky.forEach{
//        print("$it, ")
//    }
//    println()
//
//    val ana = 1..10 step 2
//    ana.forEach {
//        print("$it, ")
//    }
//    println()
//
//    val adi = 1.rangeTo(7)
//    adi.forEach {
//        print("$it, ")
//    }
//    println()
//
//    val pratama = 10.downTo(1)
//    pratama.forEach {
//        print("$it, ")
//    }
//    println()
//
//    if(5 in pratama){
//        print("Ya...")
//    }else{
//        print("Enggak..")
//    }
//
//    println()
//
//    if(20 !in pratama){
//        print("yokai")
//    }else{
//        print("No no")
//    }
//
//    println()
//
//    print(ana.step)
//
//    println()
//
//    val huruf = 'A'.rangeTo('I')
//    huruf.forEach {
//        print("$it, ")
//    }
//
//    for(yuhuu in ana){
//        print("$yuhuu")
//    }
//
//    for((indeks, nilai) in pratama.withIndex()){
//        println("Index ke-$indeks, isinya : $nilai")
//    }
//
//    val rentang = 1..10 step 3
//    rentang.forEachIndexed { posisi, isi ->
//        println("Index : $posisi adalah $isi")
//    }
//}

//fun main(){
//  for (x in 1..5){
//      for(y in 1..x){
//          print("* ")
//      }
//      println()
//  }
//
//    for(x in 5.downTo(1)){
//        for(y in 1..x){
//            print("* ")
//        }
//        println()
//    }
//}

//break and continue//

//data class Yuhuu(val nama: String, val umur: Int)

//fun main(){
//    val orang  = Yuhuu("Luky", 22)
//    println(orang)
//    val luna  = Yuhuu("Luky", 22)
//    println(luna.nama)
//
//    val orang1 = Yuhuu("Luky", 21)
//    val orang2 = Yuhuu("Ana", 20)
//    val orang3 = Yuhuu("Luky", 21)
//    val orang4 = orang2.copy()
//    val orang5 = orang2.copy(nama = "ganti")
//    println(orang1.equals(orang2))
//    println(orang1.equals(orang3))
//    println(orang2)
//    println(orang4)
//    println(orang2.equals(orang4))
//    println(orang5)
//
//    val coba = Yuhuu("Luky", 21)
//    val coba1 = coba.component1()
//    val coba2 = coba.component2()
//    //val (coba1, coba2) = coba #alternative untuk yang diatas
//    //di data class boleh membuat function
//    println(coba1)
//    println(coba2)
//    println("Nama Saya adalah $coba1 dan umur saya $coba2")
//}


//fun main(){ //penting......................................Collection
//    val bengkok = arrayOf(1, true, "Nama", 10.5)
//    val anyList = listOf(1, true, "Nama", 10.5)
//    val intList: List<Int> = listOf(7, 5, 1, 4, 10)
//    val rubah = mutableListOf(1,4.5, true, "nama")
//    val apo: MutableList<Int> = mutableListOf(10, 5, 6, 7, 9)
//
//    intList.forEach{
//        print("$it, ")
//    }
//
//    for(bebas in anyList){
//        print("$bebas, ")
//    }
//}


//fun main(){
//    val data = mutableListOf(1, true, "Ridian", null, 10.5)
//    data.add("Fahrul")
//    data.add(3, "Marcel")
//    data.removeAt(4)
//    data[2] = "Luky"
//    data.forEach{
//        print("$it, ")
//    }
//}

//fun main(){
//    val luna = mutableSetOf<Any>(1, true, "Luky")
//    luna.add("nyoba")
//    luna.remove(true)
//    luna.forEach{
//        print("$it, ")
//    }
//}

//fun main(){
//    val setA = setOf(1,2,4,2,1,5)
//    val setB = setOf(1,2,4,5)
//    println(setA != setB)
//    println(5 in setA)
//    val setC = setOf(1,5,7)
//    val gabungan = setA.union(setC)
//    val irisan = setA.intersect(setC)
//    println(gabungan)
//    println(irisan)
//}

//fun main(){
//    val setA = mutableSetOf(1,2,4,2,1,5)
//    println(setA.count())
//    println(setA.sum())
//}

//fun main(){
//    val kota = mutableMapOf(
//        "Indonesia" to "Jakarta",
//        "India" to "New Delhi",
//        "Jepang" to "Tokyo",
//        "Inggris" to "London"
//    )
//    println(kota["Jepang"])
//
//    kota.forEach{key, value ->
//        println("Kuncinya: $key, nilainya: $value")
//    }
//
//    println(kota.getValue("Jepang"))

//    val kunci = kota.keys
//    println(kunci)
//    val nilai = kota.values
//    println(nilai)

//    val hasil = kota.toMutableMap()
//    hasil.put("Taiwan", "Taipei")
//    println(hasil.keys)
//    println(hasil.values)

//}

//fun main(){
//    val listAngka = listOf(4,7,3,1,2,10,6,5,9,8)
////    val hasil = listAngka.filter { luna -> luna % 2 == 0 }
////    println(hasil)
////    val nyoba = listAngka.filterNot { yuhuu -> yuhuu % 2 == 0 }
////    println(nyoba)
////    val hasil1 = listAngka.map { it * 5 }
////    val hasil1 = listAngka.count()
////    val hasil1 = listAngka.count { it % 3 == 0 }
////    val hasil1 = listAngka.find{ it % 2 == 1}
////    val hasil1 = listAngka.lastOrNull { it % 2 == 1 }
////    val hasil1 = listAngka.sum()
////    println(hasil1)
//    println(listAngka.sorted())
//    println(listAngka.sortedDescending())
//}

//fun main(){
//    val angka = (1..100).toList()
//    angka.asSequence().filter{
//        it % 5 == 0
//    }.map {
//        it * 2
//    }.forEach {
//        print("$it, ")
//    }
//}

fun main(){
    val angka = generateSequence(1) { it + 1}

    angka.take(10).forEach {
        print("$it, ")
    }
}
package com.example.recyclerviewapp

object DataManager {

    val students = mutableListOf<Student>()

    init {
        createMockData()
    }

    fun createMockData() {
        students.add(Student("Susan", "AU20", true))
        students.add(Student("Greger", "AU20"))
        students.add(Student("Aneta", "AU20"))
        students.add(Student("Ibrahim", "AU20"))
        students.add(Student("Axel", "AU20", true))
        students.add(Student("Wedieu", "AU20"))
        students.add(Student("Carolina", "AU20"))
        students.add(Student("David", "AU20"))


    }



}
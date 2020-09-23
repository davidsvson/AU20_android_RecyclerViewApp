package com.example.recyclerviewapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlinx.android.synthetic.main.student_list_view.*

class CreateAndEditStudentActivity : AppCompatActivity() {

    lateinit var nameTextView: EditText
    lateinit var classTextView: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_and_edit_student)

        nameTextView = findViewById(R.id.nameTextView)
        classTextView = findViewById(R.id.classTextView)

        var saveButton = findViewById<Button>(R.id.saveButton)

        saveButton.setOnClickListener {
            addNewStudent()
        }

    }

    fun addNewStudent() {
        val name = nameTextView.text.toString()
        val className = classTextView.text.toString()

        val student = Student(name, className)
        DataManager.students.add(student)
        finish()
    }


}
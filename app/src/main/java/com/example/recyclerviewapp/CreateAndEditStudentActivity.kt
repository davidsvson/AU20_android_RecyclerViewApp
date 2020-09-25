package com.example.recyclerviewapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

const val STUDENT_POSITION_KEY = "STUDENT_POSITION"
const val POSITION_NOT_SET = -1

class CreateAndEditStudentActivity : AppCompatActivity() {

    lateinit var nameTextView: EditText
    lateinit var classTextView: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_and_edit_student)

        nameTextView = findViewById(R.id.nameTextView)
        classTextView = findViewById(R.id.classTextView)
        var saveButton = findViewById<Button>(R.id.saveButton)


        var studentPosition = intent.getIntExtra(STUDENT_POSITION_KEY, POSITION_NOT_SET )

        if (studentPosition != POSITION_NOT_SET) {  // edit student
            displayStudent(studentPosition)
            saveButton.setOnClickListener {
                editStudent(studentPosition)
            }
        } else {                                    // add new student
            saveButton.setOnClickListener {
                addNewStudent()
            }
        }

    }

    fun editStudent(position: Int) {
        DataManager.students[position].name = nameTextView.text.toString()
        DataManager.students[position].className = classTextView.text.toString()

        finish()
    }


    fun displayStudent(position :Int) {
        val student = DataManager.students[position]

        nameTextView.setText(student.name)
        classTextView.setText(student.className)
    }


    fun addNewStudent() {
        val name = nameTextView.text.toString()
        val className = classTextView.text.toString()

        val student = Student(name, className)
        DataManager.students.add(student)
        finish()
    }


}
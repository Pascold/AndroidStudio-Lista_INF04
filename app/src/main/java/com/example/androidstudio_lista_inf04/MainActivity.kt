package com.example.androidstudio_lista_inf04

import android.os.Bundle
import android.widget.ArrayAdapter
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.widget.EditText
import android.widget.Button
import android.widget.ListView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val editNote = findViewById<EditText>(R.id.notatki)
        val buttonAdd = findViewById<Button>(R.id.buttonAdd)
        val listViewNotes = findViewById<ListView>(R.id.edycjaNotatki)

        val listaZadan = mutableListOf(
            "Zakupy: chleb, masło, ser",
            "Do zrobienia: obiad, umyć podłogi",
            "weekend: kino, spacer z psem"
        )
        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, listaZadan)

        listViewNotes.adapter = adapter

        buttonAdd.setOnClickListener {
            val nowaNotatka = editNote.text.toString()
            if(nowaNotatka.isNotEmpty()){
                listaZadan.add(nowaNotatka)
                adapter.notifyDataSetChanged()
                editNote.text.clear()
            }
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}

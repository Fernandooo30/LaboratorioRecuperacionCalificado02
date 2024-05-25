package com.fernando.mendoza.laboratoriorecuperacioncalificado02
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class RegistroContactoActivity : AppCompatActivity() {
    private lateinit var editTextNombres: EditText
    private lateinit var editTextApellidos: EditText
    private lateinit var editTextNumeroCelular: EditText
    private lateinit var editTextDireccion: EditText
    private lateinit var buttonGuardar: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registro_contacto)

        editTextNombres = findViewById(R.id.editTextNombres)
        editTextApellidos = findViewById(R.id.editTextApellidos)
        editTextNumeroCelular = findViewById(R.id.editTextNumeroCelular)
        editTextDireccion = findViewById(R.id.editTextDireccion)
        buttonGuardar = findViewById(R.id.buttonGuardar)

        buttonGuardar.setOnClickListener {
            val intent = Intent(this, ContactoGuardadoActivity::class.java)
            intent.putExtra("nombres", editTextNombres.text.toString())
            intent.putExtra("apellidos", editTextApellidos.text.toString())
            intent.putExtra("numeroCelular", editTextNumeroCelular.text.toString())
            intent.putExtra("direccion", editTextDireccion.text.toString())
            startActivity(intent)
        }
    }
}


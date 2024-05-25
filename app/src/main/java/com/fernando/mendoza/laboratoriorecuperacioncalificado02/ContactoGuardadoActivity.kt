package com.fernando.mendoza.laboratoriorecuperacioncalificado02
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ContactoGuardadoActivity : AppCompatActivity() {
    private lateinit var textViewNombre: TextView
    private lateinit var textViewNumero: TextView
    private lateinit var textViewProductos: TextView
    private lateinit var textViewUbicacion: TextView
    private lateinit var buttonLlamar: Button
    private lateinit var buttonWsp: Button
    private lateinit var buttonMaps: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contacto_guardado)

        textViewNombre = findViewById(R.id.textViewNombre)
        textViewNumero = findViewById(R.id.textViewNumero)
        textViewProductos = findViewById(R.id.textViewProductos)
        textViewUbicacion = findViewById(R.id.textViewUbicacion)
        buttonLlamar = findViewById(R.id.buttonLlamar)
        buttonWsp = findViewById(R.id.buttonWsp)
        buttonMaps = findViewById(R.id.buttonMaps)

        val nombres = intent.getStringExtra("nombres")
        val apellidos = intent.getStringExtra("apellidos")
        val numeroCelular = intent.getStringExtra("numeroCelular")
        val direccion = intent.getStringExtra("direccion")

        textViewNombre.text = nombres
        textViewNumero.text = numeroCelular
        textViewProductos.text = apellidos
        textViewUbicacion.text = direccion

        buttonLlamar.setOnClickListener {
            val intent = Intent(Intent.ACTION_DIAL).apply {
                data = Uri.parse("tel:$numeroCelular")
            }
            startActivity(intent)
        }

        buttonWsp.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW).apply {
                data = Uri.parse("https://wa.me/$numeroCelular?text=Hola $nombres")
            }
            startActivity(intent)
        }

        buttonMaps.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW).apply {
                data = Uri.parse("geo:0,0?q=$direccion")
            }
            startActivity(intent)
        }
    }
}

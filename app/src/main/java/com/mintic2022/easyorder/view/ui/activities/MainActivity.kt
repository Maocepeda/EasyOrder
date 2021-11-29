package com.mintic2022.easyorder.view.ui.activities

import android.os.Bundle
import android.util.Patterns
import android.view.LayoutInflater
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.util.PatternsCompat
import com.mintic2022.easyorder.R
import com.mintic2022.easyorder.databinding.ActivityMainBinding
import java.util.regex.Pattern

class MainActivity : AppCompatActivity() {

    private lateinit var binding:ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnEntrar.setOnClickListener{validate()}

    }

    private fun validateEmail():Boolean{
        //?:significa diferente de nulo-indica si el objeto puede estar vacio.
        val correo=binding.correo.editText?.text.toString()
        return if (correo.isEmpty()){
            binding.correo.error="This field can't be empty"
            false
        }else if (!PatternsCompat.EMAIL_ADDRESS.matcher(correo).matches()){
                binding.correo.error="Please write or enter a Valid Email Address"
                false
        }else{
                binding.correo.error=null
                true
        }

    }

    private fun validate(){
        val result=arrayOf(validateEmail(),validatePassword())

        if (false in result){
            return
        }
        Toast.makeText(this,"Success", Toast.LENGTH_SHORT).show()

    }


    private fun validatePassword():Boolean{
        //?:significa diferente de nulo-indica si el objeto puede estar vacio.
        val contrasena=binding.contrasena.editText?.text.toString()
        val passwordRegex= Pattern.compile(
            "^"+
                    "(?=.*[0-9])"+        //at least 1 digit
                    "(?=.*[a-z])"+        //al least 1 lower case letter
                    "(?=.*[A-Z])"+        //al least 1 upper case letter
                    "(?=.*[@#$%^&+=])"+   //at least a special character
                    "(?=\\S+$)"+          //no white spaces
                    ".{4,}"+              //at least 4 characteres
                    "$"
        )
        return if (contrasena.isEmpty()) {
            binding.contrasena.error = "Campo no puede estar vacío"
            false
        } else if (!passwordRegex.matcher(contrasena).matches()){
            binding.contrasena.error = "Password is too weak"
            false
        }else{
            binding.contrasena.error = null
            true
        }
    }


}
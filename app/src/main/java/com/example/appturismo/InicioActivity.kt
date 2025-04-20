package com.example.appturismo

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.appturismo.InicioSesion.LoginActivity
import com.example.appturismo.InicioSesion.RegisterActivity
import com.example.appturismo.menu.MenuInicioActivity
import com.facebook.AccessToken
import com.facebook.CallbackManager
import com.facebook.FacebookCallback
import com.facebook.FacebookException
import com.facebook.login.LoginManager
import com.facebook.login.LoginResult
import com.google.firebase.auth.FacebookAuthProvider
import com.google.firebase.auth.FirebaseAuth
import java.util.Arrays

class InicioActivity : AppCompatActivity() {
    object  Global{
        var preferencias_compartidas = "sharedpreferences"
        var callbackManager = CallbackManager.Factory.create()
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_inicio)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val buttonlogin = findViewById<Button>(R.id.button_Login)
        val btnCreCuenta = findViewById<TextView>(R.id.btnCreCuenta)
        var btnFacebook = findViewById<Button>(R.id.btnFacebook)

        buttonlogin.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }

        btnCreCuenta.setOnClickListener {
            val intent = Intent(this, RegisterActivity::class.java)
            startActivity(intent)
        }

        btnFacebook.setOnClickListener {
            login_facebook()
        }
    }

    fun login_facebook() {
        LoginManager.getInstance().logInWithReadPermissions(this, Arrays.asList("email"))
        LoginManager.getInstance().registerCallback(
            Global.callbackManager,
            object : FacebookCallback<LoginResult> {
                override fun onSuccess(loginResult: LoginResult) {
                    //Log.d(TAG, "facebook:onSuccess:$loginResult")
                    handleFacebookAccessToken(loginResult.accessToken)
                }

                override fun onCancel() {}

                override fun onError(error: FacebookException) {
                   // Log.d(TAG, "facebook:onError", error)
                    Toast.makeText(applicationContext, "facebook:onError: "+error, Toast.LENGTH_SHORT).show()
                }
            },
        )
    }

    private fun handleFacebookAccessToken(token: AccessToken) {
        val credential = FacebookAuthProvider.getCredential(token.token)
        FirebaseAuth.getInstance().signInWithCredential(credential)
            .addOnCompleteListener(this) { task ->
                if (task.isSuccessful) {
                    var intent = Intent(applicationContext, MenuInicioActivity::class.java)
                    intent.putExtra("Correo", task.result.user?.email)
                    intent.putExtra("Proveedor", "Facebook")
                    startActivity(intent)

                    guardar_sesion(task.result.user?.email.toString(), "Facebook")
                } else {
                    Toast.makeText(applicationContext, "Error al autenticarse con Facebook: "+ task.exception?.message, Toast.LENGTH_SHORT).show()
                }
            }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        // Pass the activity result back to the Facebook SDK
        Global.callbackManager.onActivityResult(requestCode, resultCode, data)
    }

    fun guardar_sesion(correo:String, proveedor:String){
        var guardar_sesion: SharedPreferences.Editor=this.getSharedPreferences(Global.preferencias_compartidas, Context.MODE_PRIVATE).edit()
        guardar_sesion.putString("correo", correo)
        guardar_sesion.putString("proveedor", proveedor)
        guardar_sesion.apply()
        guardar_sesion.commit()
    }

}
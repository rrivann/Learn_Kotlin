package com.programmerzamannow.belajarandroiddasar

import android.annotation.SuppressLint
import android.content.pm.PackageManager
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var nameEditText: EditText
    private lateinit var sayHelloButton: Button
    private lateinit var sayHelloTextView: TextView

    private fun initComponents() {
        nameEditText = findViewById(R.id.nameEditText)
        sayHelloButton = findViewById(R.id.sayHelloButton)
        sayHelloTextView = findViewById(R.id.sayHelloTextView)
    }

    private fun checkFingerPrint() {
        if (packageManager.hasSystemFeature(PackageManager.FEATURE_FINGERPRINT)) {
            Log.i("FEATURE", "Feature fingerprint ON")
        } else {
            Log.i("FEATURE", "Feature fingerprint OF")
        }
    }

    private fun checkPlatformVersion() {
//        Log.i("SDK", Build.VERSION.SDK_INT.toString())
        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.S) {
            Log.i("SDK", "Disable feature, because version sdk is lower than 31")
        }
    }

    private fun printHello(name: String) {
        Log.i("DEBUG", name)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.hello_world)

        initComponents()

        sayHelloTextView.text = resources.getString(R.string.app_name)

        sayHelloButton.setOnClickListener {

            val firstName = "Rivan"
            printHello(firstName)

            checkFingerPrint()

            checkPlatformVersion()

            val json = assets.open("sample.json").bufferedReader().use { it.readText() }

            val rawJson =
                resources.openRawResource(R.raw.sample).bufferedReader().use { it.readText() }

            Log.i("Assets", json)
            Log.i("Raw Json", rawJson)

//            resources.getDrawable(R.drawable.banteng, theme)

            Log.d("PZN", "This is debug Log")
            Log.i("PZN", "This is info Log")
            Log.w("PZN", "This is warn Log")
            Log.e("PZN", "This is error Log")

            val name = nameEditText.text.toString()
            sayHelloTextView.text = resources.getString(R.string.sayHelloTextView, name)
            resources.getStringArray(R.array.names).forEach {
                Log.i("PZN", it)
            }
        }
    }
}
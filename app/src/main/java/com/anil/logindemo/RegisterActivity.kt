package com.anil.logindemo

import android.content.Intent
import android.os.Bundle
import android.text.Html
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class RegisterActivity : AppCompatActivity(), View.OnClickListener {


    var txtAlreadyHaveAccount: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        initUI()
    }

    private fun initUI() {
        txtAlreadyHaveAccount = findViewById(R.id.txtAlreadyHaveAccount)

        val txtPart1: String =
            getColoredSpanned(getString(R.string.already_have_account), "#000000")
        val txtPart2: String = getColoredSpanned("Login", "#FF0000")
        txtAlreadyHaveAccount!!.setText(Html.fromHtml(txtPart1 + " " + txtPart2))
        txtAlreadyHaveAccount!!.setOnClickListener(this)
    }

    override fun onClick(p0: View?) {
        val intent = Intent(this, LoginActivity::class.java)
        startActivity(intent)
    }

    private fun getColoredSpanned(text: String, color: String): String {
        return "<font color=$color>$text</font>"
    }
}

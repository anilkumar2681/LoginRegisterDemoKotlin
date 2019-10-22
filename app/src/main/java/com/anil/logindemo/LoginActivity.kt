package com.anil.logindemo

import android.content.Intent
import android.os.Bundle
import android.text.Html
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class LoginActivity : AppCompatActivity(), View.OnClickListener {

    var txtDoNotHaveAccount: TextView? = null
    var txtForgotPassword: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        initUI()

    }

    private fun initUI() {
        txtDoNotHaveAccount = findViewById<TextView>(R.id.txtDoNotHaveAccount)
        txtForgotPassword = findViewById<TextView>(R.id.txtForgotPass)

        val txtPart1: String = getColoredSpanned(getString(R.string.dont_have_account), "#000000")
        val txtPart2: String = getColoredSpanned("Register", "#FF0000")
        txtDoNotHaveAccount!!.setText(Html.fromHtml(txtPart1 + " " + txtPart2))

        txtDoNotHaveAccount!!.setOnClickListener(this)
        txtForgotPassword!!.setOnClickListener(this)

    }

    override fun onClick(view: View?) {
        when (view?.id) {
            R.id.txtDoNotHaveAccount -> {
                val intent = Intent(this, RegisterActivity::class.java)
                startActivity(intent)
            }
            R.id.txtForgotPass -> {

            }

        }
    }


    private fun getColoredSpanned(text: String, color: String): String {
        return "<font color=$color>$text</font>"
    }
}

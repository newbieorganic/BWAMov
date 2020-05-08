package com.newbie.bwamov.onboarding

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.newbie.bwamov.R
import com.newbie.bwamov.sign.signin.SignInActivity
import kotlinx.android.synthetic.main.activity_sign_in.*
import com.newbie.bwamov.utils.Preferences

class OnboardingOneActivity : AppCompatActivity() {
    lateinit var preferences:Preferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_onboarding_one)
        preferences = Preferences(this)

        if (preferences.getValues("onboarding").equals("1")) {
            finishAffinity()

            val intent = Intent(this@OnboardingOneActivity,
                SignInActivity::class.java)
            startActivity(intent)
        }

        btn_home.setOnClickListener{
            val intent = Intent(this@OnboardingOneActivity,
                OnboardingTwoActivity::class.java)
                startActivity(intent)
        }

        btn_daftar.setOnClickListener {
            val intent = Intent(this@OnboardingOneActivity,
                SignInActivity::class.java)
            startActivity(intent)
        }

    }
}

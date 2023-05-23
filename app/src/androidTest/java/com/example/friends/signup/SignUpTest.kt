package com.example.friends.signup

import androidx.compose.ui.test.junit4.createAndroidComposeRule
import com.example.friends.MainActivity
import org.junit.Rule
import org.junit.Test

class SignUpTest {

  @Rule
  private val rule = createAndroidComposeRule<MainActivity>()
  @Test
  fun performSignUp()
  {
    launchSignUpScreen(rule){
      enterEmail("")
      enterPassword("")
      submit()
    }
  }


}
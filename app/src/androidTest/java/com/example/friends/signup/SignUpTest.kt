package com.example.friends.signup

import androidx.compose.ui.test.junit4.createAndroidComposeRule
import com.example.friends.MainActivity
import org.junit.Rule
import org.junit.Test

class SignUpTest {

  @get:Rule
  val rule = createAndroidComposeRule<MainActivity>()

  @Test
  fun performSignUp()
  {
    launchSignUpScreen(rule){
      enterEmail("fahime.s.ghasemi@gmail.com")
      enterPassword("11111")
      submit()
    }
  }


}
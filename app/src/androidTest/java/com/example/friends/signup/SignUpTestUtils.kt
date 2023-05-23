package com.example.friends.signup

import androidx.compose.ui.test.junit4.AndroidComposeTestRule
import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.performClick
import androidx.compose.ui.test.performTextInput
import androidx.test.ext.junit.rules.ActivityScenarioRule
import com.example.friends.MainActivity
import com.example.friends.R

fun launchSignUpScreen(
  rule: AndroidComposeTestRule<ActivityScenarioRule<MainActivity>, MainActivity>,
  block: SignUpTestUtils.() -> Unit
): SignUpTestUtils {
  return SignUpTestUtils(rule).apply(block)
}

class SignUpTestUtils(private val rule: AndroidComposeTestRule<ActivityScenarioRule<MainActivity>, MainActivity>) {
  fun enterEmail(email: String) {
    val emailText = rule.activity.getString(R.string.email)
    rule.onNodeWithText(emailText).performTextInput(email)
  }

  fun enterPassword(password: String) {
    val passwordText = rule.activity.getString(R.string.password)
    rule.onNodeWithText(passwordText).performTextInput(password)
  }

  fun submit() {
    val signUp = rule.activity.getString(R.string.signUp)
    rule.onNodeWithText(signUp).performClick()
  }
}

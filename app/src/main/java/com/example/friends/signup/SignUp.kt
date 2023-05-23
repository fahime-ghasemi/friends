package com.example.friends.signup

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme.typography
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.friends.R

@Composable
@Preview(device = Devices.PIXEL_2)
fun SignUpScreen() {
  var email by remember { mutableStateOf("") }
  var password by remember { mutableStateOf("") }

  Column(
    modifier = Modifier
      .fillMaxSize()
      .padding(16.dp)
  ) {
    Text(
      modifier = Modifier.align(Alignment.CenterHorizontally),
      text = stringResource(id = R.string.signUpTitle), style = typography.h5
    )
    Spacer(modifier = Modifier.height(18.dp))
    OutlinedTextField(modifier = Modifier
      .fillMaxWidth()
      .padding(bottom = 8.dp), value = email,
      onValueChange = {
        email = it
      },
      label = {
        Text(
          text = stringResource(id = R.string.email)
        )
      }
    )
    OutlinedTextField(modifier = Modifier
      .fillMaxWidth()
      .padding(bottom = 8.dp), value = password, onValueChange = {
      password = it
    }, label = {
      Text(text = stringResource(id = R.string.password))
    })
    Button(modifier = Modifier.fillMaxWidth(), onClick = { /*TODO*/ }, content = {
      Text(
        text = stringResource(
          id = R.string.signUp
        )
      )
    })
  }
}
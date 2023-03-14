package com.example.thirtydaysapp

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.thirtydaysapp.model.Day
import com.example.thirtydaysapp.model.days
import com.example.thirtydaysapp.ui.theme.ThirtyDaysAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ThirtyDaysAppTheme {
                ThirtyDaysApp()
            }
        }
    }
}

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun ThirtyDaysApp() {
    Scaffold(topBar = {
        TopAppBar()
    },) {
        LazyColumn(modifier = Modifier.background(MaterialTheme.colors.background), contentPadding = PaddingValues(horizontal = 8.dp, vertical = 16.dp)) {
            items(days) {
                DayCard(day = it)
            }
        }
    }
}

@Composable
fun TopAppBar() {
    Box(modifier = Modifier
        .height(56.dp)
        .fillMaxWidth()
        .background(color = MaterialTheme.colors.primaryVariant), contentAlignment = Alignment.Center) {
        Text(text = stringResource(id = R.string.app_name), color = MaterialTheme.colors.onPrimary, style = MaterialTheme.typography.h5)
    }
}

@Composable
fun DayCard(day: Day) {
    Card(modifier = Modifier
        .fillMaxWidth()
        .padding(bottom = 8.dp), elevation = 4.dp) {
        Column(modifier = Modifier.padding(16.dp)) {
            Text(text = "Day ${day.day}", style = MaterialTheme.typography.subtitle1, color = MaterialTheme.colors.onSurface)
            Spacer(modifier = Modifier.height(16.dp))
            Text(text = stringResource(id = day.title), style = MaterialTheme.typography.h6)
            Image(painter = painterResource(id = day.imageRes), contentDescription = null, modifier = Modifier.height(120.dp).align(Alignment.CenterHorizontally))
            Text(text = stringResource(id = day.description), style = MaterialTheme.typography.body1)
        }
    }
}

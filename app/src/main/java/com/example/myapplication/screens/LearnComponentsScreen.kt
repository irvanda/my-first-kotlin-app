package com.example.myapplication.screens

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.CheckCircle
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun LearnComponentsScreen() {
    LazyVerticalGrid(columns = GridCells.Fixed(2)) {
        item {
            ShowButton()
        }
        item {
            ShowIcon()
        }
        item {
            ShowState()
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ShowButton() {
    Column (
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier
            .border(1.dp, Color.Black)
            .padding(20.dp)
            .defaultMinSize(minHeight = 100.dp)
    ) {
        Text(
            text = "Button",
            color = Color.Black,
            fontSize = 20.sp
        )
        OutlinedButton(
            onClick = { /*TODO*/ },
            border = BorderStroke(1.dp, Color.Gray),
            shape = RoundedCornerShape(20)
        ) {
            Text(
                text = "Test",
                fontSize = 12.sp
            )
        }
    }
}
@Preview(showBackground = true)
@Composable
fun ShowIcon() {
    Column (
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier
            .border(1.dp, Color.Black)
            .padding(20.dp)
            .defaultMinSize(minHeight = 100.dp)
    ) {
        Text(
            text = "Icon",
            color = Color.Black,
            fontSize = 20.sp
        )
        Icon(
            imageVector = Icons.Default.CheckCircle,
            contentDescription = null,
            tint = Color.Green,
        )
    }
}

@Preview(showBackground = true)
@Composable
fun ShowState() {
    var inc by remember {
        mutableStateOf(0)
    }
    Column (
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier
            .border(1.dp, Color.Black)
            .padding(20.dp)
            .defaultMinSize(minHeight = 100.dp)
    ) {
        Text(
            text = "State",
            color = Color.Black,
            fontSize = 20.sp
        )
        Row (
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically,
        ) {
            Text(
                text = inc.toString(),
                color = Color.Black,
                fontSize = 25.sp,
                modifier = Modifier
                    .padding(end = 20.dp)
            )
            IconButton(onClick = {
                inc++
            }) {
                Icon(
                    imageVector = Icons.Default.Add,
                    contentDescription = null,
                    modifier = Modifier
                        .size(32.dp)
                        .border(1.dp, Color.Black)
                )
            }
            IconButton(onClick = {
                inc--
            }) {
                Column (
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center,
                    modifier = Modifier
                        .border(1.dp, Color.Black)
                        .size(32.dp)
                ) {
                    Text(
                        text = "-",
                        color = Color.Black,
                        fontWeight = FontWeight.W900
                    )
                }
            }
        }
    }
}
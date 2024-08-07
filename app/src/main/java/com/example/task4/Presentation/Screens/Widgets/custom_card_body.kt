package com.example.task4.Presentation.Screens.Widgets

import CustomCardItem
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Divider
import androidx.compose.material3.HorizontalDivider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.task4.ui.theme.Task4Theme

@Composable
fun CustomCardBody(modifier: Modifier = Modifier) {
    LazyColumn(
        modifier = modifier.padding(10.dp)
    ) {
        items(20) {
            CustomCardItem()
            HorizontalDivider(
                modifier = Modifier.padding(top = 6.dp, bottom = 1.dp),
                thickness = 0.4.dp,
                color = Color.Gray

            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun CustomCardBodyPreview() {
    Task4Theme {
        CustomCardBody()
    }
}

package com.example.lazycolumappjekpack

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.lazycolumappjekpack.model.Person
import com.example.lazycolumappjekpack.ui.theme.LightBlue
import com.example.lazycolumappjekpack.ui.theme.Teal200
import com.example.lazycolumappjekpack.ui.theme.Typography

@Composable
fun CustomItem(person: Person) {
    Row(
        modifier = Modifier
            .background(LightBlue)
            .fillMaxWidth()
            .border( 2.dp , Teal200 )
            .padding(15.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(12.dp)
    ) {
        Text(
            text = "${person.age}",
            color = Color.Black,
            fontSize = Typography.h4.fontSize,
            fontWeight = FontWeight.Bold
        )
        Text(
            text = person.firstName,
            color = Color.Black,
            fontSize = Typography.h5.fontSize,
            fontWeight = FontWeight.Normal
        )
    }
}


@Composable
@Preview
fun CustomItemPreview() {
    CustomItem(
        person = Person(
            id = 0,
            firstName = "John",
            age = 50,
            picture = "https://img.icons8.com/color/344/tall-person.png"

        )
    )
}
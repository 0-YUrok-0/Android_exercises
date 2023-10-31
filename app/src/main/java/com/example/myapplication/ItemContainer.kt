package com.example.myapplication

import android.graphics.drawable.shapes.Shape
import android.icu.text.DateTimePatternGenerator
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.myapplication.ui.theme.Grey100

@Composable
fun ItemContainer(itemRowModel: ItemRowModel) {
    var isExpandet by remember {
        mutableStateOf(false)
    }
    Card(elevation = CardDefaults.cardElevation(1.dp),
        shape = RoundedCornerShape(10.dp),
        border = BorderStroke(1.dp, color = Grey100),
        modifier = Modifier
            .padding(4.dp)
            .fillMaxWidth()
            .clickable {
                isExpandet = !isExpandet
            }
        ) {
        Row(

        ) {
            Image(painter = painterResource(id = itemRowModel.imageId),
                contentDescription = "image",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .padding(4.dp)
                    .size(64.dp)
                    .clip(RoundedCornerShape(16.dp))
            )
            Column {
                Text(text = itemRowModel.title)
                Text(maxLines = if(isExpandet) Int.MAX_VALUE else 3, text = itemRowModel.content)
            }


        }

    }


}
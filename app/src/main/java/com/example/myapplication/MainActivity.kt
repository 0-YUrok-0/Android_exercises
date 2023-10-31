package com.example.myapplication

import android.media.Image
import android.os.Bundle
import android.text.style.AlignmentSpan
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.gestures.detectDragGesturesAfterLongPress
import androidx.compose.foundation.gestures.detectHorizontalDragGestures
import androidx.compose.foundation.gestures.detectTapGestures
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CardElevation
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplication.ui.theme.Grey100
import com.example.myapplication.ui.theme.MyApplicationTheme

class MainActivity : ComponentActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LazyColumn(modifier = Modifier
                    .fillMaxHeight()

            ){
                val x = 2.0f
                val y = 2.0f
                val x1 = 10.0f
                val y1 = 10.0f
                val x2 = 0.0f
                val y2 = 0.0
                val c = (x - x2) / (x2 - x1) - (y - y2) / (y2 - y1)

                val contentTest = "Корабли - лавировали, да не выловиравали, " +
                        "интервьюер - интервьюировал, да не выитервьюировал, " +
                        "ревербератор - реверберировал, да не выревербировал"
                itemsIndexed(
                    listOf(
                        ItemRowModel(R.drawable.image_1, c.toString(), contentTest),
                        ItemRowModel(R.drawable.image_4, "Отблеск", contentTest),
                        ItemRowModel(R.drawable.image_3, "Гималаев", contentTest),
                        ItemRowModel(R.drawable.image_2, "На поля",  contentTest),
                        ItemRowModel(R.drawable.image_5, "Непала пал", contentTest),
                        )
                ){
                    _, item ->
                    ItemContainer(itemRowModel = item)
                }
            }

        }
    }




}





package com.example.lazycolumappjekpack

import ExpandableCard
import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import com.example.lazycolumappjekpack.repository.PersonRepository
import com.example.lazycolumappjekpack.ui.theme.LazyColumAppJekPackTheme
import coil.compose.ImagePainter
import coil.compose.rememberImagePainter
import coil.transform.BlurTransformation
import coil.transform.CircleCropTransformation
import coil.transform.GrayscaleTransformation

class MainActivity : ComponentActivity() {

    @OptIn(ExperimentalMaterialApi::class)
    @ExperimentalFoundationApi
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            /*LazyColumAppJekPackTheme {
                Column (
                    modifier = Modifier.fillMaxSize(),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally){

                    CoilImage()

                }

            }*/

            LazyColumAppJekPackTheme  {
                val sections = listOf("A", "B", "C", "D", "E", "F", "G")
                val personRepository = PersonRepository()
                val getAllData = personRepository.getAllData()

                LazyColumn(
                    verticalArrangement = Arrangement.spacedBy(12.dp)
                ) {
                    itemsIndexed(items = getAllData) { index, person ->
                        Log.d("result", index.toString())
                        Surface(color = MaterialTheme.colors.background) {
                            ExpandableCard(
                                firstName = person.firstName,
                                age = person.age,
                                picture = person.picture
                            )
                        }
                    }
//                   sections.forEach { section ->
//                        stickyHeader {
//                            Text(
//                                modifier = Modifier
//                                    .fillMaxWidth()
//                                    .background(Color.LightGray)
//                                    .padding(12.dp),
//                                text = "Section $section"
//                            )
//                        }
//                        items(10) {
//                            Text(
//                                modifier = Modifier.padding(12.dp),
//                                text = "Item $it from the section $section"
//                            )
//                        }
//                    }


                }
            }
        }
    }


}

@Composable
fun CoilImage(pic: String){
    Box(modifier = Modifier
        .height(150.dp)
        .width(150.dp),
        contentAlignment = Alignment.Center
    ){

        val painter1 = rememberImagePainter(
            data = pic,
            builder = {
                error(R.drawable.ic_launcher_background)
                transformations(
                    //GrayscaleTransformation(),
                    CircleCropTransformation(),
                    //BlurTransformation(LocalContext.current)
                )

            }

        )
        val painterState = painter1.state
        Image(painter = painter1, contentDescription = "Logo" )
        if ( painterState is ImagePainter.State.Loading){
            CircularProgressIndicator()
        }
    }
}



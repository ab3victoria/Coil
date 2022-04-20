package com.example.lazycolumappjekpack.repository

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import coil.compose.ImagePainter
import coil.compose.rememberImagePainter
import coil.transform.BlurTransformation
import coil.transform.CircleCropTransformation
import coil.transform.GrayscaleTransformation
import com.example.lazycolumappjekpack.CoilImage
import com.example.lazycolumappjekpack.R
import com.example.lazycolumappjekpack.model.Person

class PersonRepository {
    fun getAllData(): List<Person> {
        return listOf(
            Person(
                id = 0,
                firstName = "Hugh Bonneville",
                age = 50,
                picture = "https://upload.wikimedia.org/wikipedia/commons/thumb/c/ce/Hugh_Bonneville_MingFilmFest_2011_n1.jpg/330px-Hugh_Bonneville_MingFilmFest_2011_n1.jpg"
            ),
            Person(
                id = 1,
                firstName = "Laura Carmichael",
                age = 21,
                picture = "https://upload.wikimedia.org/wikipedia/commons/thumb/e/e6/Laura_Carmichael_%2848755229068%29_%28cropped%29.jpg/330px-Laura_Carmichael_%2848755229068%29_%28cropped%29.jpg"
            ),
            Person(
                id = 2,
                firstName = "Jim Carter",
                age = 50,
                picture = "https://upload.wikimedia.org/wikipedia/commons/thumb/5/51/Jim_Carter.jpg/330px-Jim_Carter.jpg"
            ),
            Person(
                id = 3,
                firstName = "Brendan Coyle",
                age = 50,
                picture = "https://upload.wikimedia.org/wikipedia/commons/thumb/a/ad/Brendan_Coyle%2C_June_2012.jpg/330px-Brendan_Coyle%2C_June_2012.jpg"
            ),
            Person(
                id = 4,
                firstName = "MS Patmor",
                age = 50,
                picture = "https://upload.wikimedia.org/wikipedia/commons/thumb/8/80/Lesley_Nicol_-_November_2014_%28cropped%29.jpg/330px-Lesley_Nicol_-_November_2014_%28cropped%29.jpg"
            ),
            Person(
                id = 5,
                firstName = "Michelle Dockery",
                age = 50,
                picture = "https://upload.wikimedia.org/wikipedia/commons/thumb/4/45/Michelle_Dockery_6.jpg/360px-Michelle_Dockery_6.jpg"
            ),
            Person(
                id = 6,
                firstName = "Joanne Froggatt",
                age = 30,
                picture = "https://upload.wikimedia.org/wikipedia/commons/thumb/d/de/Joanne_Froggatt_May_3%2C_2014_%28cropped%29.jpg/330px-Joanne_Froggatt_May_3%2C_2014_%28cropped%29.jpg"
            ),
            Person(
                id = 7,
                firstName = "Robert James",
                age = 30,
                picture = "https://upload.wikimedia.org/wikipedia/commons/thumb/2/22/Robert_James-Collier_May_2014_%28cropped%29.jpg/330px-Robert_James-Collier_May_2014_%28cropped%29.jpg"
            ),
            Person(
                id = 8,
                firstName = "Phyllis Logan",
                age = 50,
                picture = "https://upload.wikimedia.org/wikipedia/commons/thumb/9/96/Phyllis_Logan_May_2014_%28cropped%29.jpg/330px-Phyllis_Logan_May_2014_%28cropped%29.jpg"
            ),
            Person(
                id = 9,
                firstName = "Elizabeth McGovern",
                age = 50,
                picture = "https://upload.wikimedia.org/wikipedia/commons/3/30/Elizabeth_McGovern_2012.jpg"
            ),
        )
    }

}
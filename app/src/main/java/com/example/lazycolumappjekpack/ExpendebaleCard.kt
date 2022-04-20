import androidx.compose.animation.animateContentSize
import androidx.compose.animation.core.LinearOutSlowInEasing
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import com.example.lazycolumappjekpack.CoilImage
import com.example.lazycolumappjekpack.ui.theme.Shapes

@ExperimentalMaterialApi
@Composable
fun ExpandableCard(
    firstName: String,
    firstNameFontSize: TextUnit = MaterialTheme.typography.h6.fontSize,
    firstNameFontWeight: FontWeight = FontWeight.Bold,
    age: Int,
    ageFontSize: TextUnit = MaterialTheme.typography.subtitle1.fontSize,
    ageFontWeight: FontWeight = FontWeight.Normal,
    ageMaxLines: Int = 4,
    picture: String,

    padding: Dp = 20.dp
) {
    var expandedState by remember { mutableStateOf(false) }
    val rotationState by animateFloatAsState(
        targetValue = if (expandedState) 180f else 0f
    )

    Card(
        modifier = Modifier
            .fillMaxWidth()
            .animateContentSize(
                animationSpec = tween(
                    durationMillis = 300,
                    easing = LinearOutSlowInEasing
                )
            ),
        shape = Shapes.medium,
        onClick = {
            expandedState = !expandedState
        }
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(padding)
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    modifier = Modifier
                        .weight(6f),
                    text = firstName,
                    fontSize = firstNameFontSize,
                    fontWeight = firstNameFontWeight,
                    maxLines = 1,

                )

                IconButton(
                    modifier = Modifier
                        .weight(1f)
                        .alpha(ContentAlpha.medium)
                        .rotate(rotationState),
                    onClick = {
                        expandedState = !expandedState
                    }) {
                    Icon(
                        imageVector = Icons.Default.ArrowDropDown,
                        contentDescription = "Drop-Down Arrow"
                    )
                }
            }
            if (expandedState) {
                Text(
                    text ="age is: $age",
                    fontSize = ageFontSize,
                    fontWeight = ageFontWeight,
                    maxLines = ageMaxLines,

                )

                Row(){
                    CoilImage(picture)
                }
//                Text(
//                    text = picture,
//                    fontSize = ageFontSize,
//                    fontWeight = ageFontWeight,
//                    maxLines = ageMaxLines,
//
//                    )
            }
        }
    }
}



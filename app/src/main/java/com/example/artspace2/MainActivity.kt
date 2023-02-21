package com.example.artspace2

import android.content.res.Configuration
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.artspace2.ui.theme.ArtSpace2Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ArtSpace2Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    ArtSpace2Screen()
                }
            }
        }
    }
}

class Painting(val image: Int, val title: Int, val artist: Int, val year: Int, val description: Int)

@Composable
fun ArtSpace2Screen() {

//    val monaLisa = Painting(
//        image = R.drawable.mona_lisa,
//        title = R.string.mona_lisa,
//        artist = R.string.mona_lisa_artist,
//        year = R.string.mona_lisa_year,
//        description = R.string.mona_lisa_desc
//    )
//
//    val birthOfVenus = Painting(
//        image = R.drawable.birth_of_venus,
//        title = R.string.birth_of_venus,
//        artist = R.string.birth_of_venus_artist,
//        year = R.string.birth_of_venus_year,
//        description = R.string.birth_of_venus_desc
//    )
//
//    val childrensGames = Painting(
//        image = R.drawable.childrens_games,
//        title = R.string.childrens_games,
//        artist = R.string.childrens_games_artist,
//        year = R.string.childrens_games_year,
//        description = R.string.childrens_games_desc
//    )
//
//    val creationOfAdam = Painting(
//        image = R.drawable.creation_of_adam,
//        title = R.string.creation_of_adam,
//        artist = R.string.creation_of_adam_artist,
//        year = R.string.creation_of_adam_year,
//        description = R.string.creation_of_adam_desc
//    )
//
//    val lastSupper = Painting(
//        image = R.drawable.last_supper,
//        title = R.string.last_supper,
//        artist = R.string.last_supper_artist,
//        year = R.string.last_supper_year,
//        description = R.string.last_supper_desc
//    )
//
//    val salomeLondon = Painting(
//        image = R.drawable.salome_with_the_head_of_saint_john_the_baptist_london_smaller,
//        title = R.string.salome_london,
//        artist = R.string.salome_artist,
//        year = R.string.salome_year,
//        description = R.string.salome_desc
//    )
//
//    val sistineMadonna = Painting(
//        image = R.drawable.sistine_madonna,
//        title = R.string.sistine_madonna,
//        artist = R.string.sistine_madonna_artist,
//        year = R.string.sistine_madonna_year,
//        description = R.string.sistine_madonna_desc
//    )
//
//    val paintingArr = arrayOf(
//        monaLisa,
//        birthOfVenus,
//        childrensGames,
//        creationOfAdam,
//        lastSupper,
//        salomeLondon,
//        sistineMadonna
//    )
//
//    var paintingNum: Int by remember {
//        mutableStateOf(0)
//    }
//
//    var currentPainting: Painting by remember {
//        mutableStateOf(paintingArr[paintingNum])
//    }

    val configuration = LocalConfiguration.current

    when (configuration.orientation) {
        Configuration.ORIENTATION_PORTRAIT -> ArtSpace2ScreenPortrait()
        Configuration.ORIENTATION_LANDSCAPE -> ArtSpace2ScreenLandscape()
        else -> ArtSpace2ScreenPortrait()
    }
}

@Composable
fun ArtSpace2ScreenPortrait() {

    val monaLisa = Painting(
        image = R.drawable.mona_lisa,
        title = R.string.mona_lisa,
        artist = R.string.mona_lisa_artist,
        year = R.string.mona_lisa_year,
        description = R.string.mona_lisa_desc
    )

    val birthOfVenus = Painting(
        image = R.drawable.birth_of_venus,
        title = R.string.birth_of_venus,
        artist = R.string.birth_of_venus_artist,
        year = R.string.birth_of_venus_year,
        description = R.string.birth_of_venus_desc
    )

    val childrensGames = Painting(
        image = R.drawable.childrens_games,
        title = R.string.childrens_games,
        artist = R.string.childrens_games_artist,
        year = R.string.childrens_games_year,
        description = R.string.childrens_games_desc
    )

    val creationOfAdam = Painting(
        image = R.drawable.creation_of_adam,
        title = R.string.creation_of_adam,
        artist = R.string.creation_of_adam_artist,
        year = R.string.creation_of_adam_year,
        description = R.string.creation_of_adam_desc
    )

    val lastSupper = Painting(
        image = R.drawable.last_supper,
        title = R.string.last_supper,
        artist = R.string.last_supper_artist,
        year = R.string.last_supper_year,
        description = R.string.last_supper_desc
    )

    val salomeLondon = Painting(
        image = R.drawable.salome_with_the_head_of_saint_john_the_baptist_london_smaller,
        title = R.string.salome_london,
        artist = R.string.salome_artist,
        year = R.string.salome_year,
        description = R.string.salome_desc
    )

    val sistineMadonna = Painting(
        image = R.drawable.sistine_madonna,
        title = R.string.sistine_madonna,
        artist = R.string.sistine_madonna_artist,
        year = R.string.sistine_madonna_year,
        description = R.string.sistine_madonna_desc
    )

    val paintingArr = arrayOf(
        monaLisa,
        birthOfVenus,
        childrensGames,
        creationOfAdam,
        lastSupper,
        salomeLondon,
        sistineMadonna
    )

    var paintingNum: Int by remember {
        mutableStateOf(0)
    }

    val currentPainting: Painting = paintingArr[paintingNum]

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.SpaceBetween,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Box(modifier = Modifier.weight(2F)) {
            PaintingDetails(currentPainting = currentPainting)
        }
        
        Box(
            modifier = Modifier
                .weight(8F)
                .fillMaxSize()
        ) {
            Box (modifier = Modifier.align(Alignment.Center)) {
                PaintingProper(currentPainting = currentPainting)
            }
        }
        
        Box(
            modifier = Modifier
                .weight(1F)
                .fillMaxSize()
        ) {
            PreviousNextButtons(
                paintingNum = paintingNum,
                onNextButtonPress = {paintingNum++},
                onPrevButtonPress = {paintingNum--},
                loopToBeginning = { paintingNum = 0},
                loopToEnd = { paintingNum = paintingArr.lastIndex},
                paintingArr = paintingArr
            )
        }
    }
}

@Composable
fun ArtSpace2ScreenLandscape() {

    val monaLisa = Painting(
        image = R.drawable.mona_lisa,
        title = R.string.mona_lisa,
        artist = R.string.mona_lisa_artist,
        year = R.string.mona_lisa_year,
        description = R.string.mona_lisa_desc
    )

    val birthOfVenus = Painting(
        image = R.drawable.birth_of_venus,
        title = R.string.birth_of_venus,
        artist = R.string.birth_of_venus_artist,
        year = R.string.birth_of_venus_year,
        description = R.string.birth_of_venus_desc
    )

    val childrensGames = Painting(
        image = R.drawable.childrens_games,
        title = R.string.childrens_games,
        artist = R.string.childrens_games_artist,
        year = R.string.childrens_games_year,
        description = R.string.childrens_games_desc
    )

    val creationOfAdam = Painting(
        image = R.drawable.creation_of_adam,
        title = R.string.creation_of_adam,
        artist = R.string.creation_of_adam_artist,
        year = R.string.creation_of_adam_year,
        description = R.string.creation_of_adam_desc
    )

    val lastSupper = Painting(
        image = R.drawable.last_supper,
        title = R.string.last_supper,
        artist = R.string.last_supper_artist,
        year = R.string.last_supper_year,
        description = R.string.last_supper_desc
    )

    val salomeLondon = Painting(
        image = R.drawable.salome_with_the_head_of_saint_john_the_baptist_london_smaller,
        title = R.string.salome_london,
        artist = R.string.salome_artist,
        year = R.string.salome_year,
        description = R.string.salome_desc
    )

    val sistineMadonna = Painting(
        image = R.drawable.sistine_madonna,
        title = R.string.sistine_madonna,
        artist = R.string.sistine_madonna_artist,
        year = R.string.sistine_madonna_year,
        description = R.string.sistine_madonna_desc
    )

    val paintingArr = arrayOf(
        monaLisa,
        birthOfVenus,
        childrensGames,
        creationOfAdam,
        lastSupper,
        salomeLondon,
        sistineMadonna
    )

    var paintingNum: Int by remember {
        mutableStateOf(0)
    }

    val currentPainting: Painting = paintingArr[paintingNum]

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxSize()
    ) {
        Row(
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .weight(1F)
                .fillMaxSize()
        ) {
            Box(
                contentAlignment = Alignment.Center,
                modifier = Modifier
                    .weight(1F)
                    .fillMaxSize()
            ) {
                PaintingDetails(currentPainting = currentPainting)
            }
            Box(
                contentAlignment = Alignment.Center,
                modifier = Modifier
                    .weight(1F)
                    .fillMaxSize()
            ) {
                PaintingProper(currentPainting = currentPainting)
            }
        }

        Row(
            Modifier.weight(0.2F)
        ) {
            PreviousNextButtons(
                paintingNum = paintingNum,
                onNextButtonPress = { paintingNum++ },
                onPrevButtonPress = { paintingNum-- },
                loopToBeginning = { paintingNum = 0},
                loopToEnd = { paintingNum = paintingArr.lastIndex},
                paintingArr = paintingArr
            )
        }
    }
    
}

@Composable
fun PaintingDetails (currentPainting: Painting, modifier: Modifier = Modifier) {

    Surface(
        modifier = Modifier
            .padding(start = 16.dp, end = 16.dp, top = 16.dp)
            .shadow(8.dp)
    ) {
        Column {
            Text(
                text = stringResource(id = currentPainting.title),
                fontSize = 28.sp,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Left,
                modifier = Modifier
                    .padding(start = 4.dp, top = 4.dp, end = 4.dp)
            )

            Text(
                buildAnnotatedString {
                    withStyle(
                        style = SpanStyle(
                            fontWeight = FontWeight.Bold,
                            color = Color.DarkGray,
                        )
                    ) {
                        append(stringResource(id = currentPainting.artist))
                    }
                    append(" ")
                    withStyle(
                        style = SpanStyle(
                            color = Color.Gray
                        )
                    ) {
                        append("(c. " + stringResource(id = currentPainting.year) + ")")
                    }
                },
                fontSize = 14.sp,
                modifier = Modifier.padding(start = 6.dp, end = 4.dp, bottom = 4.dp),
            )
        }
    }
}

@Composable
fun PaintingProper (currentPainting: Painting, modifier: Modifier = Modifier) {

    Surface(
        modifier = Modifier
            .padding(top = 16.dp, start = 8.dp, end = 8.dp)
            .border(2.dp, Color.DarkGray, RectangleShape)
            .shadow(4.dp, RectangleShape)
            .wrapContentSize()
    ) {
         Box {
            Image(
                painter = painterResource(id = currentPainting.image),
                contentDescription = stringResource(id = currentPainting.description),
                Modifier
                    .padding(24.dp, 24.dp, 24.dp, 40.dp)
            )
             
             Text(
                 text = stringResource(id = currentPainting.artist),
                 color = Color.DarkGray,
                 modifier = Modifier
                     .align(Alignment.BottomStart)
                     .padding(start = 8.dp, bottom = 8.dp)
             )

             Text(
                text = "c. " + stringResource(id = currentPainting.year),
                color = Color.Gray,
                modifier = Modifier
                    .align(Alignment.BottomEnd)
                    .padding(end = 8.dp, bottom = 8.dp)
            )
        }
    }
}

@Composable
fun PreviousNextButtons(
    paintingNum: Int,
    onNextButtonPress: (Int) -> Unit,
    onPrevButtonPress: (Int) -> Unit,
    loopToBeginning: (Int) -> Unit,
    loopToEnd: (Int) -> Unit,
    paintingArr: Array<Painting>,
    modifier: Modifier = Modifier
) {
    Box {
        Row(
            horizontalArrangement = Arrangement.SpaceAround,
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .fillMaxSize()
                .padding(bottom = 8.dp)
                .align(Alignment.BottomCenter)
        ) {
            Button(
                onClick = {
                    when (paintingNum) {
                        in 1..paintingArr.lastIndex -> {
                            onPrevButtonPress(paintingNum)
                        }
                        else -> {
                            loopToEnd(paintingNum)
                        }
                    }
                },
                modifier = Modifier
                    .wrapContentHeight()
                    .width(124.dp)
            ) {
                Text(text = "PREVIOUS")
            }

            Button(
                onClick = {
                    when (paintingNum) {
                        in 0 until paintingArr.lastIndex -> {
                            onNextButtonPress(paintingNum)
                        }
                        else -> {
                            loopToBeginning(paintingNum)
                        }
                    }
                },
                modifier = Modifier
                    .wrapContentHeight()
                    .width(124.dp)
            ) {
                Text(text = "NEXT")
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ArtSpace2Theme {
        ArtSpace2Screen()
    }
}

@Preview(showBackground = true, device = Devices.AUTOMOTIVE_1024p)
@Composable
fun LandscapePreview() {
    ArtSpace2Theme {
        ArtSpace2Screen()
    }
}
package cat.dam.andy.app.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import cat.dam.andy.app.ui.theme.AppTheme

private val DarkGreen = Color(0xFF006400) 

private val FRAME_HEIGHT = 40.dp
private val STEP_WIDTH = 15.dp 
private val TEXT_SIZE = 25.sp

@Composable
fun SteppedFrame(
    text: String,
    backgroundColor: Color,
    textColor: Color,
    stepCount: Int, 
    modifier: Modifier = Modifier
) {
    Row(
        modifier = modifier
            .fillMaxWidth()
            .height(FRAME_HEIGHT)
            .background(backgroundColor), 
        verticalAlignment = Alignment.CenterVertically
    ) {
        Spacer(
            modifier = Modifier
                .width(STEP_WIDTH * stepCount)
                .fillMaxHeight()
        )

        Box(
            modifier = Modifier
                .weight(1f)
                .fillMaxHeight(),
            contentAlignment = Alignment.CenterStart
        ) {
            Text(
                text = text,
                color = textColor,
                fontSize = TEXT_SIZE,
                fontWeight = FontWeight.Bold,
                fontFamily = FontFamily.Cursive,
                modifier = Modifier.padding(start = 8.dp)
            )
        }
    }
}

@Composable
fun Layout2Screen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(top = 10.dp) 
    ) {

        SteppedFrame(
            text = "frame1",
            backgroundColor = Color.Black,
            textColor = Color.White,
            stepCount = 0
        )

        SteppedFrame(
            text = "frame2",
            backgroundColor = Color.Yellow,
            textColor = Color.Black,
            stepCount = 1
        )

        SteppedFrame(
            text = "frame3",
            backgroundColor = Color.White,
            textColor = Color.Black,
            stepCount = 2
        )

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f) 
                .background(DarkGreen) 
        ) {
            Spacer(
                modifier = Modifier
                    .width(STEP_WIDTH * 3)
                    .fillMaxHeight()
            )

            Box(
                modifier = Modifier
                    .weight(1f) 
                    .fillMaxHeight()
                    .padding(top = 8.dp),
                contentAlignment = Alignment.TopStart
            ) {
                Text(
                    text = "frame4",
                    color = Color.White,
                    fontSize = TEXT_SIZE,
                    fontWeight = FontWeight.Bold,
                    fontFamily = FontFamily.Cursive
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewLayout2() {
    AppTheme {
        Layout2Screen()
    }
}

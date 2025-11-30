package cat.dam.andy.app.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import cat.dam.andy.app.ui.theme.AppTheme
import cat.dam.andy.app.ui.theme.Navy

@Composable
fun Layout3() {
    Column()
    {
        Row(
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f),
        ) {
            Text(
                text = "7", color = Color.White, fontSize = 40.sp, textAlign = TextAlign.Center, modifier = Modifier
                    .weight(1f)
                    .fillMaxHeight()
                    .background(Navy)
                    .wrapContentHeight(Alignment.CenterVertically)
            )
            Text(
                text = "8", color = Color.White, fontSize = 40.sp, textAlign = TextAlign.Center, modifier = Modifier
                    .weight(1f)
                    .fillMaxHeight()
                    .background(Navy)
                    .wrapContentHeight(Alignment.CenterVertically)
            )
            Text(
                text = "9", color = Color.White, fontSize = 40.sp, textAlign = TextAlign.Center, modifier = Modifier
                    .weight(1f)
                    .fillMaxHeight()
                    .background(Navy)
                    .wrapContentHeight(Alignment.CenterVertically)
            )
            Text(
                text = "÷", color = Color.White, fontSize = 40.sp, textAlign = TextAlign.Center, modifier = Modifier
                    .weight(1f)
                    .fillMaxHeight()
                    .background(Color.Red)
                    .wrapContentHeight(Alignment.CenterVertically)
            )
        }

        Row(
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f),
        ) {
            Text(
                text = "4", color = Color.White, fontSize = 40.sp, textAlign = TextAlign.Center, modifier = Modifier
                    .weight(1f)
                    .fillMaxHeight()
                    .background(Navy)
                    .wrapContentHeight(Alignment.CenterVertically)
            )
            Text(
                text = "5", color = Color.White, fontSize = 40.sp, textAlign = TextAlign.Center, modifier = Modifier
                    .weight(1f)
                    .fillMaxHeight()
                    .background(Navy)
                    .wrapContentHeight(Alignment.CenterVertically)
            )

            Text(
                text = "6", color = Color.White, fontSize = 40.sp, textAlign = TextAlign.Center, modifier = Modifier
                    .weight(1f)
                    .fillMaxHeight()
                    .background(Navy)
                    .wrapContentHeight(Alignment.CenterVertically)
            )

            Text(
                text = "×", color = Color.White, fontSize = 40.sp, textAlign = TextAlign.Center, modifier = Modifier
                    .weight(1f)
                    .fillMaxHeight()
                    .background(Color.Red)
                    .wrapContentHeight(Alignment.CenterVertically)
            )
        }

        Row(
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f),
        ) {
            Text(
                text = "1", color = Color.White, fontSize = 40.sp, textAlign = TextAlign.Center, modifier = Modifier
                    .weight(1f)
                    .fillMaxHeight()
                    .background(Navy)
                    .wrapContentHeight(Alignment.CenterVertically)
            )
            Text(
                text = "2", color = Color.White, fontSize = 40.sp, textAlign = TextAlign.Center, modifier = Modifier
                    .weight(1f)
                    .fillMaxHeight()
                    .background(Navy)
                    .wrapContentHeight(Alignment.CenterVertically)
            )
            Text(
                text = "3", color = Color.White, fontSize = 40.sp, textAlign = TextAlign.Center, modifier = Modifier
                    .weight(1f)
                    .fillMaxHeight()
                    .background(Navy)
                    .wrapContentHeight(Alignment.CenterVertically)
            )
            Text(
                text = "-", color = Color.White, fontSize = 40.sp, textAlign = TextAlign.Center, modifier = Modifier
                    .weight(1f)
                    .fillMaxHeight()
                    .background(Color.Red)
                    .wrapContentHeight(Alignment.CenterVertically)
            )
        }

        Row(
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f),
        ) {
            Text(
                text = ".", color = Color.White, fontSize = 40.sp, textAlign = TextAlign.Center, modifier = Modifier
                    .weight(1f)
                    .fillMaxHeight()
                    .background(Navy)
                    .wrapContentHeight(Alignment.CenterVertically)
            )
            Text(
                text = "0", color = Color.White, fontSize = 40.sp, textAlign = TextAlign.Center, modifier = Modifier
                    .weight(1f)
                    .fillMaxHeight()
                    .background(Navy)
                    .wrapContentHeight(Alignment.CenterVertically)
            )
            Text(
                text = "=", color = Color.White, fontSize = 40.sp, textAlign = TextAlign.Center, modifier = Modifier
                    .weight(1f)
                    .fillMaxHeight()
                    .background(Navy)
                    .wrapContentHeight(Alignment.CenterVertically)
            )
            Text(
                text = "+", color = Color.White, fontSize = 40.sp, textAlign = TextAlign.Center, modifier = Modifier
                    .weight(1f)
                    .fillMaxHeight()
                    .background(Color.Red)
                    .wrapContentHeight(Alignment.CenterVertically)
            )
        }
    }
}

@Composable
@Preview(showBackground = true)
fun PreviewLayout3() {
    AppTheme {
        Layout3()
    }
}
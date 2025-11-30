package cat.dam.andy.app.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.tooling.preview.Preview
import cat.dam.andy.app.ui.theme.AppTheme
import cat.dam.andy.app.ui.theme.Green

private const val LongTextYellowBlock = "Alaric Alaric Alaric Alaric Alaric Alaric Alaric Alaric Alaric Alaric Alaric Alaric Alaric Alaric Alaric Alaric Alaric Alaric Alaric Alaric Alaric Alaric Alaric Alaric Alaric Alaric Alaric Alaric Alaric Alaric Alaric Alaric Alaric Alaric Alaric Alaric Alaric Alaric Alaric Alaric Alaric Alaric Alaric Alaric Alaric Alaric Alaric Alaric Alaric Alaric Alaric Alaric Alaric Alaric Alaric Alaric Alaric Alaric Alaric Alaric Alaric "

private const val LongTextRedBlock = "Alaric Alaric Alaric Alaric Alaric Alaric Alaric Alaric Alaric Alaric Alaric Alaric Alaric Alaric Alaric Alaric Alaric Alaric Alaric Alaric Alaric Alaric Alaric Alaric Alaric Alaric Alaric Alaric Alaric Alaric Alaric Alaric Alaric Alaric Alaric Alaric Alaric Alaric Alaric Alaric Alaric Alaric Alaric Alaric Alaric Alaric Alaric Alaric Alaric Alaric Alaric Alaric Alaric Alaric Alaric Alaric Alaric Alaric Alaric Alaric Alaric "

@Composable
fun Layout1() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(5.dp)
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(35.dp)
                .background(Green)
                .padding(start = 8.dp),
            contentAlignment = Alignment.CenterStart
        ) {
            Text(
                text = "Alaric",
                style = MaterialTheme.typography.bodyLarge,
                fontFamily = FontFamily.Cursive,
                fontSize = 20.sp,
                color = Color.Black
            )
        }

        Spacer(
            modifier = Modifier
                .fillMaxWidth()
                .height(6.dp)
                .background(Color.White)
        )

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f)
                .background(Color.Yellow)
        ) {
            Column(
                modifier = Modifier
                    .weight(0.3f)
                    .fillMaxHeight()
                    .background(Color.Red)
                    .padding(6.dp)

            ) {
                repeat(8) {
                    Text(
                        text = "Alaric",
                        style = MaterialTheme.typography.bodyLarge,
                        fontFamily = FontFamily.Cursive,
                        fontSize = 20.sp,
                        color = Color.Black,
                        textAlign = TextAlign.Center,
                    )
                }
            }

            Spacer(modifier = Modifier.width(6.dp))

            Column(
                modifier = Modifier
                    .weight(0.7f)
                    .fillMaxHeight()
                    .background(Color.Yellow)
                    .padding(6.dp)
            ) {
                Row(modifier = Modifier.fillMaxWidth()) {

                    Box(
                        modifier = Modifier
                            .weight(1f)
                            .height(55.dp)
                            .background(Green),
                        contentAlignment = Alignment.Center
                    ) {
                        Text(
                            text = "Alaric",
                            style = MaterialTheme.typography.bodyLarge,
                            fontFamily = FontFamily.Cursive,
                            fontSize = 20.sp,
                            color = Color.Black
                        )
                    }

                    Spacer(modifier = Modifier.width(6.dp))

                    Box(
                        modifier = Modifier
                            .weight(1f)
                            .height(55.dp)
                            .background(Color.Blue),
                        contentAlignment = Alignment.Center
                    ) {
                        Text(
                            text = "Alaric",
                            style = MaterialTheme.typography.bodyLarge,
                            fontFamily = FontFamily.Cursive,
                            fontSize = 20.sp,
                            color = Color.Black
                        )
                    }
                }
            }
        }

        Spacer(
            modifier = Modifier
                .fillMaxWidth()
                .height(6.dp)
                .background(Color.White)
        )

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f)
        ) {
            Box(
                modifier = Modifier
                    .weight(0.35f)
                    .fillMaxHeight()
                    .background(Color.Magenta)
                    .padding(6.dp)
            ) {
                Box(
                    modifier = Modifier
                        .size(100.dp)
                        .background(Color.Cyan),
                    contentAlignment = Alignment.Center
                ) {
                    Text(
                        text = "Alaric",
                                style = MaterialTheme.typography.bodyLarge,
                        fontFamily = FontFamily.Cursive,
                        fontSize = 20.sp,
                        color = Color.Black
                    )
                }
            }

            Spacer(modifier = Modifier.width(6.dp))

            Column(
                modifier = Modifier
                    .weight(0.25f)
                    .fillMaxHeight()
                    .background(Color.Yellow)
                    .padding(8.dp)
            ) {
                Text(
                    text = LongTextYellowBlock,
                    color = Color.Black,
                    style = MaterialTheme.typography.bodyLarge,
                    fontFamily = FontFamily.Cursive
                )
            }

            Spacer(modifier = Modifier.width(6.dp))

            Box(
                modifier = Modifier
                    .weight(0.4f)
                    .fillMaxHeight()
                    .background(Color.Red)
                    .border(4.dp, Color.White)
                    .padding(10.dp)
            ) {
                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .background(Color.White)
                        .padding(8.dp)
                ) {
                    Text(
                        text = LongTextRedBlock,
                        style = MaterialTheme.typography.bodyLarge,
                        fontFamily = FontFamily.Cursive,
                        fontSize = 20.sp,
                        color = Color.Black
                    )
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewLayout1() {
    AppTheme {
        Layout1()
    }
}



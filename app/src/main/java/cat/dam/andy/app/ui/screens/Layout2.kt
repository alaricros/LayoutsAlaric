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

// Color verd fosc que coincideix amb la teva imatge de referència
private val DarkGreen = Color(0xFF006400) // Un DarkGreen

// Dimensions
private val FRAME_HEIGHT = 40.dp
private val STEP_WIDTH = 15.dp // Amplada de cada esglaó (Spacer)
private val TEXT_SIZE = 25.sp

// Funció que crea una FILA amb un Spacer per simular l'escala/decalatge
@Composable
fun SteppedFrame(
    text: String,
    backgroundColor: Color,
    textColor: Color,
    stepCount: Int, // Indica quants passos d'amplada de Spacer necessitem
    modifier: Modifier = Modifier
) {
    Row(
        modifier = modifier
            .fillMaxWidth()
            .height(FRAME_HEIGHT)
            // Apliquem el color de fons només a la part de contingut, no al Spacer.
            // Però, com que el Frame ha de fer l'efecte L, posem el color de fons a la Fila
            // i usem el Spacer per empènyer el contingut.
            .background(backgroundColor), // El color cobreix tota la fila
        verticalAlignment = Alignment.CenterVertically
    ) {
        // 1. Spacer per crear el decalatge (l'amplada que es menja l'espai)
        Spacer(
            modifier = Modifier
                .width(STEP_WIDTH * stepCount)
                .fillMaxHeight()
        )

        // 2. Text Content (utilitza el pes restant)
        Box(
            modifier = Modifier
                .weight(1f) // Ocupa l'espai restant de la fila
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
            .padding(top = 10.dp) // Padding superior per allunyar-ho de la barra de navegació
    ) {
        // --- Frames superposats amb efecte "L" ---

        // Frame 1 (Black, Text White) - Sense desplaçament
        SteppedFrame(
            text = "frame1",
            backgroundColor = Color.Black,
            textColor = Color.White,
            stepCount = 0
        )

        // Frame 2 (Yellow, Text Black) - 1 pas
        SteppedFrame(
            text = "frame2",
            backgroundColor = Color.Yellow,
            textColor = Color.Black,
            stepCount = 1
        )

        // Frame 3 (White, Text Black) - 2 passos
        SteppedFrame(
            text = "frame3",
            backgroundColor = Color.White,
            textColor = Color.Black,
            stepCount = 2
        )

        // --- Frame 4 (Dark Green, Text White) ---
        // Aquest bloc ocupa la resta de l'espai. Ha de ser tractat com un Box gran
        // que té un Spacer al principi per empènyer el contingut i el fons.
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f) // Ocupa l'espai vertical restant
                .background(DarkGreen) // El fons verd cobreix tota l'amplada disponible.
        ) {
            // Spacer per crear el decalatge del fons i el text (3 passos)
            Spacer(
                modifier = Modifier
                    .width(STEP_WIDTH * 3)
                    .fillMaxHeight()
            )

            // Contingut del Frame 4
            Box(
                modifier = Modifier
                    .weight(1f) // Ocupa la resta de l'espai a la dreta del Spacer
                    .fillMaxHeight()
                    .padding(top = 8.dp), // Afegim padding superior només al Box de text
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
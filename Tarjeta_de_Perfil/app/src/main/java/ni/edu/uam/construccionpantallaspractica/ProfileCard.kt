package ni.edu.uam.construccionpantallaspractica

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.CheckCircle
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun ProfileScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        // Título
        Text(
            text = "Perfil de Usuario",
            style = MaterialTheme.typography.headlineMedium,
            fontWeight = FontWeight.Bold,
            color = MaterialTheme.colorScheme.primary
        )

        Spacer(modifier = Modifier.height(24.dp))

        // Ejercicio adicional: Disposición en Fila (Imagen + Información)
        Card(
            modifier = Modifier.fillMaxWidth(),
            shape = RoundedCornerShape(12.dp),
            elevation = CardDefaults.cardElevation(4.dp),
            colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surfaceVariant.copy(alpha = 0.3f))
        ) {
            Row(
                modifier = Modifier
                    .padding(16.dp)
                    .fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.spacedBy(16.dp)
            ) {
                // Imagen de Perfil en un Box (Pauta: Box para control de alineación)
                Box(
                    modifier = Modifier
                        .size(80.dp)
                        .clip(CircleShape)
                        .background(MaterialTheme.colorScheme.primaryContainer),
                    contentAlignment = Alignment.Center
                ) {
                    Icon(
                        imageVector = Icons.Default.Person,
                        contentDescription = "Foto de perfil",
                        modifier = Modifier.size(50.dp),
                        tint = MaterialTheme.colorScheme.primary
                    )
                    // Superposición de texto (Ejercicio adicional)
                    Box(
                        modifier = Modifier.fillMaxSize(),
                        contentAlignment = Alignment.BottomCenter
                    ) {
                        Text(
                            text = "ACTIVO",
                            color = Color.White,
                            fontSize = 8.sp,
                            fontWeight = FontWeight.Bold,
                            modifier = Modifier
                                .background(Color(0xFF4CAF50), RoundedCornerShape(4.dp))
                                .padding(horizontal = 4.dp, vertical = 1.dp)
                        )
                    }
                }

                // Información del usuario (Nombre + Descripción)
                Column(
                    verticalArrangement = Arrangement.spacedBy(4.dp)
                ) {
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.spacedBy(4.dp)
                    ) {
                        Text(
                            text = "Julio Mendez",
                            fontSize = 18.sp,
                            fontWeight = FontWeight.Bold
                        )
                        Icon(
                            imageVector = Icons.Default.CheckCircle,
                            contentDescription = "Verificado",
                            tint = Color(0xFF2196F3),
                            modifier = Modifier.size(16.dp)
                        )
                    }
                    Text(
                        text = "Desarrollador Android Senior",
                        color = MaterialTheme.colorScheme.onSurfaceVariant,
                        fontSize = 14.sp
                    )
                    Text(
                        text = "Managua, Nicaragua",
                        color = MaterialTheme.colorScheme.onSurfaceVariant.copy(alpha = 0.7f),
                        fontSize = 12.sp
                    )
                }
            }
        }

        Spacer(modifier = Modifier.height(32.dp))

        // Botones de acción (Rec 2: Distribuidos a lo ancho)
        Row(
            modifier = Modifier.fillMaxWidth().padding(horizontal = 16.dp),
            horizontalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            Button(
                onClick = { /* TODO */ },
                modifier = Modifier.weight(1f),
                colors = ButtonDefaults.buttonColors(containerColor = MaterialTheme.colorScheme.primary)
            ) {
                Text("Seguir", fontWeight = FontWeight.Bold)
            }
            OutlinedButton(
                onClick = { /* TODO */ },
                modifier = Modifier.weight(1f)
            ) {
                Icon(Icons.Default.Email, contentDescription = null, tint = MaterialTheme.colorScheme.primary)
                Spacer(Modifier.width(8.dp))
                Text("Mensaje", color = MaterialTheme.colorScheme.primary)
            }
        }

        Spacer(modifier = Modifier.height(32.dp))
        HorizontalDivider(color = Color.LightGray.copy(alpha = 0.5f))
        Spacer(modifier = Modifier.height(32.dp)) // Aire entre línea y tarjeta (Rec 1)

        // Reto: Tarjeta estilo red social
        SocialMediaCard()
    }
}

@Composable
fun SocialMediaCard() {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 4.dp),
        shape = RoundedCornerShape(16.dp),
        elevation = CardDefaults.cardElevation(defaultElevation = 6.dp),
        colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surface)
    ) {
        Column {
            // Cabecera de la publicación (Rec 5)
            Row(
                modifier = Modifier.padding(12.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Icon(Icons.Default.Person, contentDescription = null, modifier = Modifier.size(32.dp), tint = Color.Gray)
                Spacer(modifier = Modifier.width(8.dp))
                Column {
                    Text(text = "Julio Mendez", fontWeight = FontWeight.Bold, fontSize = 14.sp)
                    Text(text = "Hace 2 h", fontSize = 12.sp, color = Color.Gray)
                }
            }

            // Imagen principal (Rec 6: Placeholder más trabajado)
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(200.dp)
                    .padding(horizontal = 12.dp)
                    .clip(RoundedCornerShape(8.dp))
                    .background(Color(0xFFE0F7FA)), // Color suave
                contentAlignment = Alignment.Center
            ) {
                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    Icon(Icons.Default.Person, contentDescription = null, modifier = Modifier.size(48.dp), tint = Color(0xFF00ACC1))
                    Spacer(modifier = Modifier.height(8.dp))
                    Text("Imagen de Publicación", color = Color(0xFF007C91), fontWeight = FontWeight.Medium)
                }
            }

            // Texto descriptivo (Rec 4: Coherencia de colores)
            Column(modifier = Modifier.padding(12.dp)) {
                Text(
                    text = "¡Hoy aprendiendo Jetpack Compose!",
                    fontWeight = FontWeight.Bold,
                    fontSize = 16.sp,
                    color = MaterialTheme.colorScheme.onSurface
                )
                Spacer(modifier = Modifier.height(4.dp))
                Text(
                    text = "Explorando el poder de los layouts en Android. #AndroidDev #Compose",
                    fontSize = 14.sp,
                    color = Color.DarkGray
                )
            }

            HorizontalDivider(color = Color.LightGray.copy(alpha = 0.3f))

            // Fila de botones (Rec 5 y Rec 7: Iconos con texto y bien alineados)
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 8.dp, vertical = 6.dp),
                horizontalArrangement = Arrangement.SpaceEvenly,
                verticalAlignment = Alignment.CenterVertically
            ) {
                TextButton(onClick = { /* TODO */ }) {
                    Icon(Icons.Default.Favorite, contentDescription = "Like", tint = Color.Red, modifier = Modifier.size(18.dp))
                    Spacer(modifier = Modifier.width(4.dp))
                    Text("Me gusta", color = Color.Gray)
                }
                TextButton(onClick = { /* TODO */ }) {
                    Icon(Icons.Default.CheckCircle, contentDescription = "Comentar", tint = Color.Gray, modifier = Modifier.size(18.dp))
                    Spacer(modifier = Modifier.width(4.dp))
                    Text("Comentar", color = Color.Gray)
                }
                TextButton(onClick = { /* TODO */ }) {
                    Icon(Icons.Default.Share, contentDescription = "Compartir", tint = Color.Gray, modifier = Modifier.size(18.dp))
                    Spacer(modifier = Modifier.width(4.dp))
                    Text("Compartir", color = Color.Gray)
                }
            }
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun ProfileScreenPreview() {
    ProfileScreen()
}

package br.senai.sp.jandira.homescreen.screen

import androidx.navigation.NavHostController


import android.util.Log
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Checkbox
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

import br.senai.sp.jandira.homescreen.R

@Composable
fun PerfilPet(modifier: Modifier){
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color(0xffD5E9D5))
    ){
        Column (
            modifier = Modifier
                .fillMaxWidth()

        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(color = Color(0xffFEFAE0)),
            ) {
                Row (
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(10.dp),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ){
                    Button(
                        onClick = {},
                        colors = ButtonDefaults.buttonColors(containerColor = Color(0xff244B2E)),
                    ) {
                        Icon(
                            imageVector = Icons.Default.Menu,
                            contentDescription = "",
                            tint = Color(0xFFFFFFFF),

                            )
                    }
                    Image(
                        painter = painterResource(R.drawable.logm),
                        contentDescription = "",
                        modifier = Modifier
                            .size(100.dp)
                    )
                    IconButton(
                        onClick = {}
                    ) {
                        Icon(
                            imageVector = Icons.Default.Person,
                            contentDescription = "",
                            modifier = Modifier
                                .size(200.dp)
                        )
                    }
                }

            }
            Row (
                modifier = Modifier
                    .padding(16.dp)
                    //.background(color = Color.Red)
                    .fillMaxWidth()
                    .height(250.dp)

            ){
                Column (
                    modifier = Modifier
                        .fillMaxHeight()
                        .width(170.dp)
                ){
                    Image(
                        painter = painterResource(R.drawable.img),
                        contentDescription = "",
                        modifier = Modifier
                            .fillMaxSize()
                    )
                }
                Column(
                    modifier = Modifier
                        .fillMaxHeight()
                        .fillMaxWidth()
                        .padding(start = 8.dp)
                ){
                    Text(
                        text = "Nome do Animal",
                        color = Color(color = 0xffA46731),
                        fontSize = 22.sp,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier
                            .padding(top = 42.dp, start = 12.dp)
                    )
                    Row (
                        modifier = Modifier
                            .fillMaxWidth(),
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.SpaceBetween
                    ){

                        Text(
                            text = "Espécie",
                            color = Color(color = 0xff8BD999),
                            fontSize = 10.sp,
                            fontWeight = FontWeight.Bold,
                            modifier = Modifier
                                .padding(top = 9.dp)
                        )
                        Divider(
                            modifier = Modifier
                                .padding(top = 9.dp)
                                .height(22.dp)
                                .width(2.dp),
                            color = Color(0xff8BD999)
                        )
                        Text(
                            text = "Raça",
                            color = Color(color = 0xff8BD999),
                            fontSize = 10.sp,
                            fontWeight = FontWeight.Bold,
                            modifier = Modifier
                                .padding(top = 9.dp)
                        )
                        Divider(
                            modifier = Modifier
                                .padding(top = 9.dp)
                                .height(22.dp)
                                .width(2.dp),
                            color = Color(0xff8BD999)
                        )
                        Text(
                            text = "Sexo",
                            color = Color(color = 0xff8BD999),
                            fontSize = 10.sp,
                            fontWeight = FontWeight.Bold,
                            modifier = Modifier
                                .padding(top = 9.dp)
                        )
                        Divider(
                            modifier = Modifier
                                .padding(top = 9.dp)
                                .height(22.dp)
                                .width(2.dp),
                            color = Color(0xff8BD999)
                        )
                        Text(
                            text = "Porte",
                            color = Color(color = 0xff8BD999),
                            fontSize = 10.sp,
                            fontWeight = FontWeight.Bold,
                            modifier = Modifier
                                .padding(top = 9.dp)
                        )
                    }
                    Text(
                        text = "Divulgado por UserSLA",
                        color = Color(color = 0xff000000),
                        fontSize = 14.sp,
                        fontWeight = FontWeight.Medium,
                        modifier = Modifier
                            .padding(top = 24.dp, start = 12.dp)
                    )
                    Text(
                        text = "Localização:",
                        color = Color(color = 0xffA46731),
                        fontSize = 15.sp,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier
                            .padding(top = 24.dp, start = 12.dp)
                    )
                    Text(
                        text = "UF, Estado",
                        color = Color(color = 0xff8BD999),
                        fontSize = 15.sp,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier
                            .padding(top = 3.dp, start = 12.dp)
                    )
                }


            }
            Text(
                text = "Sobre:",
                color = Color(color = 0xffA46731),
                fontSize = 19.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier
                    .padding(start = 28.dp)
            )
            Text(
                text = "Texto de Necessidades",
                color = Color(color = 0xff000000),
                fontSize = 16.sp,
                fontWeight = FontWeight.Normal,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(150.dp)
                    .padding(start = 28.dp,top = 15.dp, end = 28.dp)
            )

            Row (
                modifier = Modifier
                    .padding(start = 24.dp, end = 24.dp)
                    .fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ){
                Text(
                    text = "Vacinado",
                    color = Color(color = 0xff8BD999),
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Medium,
                    modifier = Modifier
                        .padding(top = 9.dp)
                )
                Divider(
                    modifier = Modifier
                        .padding(top = 9.dp)
                        .height(32.dp)
                        .width(2.dp),
                    color = Color(0xff8BD999)
                )
                Text(
                    text = "Vermifugado",
                    color = Color(color = 0xff8BD999),
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Medium,
                    modifier = Modifier
                        .padding(top = 9.dp)
                )
                Divider(
                    modifier = Modifier
                        .padding(top = 9.dp)
                        .height(32.dp)
                        .width(2.dp),
                    color = Color(0xff8BD999)
                )
                Text(
                    text = "Castrado",
                    color = Color(color = 0xff8BD999),
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Medium,
                    modifier = Modifier
                        .padding(top = 9.dp)
                )
            }
            Row(modifier=Modifier
                .padding(top = 20.dp)
                .fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center
            ) {
                Cardcomportamento()
                Cardcomportamento()
                Cardcomportamento()
                Cardcomportamento()
            }
            Divider(modifier =Modifier .height(28.dp).fillMaxWidth() .padding(top = 20.dp,
                start = 24.dp, end = 24.dp),
                color = Color(color = 0xffBC6C25))

            Button(onClick = {},
                colors = ButtonDefaults.buttonColors(Color(0xffDA8940)),
                border = BorderStroke(width = 1.dp, color = Color.Black),
                modifier = Modifier
                    .padding(top = 42.dp, start = 120.dp)

            ) {
                Text(
                    text = "Quero Adotar",
                    fontSize = 20.sp
                )
            }

        }
    }
}

@Preview(showSystemUi = true)
@Composable
private fun PerfilPetPreview() {
    PerfilPet(modifier = Modifier)
}

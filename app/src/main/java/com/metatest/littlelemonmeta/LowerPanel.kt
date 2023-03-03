package com.metatest.littlelemonmeta

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun LowerPanel() {
    Column {
        WeeklySpecial()
        MenuDish()
    }
}


@Composable
fun WeeklySpecial()

{
    Card( // head of Card
        modifier = Modifier
            .fillMaxWidth()

    )


    { // body of Card

        Text(text = stringResource(id = R.string.weeklyspecial), fontSize = 26.sp, fontWeight = FontWeight.Bold, modifier = Modifier.padding(all = 8.dp))

    }
}


@Composable
fun MenuDish() {


    Card() {

        Row() {

            val modifier = Modifier
                .padding(8.dp)
            Column() {
                Text(text = stringResource(R.string.greeksalad), fontSize = 18.sp, fontWeight = FontWeight.Bold)
                Text(text = stringResource(R.string.famous_salad),
                    modifier = Modifier
                        .padding(top = 5.dp, bottom = 5.dp,)
                        .fillMaxWidth(75f)
                )

                Text(text = stringResource(R.string.price), fontWeight = FontWeight.Bold, color = Color.Gray)


            } // end of ColumnScope
            Image(painter = painterResource(id = R.drawable.greeksalad) , contentDescription = "Greek Salad Image" )



        } // end of Row Scope

    } // end of Card


}

@Preview(showBackground = true)
@Composable
fun LowerPanelPreview(){
    LowerPanel()
}

package com.jakey.compose.presentation.players.composables

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.jakey.compose.domain.model.Player

@Composable
fun PlayerListCard(
    players: List<Player>,
    index: Int
) {
    Card(
        shape = RoundedCornerShape(10.dp),
        elevation = CardDefaults.cardElevation(
            defaultElevation = 5.dp
        ),
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp, vertical = 8.dp),
        border = BorderStroke(2.dp, color = MaterialTheme.colorScheme.inversePrimary)

    ) {
        Text(
            text = players[index].name,
            Modifier.padding(horizontal = 16.dp, vertical = 8.dp),
            style = MaterialTheme.typography.titleMedium
        )
        Text(
            text = players[index].batHand,
            Modifier.padding(horizontal = 16.dp, vertical = 8.dp)
        )
        Text(
            text = players[index].position,
            Modifier.padding(horizontal = 16.dp, vertical = 8.dp)
        )
        Text(
            text = players[index].id.toString(),
            Modifier.padding(horizontal = 16.dp, vertical = 8.dp)
        )
    }
}


@Preview
@Composable
fun StatCardPreview() {
    PlayerListCard(listOf(Player("jake", 234234, "R", "OF")), index = 0)
}
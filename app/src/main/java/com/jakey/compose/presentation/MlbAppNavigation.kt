package com.jakey.compose.presentation

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.hilt.navigation.compose.hiltViewModel
import com.jakey.compose.presentation.players.PlayerViewModel
import dagger.hilt.android.AndroidEntryPoint

@Composable
fun MlbAppNavigation() {

}

object Route {
    const val USER = "user"
    const val DETAIL = "detail"
}

object Argument {
    const val USERNAME = "username"
}

//@Composable
//fun ComposeApp() {
//    val navController = rememberNavController()
//    NavHost(
//        navController = navController,
//        startDestination = Route.USER
//    ) {
//        composable(Route.USER) { backStackEntry ->
//            UsersScreen(
//                onUserClick = { username ->
//                    // In order to discard duplicated navigation events, we check the Lifecycle
//                    if (backStackEntry.lifecycle.currentState == Lifecycle.State.RESUMED) {
//                        navController.navigate("${Route.DETAIL}/$username")
//                    }
//                }
//            )
//        }
//        composable(
//            route = "${Route.DETAIL}/{${Argument.USERNAME}}",
//            arguments = listOf(
//                navArgument(Argument.USERNAME) {
//                    type = NavType.StringType
//                }
//            ),
//        ) {
//            DetailsScreen()
//        }
//    }
//}
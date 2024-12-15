package com.yarendemirkaya.homeworkfournavigation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.yarendemirkaya.homeworkfournavigation.ui.screens.ScreenPass
import com.yarendemirkaya.homeworkfournavigation.ui.theme.HomeworkFourNavigationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            HomeworkFourNavigationTheme {
                ScreenPass()
            }
        }
    }
}

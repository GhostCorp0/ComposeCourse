package com.ghostcorp.composecourse

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.ghostcorp.composecourse.`2_FundamentalConcepts`.AccessStringResource
import com.ghostcorp.composecourse.`3_CoreComponents`.PartiallySelectableText
import com.ghostcorp.composecourse.ui.theme.ComposeCourseTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeCourseTheme {
                PartiallySelectableText()
            }
        }
    }
}

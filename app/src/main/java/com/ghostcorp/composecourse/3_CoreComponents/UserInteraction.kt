package com.ghostcorp.composecourse.`3_CoreComponents`

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.text.selection.DisableSelection
import androidx.compose.foundation.text.selection.SelectionContainer
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalUriHandler
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString


@Composable
fun PartiallySelectableText() {

    Box(modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center) {

        SelectionContainer {

            Column {

                Text(text = "This text can be select")
                Text(text = "This one too")
                Text(text = "This is third")

                DisableSelection {

                    Text(text = "This is not selectable text")

                    Text(text = "This is not selectable text")

                }
            }

        }

    }
}

/*
@Composable
fun AnnotatedStringWithListenerSample() {
    Text(
        buildAnnotatedString {
            append("Build better apps faster with ")

            withLink(
                LinkAnnotation.Url(
                    "https://developer.android.com/develop/ui/compose/documentation",
                    TextLinkStyles(style = SpanStyle(color = Color.Blue))
                )
            ) {
                append("Jetpack Compose")
            }
        }
    )
}
*/


/*
@Preview(showSystemUi = true)
@Composable
fun PartiallySelectableTextPreview() {
    PartiallySelectableText()
}*/

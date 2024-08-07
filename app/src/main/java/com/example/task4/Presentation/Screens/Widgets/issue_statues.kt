import androidx.annotation.StringRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.task4.R
import com.example.task4.ui.theme.Task4Theme

@Composable
fun IssueStatues(
    modifier: Modifier = Modifier,
    isOpened: Boolean
) {
        Text(
            text = if (isOpened) "Open" else "Close",
            style = MaterialTheme.typography.bodyMedium
        )

}



@Preview(showBackground = true)
@Composable
fun IssueStatuesPreview() {
    Task4Theme {
        IssueStatues(
            isOpened = true
        )
    }
}
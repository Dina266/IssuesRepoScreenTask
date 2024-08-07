import androidx.annotation.StringRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
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
fun IssueDetails(
    modifier: Modifier = Modifier,
    issueTitle: String,
    issueDesc: String,
    createdAt: String
) {

    Column(
        modifier = Modifier.padding(horizontal = 8.dp).width(210.dp).height(100.dp),
    ){

        Text(
            text = issueTitle,
            style = MaterialTheme.typography.labelLarge.copy(fontSize = 19.sp ),
            maxLines = 1,
            overflow = TextOverflow.Ellipsis

           )
        Spacer(modifier = Modifier.height(10.dp))
        Text(
            text = issueDesc,
            style = MaterialTheme.typography.bodyLarge
        )
        Spacer(modifier = Modifier.height(12.dp))
        Row {
            Text(
                text = stringResource(R.string.createdAt),
                style = MaterialTheme.typography.titleSmall.copy(fontSize = 14.sp )
            )

            Text(
                text = createdAt,
                style = MaterialTheme.typography.bodyMedium
            )

        }


    }

}



@Preview(showBackground = true)
@Composable
fun IssueDetailsPreview() {
    Task4Theme {
        IssueDetails(
            issueTitle = "Bumb Pyarrow from 7 to 9 every",
            issueDesc = "NONE",
            createdAt = "2023-7-11, 23:00 PM"
        )
    }
}
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.task4.R
import com.example.task4.ui.theme.Task4Theme

@Composable
fun CustomCardItem(modifier: Modifier = Modifier) {
    Row(
        modifier = modifier
            .fillMaxWidth()
            .background(
                color = MaterialTheme.colorScheme.surface,
                shape = RoundedCornerShape(12.dp)
            )
            .padding(8.dp),
        horizontalArrangement = Arrangement.SpaceAround
    ) {
        Image(
            modifier = Modifier.clip(CircleShape),
            painter = painterResource(id = R.drawable.ic_issues),
            contentDescription = stringResource(R.string.ic_issue)
        )
        IssueDetails(
            issueTitle = "Bumb Pyarrow from 7 to 9 every",
            issueDesc = "NONE",
            createdAt = "2023-7-11, 23:00 PM"
        )
        IssueStatues(isOpened = true)
    }
}

@Preview(showBackground = true)
@Composable
fun CustomCardItemPreview() {
    Task4Theme {
        CustomCardItem()
    }
}

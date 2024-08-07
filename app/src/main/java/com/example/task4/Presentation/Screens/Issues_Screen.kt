import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.task4.Presentation.Screens.Widgets.CustomCardBody
import com.example.task4.R
import com.example.task4.ui.theme.Task4Theme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun IssueScreen(modifier: Modifier = Modifier) {
    Scaffold(
        topBar = {
            RepoAppBar(title = R.string.issues_app_bar_title,
                titleStyle = MaterialTheme.typography.labelLarge.copy(fontSize = 20.sp)
                ) {
                
            }
        },

        content = { paddingValues ->
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .background(Color(0xFFEBEBEB))
            )
            {
                CustomCardBody(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(paddingValues)
                )
            }
        }
    )
}

@Preview(showBackground = true)
@Composable
fun IssueScreenPreview() {
    Task4Theme {
        IssueScreen()
    }
}

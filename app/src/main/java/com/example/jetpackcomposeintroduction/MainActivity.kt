//package com.example.jetpackcomposeintroduction
//
//import android.icu.text.CaseMap.Title
//import android.os.Bundle
//import android.view.Surface
//import android.widget.Toast
//import androidx.activity.ComponentActivity
//import androidx.activity.compose.setContent
//import androidx.compose.foundation.*
//import androidx.compose.foundation.layout.*
//import androidx.compose.foundation.lazy.LazyColumn
//import androidx.compose.foundation.lazy.items
//import androidx.compose.foundation.shape.CircleShape
//import androidx.compose.material.*
//import androidx.compose.runtime.Composable
//import androidx.compose.runtime.mutableStateListOf
//import androidx.compose.runtime.mutableStateOf
//import androidx.compose.runtime.remember
//import androidx.compose.ui.Alignment
//import androidx.compose.ui.Modifier
//import androidx.compose.ui.draw.clip
//import androidx.compose.ui.graphics.Color
//import androidx.compose.ui.layout.ContentScale
//import androidx.compose.ui.platform.LocalContext
//import androidx.compose.ui.res.colorResource
//import androidx.compose.ui.res.painterResource
//import androidx.compose.ui.res.stringResource
//import androidx.compose.ui.text.font.FontFamily
//import androidx.compose.ui.tooling.preview.Preview
//import androidx.compose.ui.unit.dp
//import androidx.compose.ui.unit.sp
//import com.example.jetpackcomposeintroduction.ui.theme.JetpackComposeIntroductionTheme
//
//class MainActivity : ComponentActivity() {
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
////        setContent {
////            Greeting(name = "Vithu")
////        }
////        setContent {
////            Title()
////        }
//        setContent{
////            UserList()
//            MainContent()
//        }
//    }
//}
//
////@Composable
////fun Greeting(name: String) {
////    Surface(
////        modifier =Modifier
////            .fillMaxHeight()
////            .fillMaxWidth()
////    ){
////        Text(text = "Hello $name!")
////    }
////
////}
////
////@Preview(showBackground = true)
////@Composable
////fun DefaultPreview() {
////    JetpackComposeIntroductionTheme {
////        Greeting("Android")
////    }
////}
////@Composable
////fun Title(){
////    val context= LocalContext.current
////    Text(text = "Simplified Coding",
////        fontSize = 32.sp,
////        fontFamily = FontFamily.Cursive,
////        color= colorResource(id = R.color.black),
////        modifier = Modifier.clickable {
////            Toast.makeText(context,"Title Clicked",Toast.LENGTH_LONG).show()
////        }
////    )
////}
//
//data class User(
//    val id: Int
//)
//
//@Composable
//fun MainContent(){
//    val user=User(1)
//    val users= remember {
//        mutableStateListOf(user)//add delete pannalaam
//    }
//    Box(modifier = Modifier.fillMaxSize()){
//        UserList(users = users)
//        Button(modifier = Modifier
//            .padding(24.dp)
//            .align(Alignment.BottomCenter),
//            onClick = {
//                users.add(User(1))
//
//        }) {
//            Text(text = "Add More")
//        }
//    }
//}
//
////val users= listOf(
////    User(1),
////    User(2),
////    User(3),
////    User(4),
////    User(5),
////    User(6),
////    User(1),
////    User(1),
////)
//
//
//
//@Composable
//fun UserList(users: List<User>){
////    val name= remember {
////        mutableStateOf("Tharsi kan")
////    }
////    Column(modifier = Modifier.verticalScroll(rememberScrollState())) {
////        for (i in 1..10){
////            UserCard()
////        }
////    }
//    LazyColumn{
//        items(users){user->
//            UserCard()
//
//        }
//    }
//}
//
//@Composable
//fun UserCard(){
//    Card(
//        elevation = 4.dp,
//        modifier = Modifier
//            .padding(12.dp)
//            .fillMaxWidth()
//            .wrapContentHeight()
//    ) {
//        Row(
//            modifier = Modifier
//                .fillMaxWidth()
//                .wrapContentHeight()
//                .padding(12.dp)
////                .border(width = 1.dp, color = Color.Gray)
//                .padding(12.dp)
//        ) {
//            Image(
//                painter = painterResource(id = R.drawable.tharsi),
//                contentDescription = "",
//                contentScale = ContentScale.Crop,
//                modifier = Modifier
//                    .size(120.dp)
//                    .clip(CircleShape)
//            )
//            Column() {
////            Text(text = stringResource(id = androidx.compose.ui.R.string.default_error_message))
//                Text(text = "I am Visvalinkam tharsikan" +
//                        "I am a software engineering undergrduate")
//                Button(onClick = {
//                    //perform button click action here
//                }) {
//                    Text(text = "View Profile")
//                }
//            }
//        }
//
//    }
//
//
//}
//
//@Preview(showBackground = true)
//@Composable
//fun DefaultPreview(){ Surface(
//        Modifier.fillMaxSize()
//    ) {
////        Title()
//    //UserCard()
////        UserList()
//    MainContent()
//    }
//
//}
///////////////////////////////////////////////////////////////////////////////////////////////
package com.example.jetpackcomposeintroduction

import androidx.appcompat.app.AppCompatActivity
import android.icu.text.CaseMap.Title
import android.os.Bundle
import android.view.Surface
import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.viewinterop.AndroidView
import androidx.core.app.ActivityCompat
import androidx.core.app.AppOpsManagerCompat
import com.example.jetpackcomposeintroduction.ui.theme.JetpackComposeIntroductionTheme

//class MainActivity :AppCompatActivity(){
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
//
//        supportFragmentManager
//            .beginTransaction()
//            .add(R.id.content,HomeFragment())
//            .commit()
//    }
//}
//
//
//
//data class User(
//    val id: Int
//)
//
//@Composable
//fun MainContent(){
//    val user=User(1)
//    val users= remember {
//        mutableStateListOf(user)
//    }
//    Box(modifier = Modifier.fillMaxSize()){
//        UserList(users = users)
//        Button(modifier = Modifier
//            .padding(24.dp)
//            .align(Alignment.BottomCenter),
//            onClick = {
//                users.add(User(1))
//
//            }) {
//            Text(text = "Add More")
//        }
//    }
//}
//
//
//
//@Composable
//fun UserList(users: List<User>){
//
//    LazyColumn{
//        items(users){user->
//            UserCard()
//
//        }
//    }
//}
//
//@Composable
//fun UserCard(){
//    Card(
//        elevation = 4.dp,
//        modifier = Modifier
//            .padding(12.dp)
//            .fillMaxWidth()
//            .wrapContentHeight()
//    ) {
//        Row(
//            modifier = Modifier
//                .fillMaxWidth()
//                .wrapContentHeight()
//                .padding(12.dp)
//                .padding(12.dp)
//        ) {
//            Image(
//                painter = painterResource(id = R.drawable.tharsi),
//                contentDescription = "",
//                contentScale = ContentScale.Crop,
//                modifier = Modifier
//                    .size(120.dp)
//                    .clip(CircleShape)
//            )
//            Column() {
////            Text(text = stringResource(id = androidx.compose.ui.R.string.default_error_message))
//                Text(text = "I am Visvalinkam tharsikan" +
//                        "I am a software engineering undergrduate")
//                Button(onClick = {
//                    //perform button click action here
//                }) {
//                    Text(text = "View Profile")
//                }
//            }
//        }
//
//    }
//
//
//}
//
//@Preview(showBackground = true)
//@Composable
//fun DefaultPreview(){ Surface(
//    Modifier.fillMaxSize()
//) {
//    MainContent()
//}
//
//}

///////////////////////////////////////////////////////////////////
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent{
            ComposeWithXML()
        }
    }
}

@Composable
fun ComposeWithXML(){
    AndroidView(
        factory = {
                  View.inflate(it,R.layout.layout1,null)
        },
        modifier = Modifier.fillMaxSize(),
        update ={
            val textView=it.findViewById<TextView>(R.id.text_view)
            textView.setOnClickListener{
                textView.text="View Text Updated"
            }
        }
    )
}

data class User(
    val id: Int
)

@Composable
fun MainContent(){
    val user=User(1)
    val users= remember {
        mutableStateListOf(user)//add delete pannalaam
    }
    Box(modifier = Modifier.fillMaxSize()){
        UserList(users = users)
        Button(modifier = Modifier
            .padding(24.dp)
            .align(Alignment.BottomCenter),
            onClick = {
                users.add(User(1))

        }) {
            Text(text = "Add More")
        }
    }
}





@Composable
fun UserList(users: List<User>){
//    val name= remember {
//        mutableStateOf("Tharsi kan")
//    }
//    Column(modifier = Modifier.verticalScroll(rememberScrollState())) {
//        for (i in 1..10){
//            UserCard()
//        }
//    }
    LazyColumn{
        items(users){user->
            UserCard()

        }
    }
}

@Composable
fun UserCard(){
    Card(
        elevation = 4.dp,
        modifier = Modifier
            .padding(12.dp)
            .fillMaxWidth()
            .wrapContentHeight()
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentHeight()
                .padding(12.dp)
//                .border(width = 1.dp, color = Color.Gray)
                .padding(12.dp)
        ) {
            Image(
                painter = painterResource(id = R.drawable.tharsi),
                contentDescription = "",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .size(120.dp)
                    .clip(CircleShape)
            )
            Column() {
//            Text(text = stringResource(id = androidx.compose.ui.R.string.default_error_message))
                Text(text = "I am Visvalinkam tharsikan" +
                        "I am a software engineering undergrduate")
                Button(onClick = {
                    //perform button click action here
                }) {
                    Text(text = "View Profile")
                }
            }
        }

    }


}

@Preview(showBackground = true)
@Composable
fun DefaultPreview(){
    Surface(
        Modifier.fillMaxSize()
    ) {
    ComposeWithXML()
    }

}


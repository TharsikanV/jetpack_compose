package com.example.jetpackcomposeintroduction

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.compose.ui.platform.ComposeView
import androidx.fragment.app.Fragment

//class HomeFragment:Fragment(R.layout.home_fragment) {
//    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
//        super.onViewCreated(view, savedInstanceState)
//
//        view.findViewById<ComposeView>(R.id.compose_view).setContent {
//            UserCard()
//        }
//    }
//}
class HomeFragment:Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return ComposeView(requireContext()).apply {
            setContent {
                UserCard()
            }
        }
    }
}
//xml part venaamna ipd seyyalaam
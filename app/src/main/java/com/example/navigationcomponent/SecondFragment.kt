package com.example.navigationcomponent

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_first.view.*
import kotlinx.android.synthetic.main.fragment_first.view.textView1
import kotlinx.android.synthetic.main.fragment_second.view.*


/**
 * A simple [Fragment] subclass.
 */
class SecondFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_second, container, false)
        view.textView2.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.navigateToFirstFragment) }

        return view
    }

}
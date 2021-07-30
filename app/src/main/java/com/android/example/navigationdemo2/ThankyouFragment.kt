package com.android.example.navigationdemo2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView


class ThankyouFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view=inflater.inflate(R.layout.fragment_thankyou, container, false)
        val tvScore=view.findViewById<TextView>(R.id.tvScore)
        val args=ThankyouFragmentArgs.fromBundle(requireArguments())

        val score:Double=(args.score/2.0)*100.0
        tvScore.text=String.format("Your score :%.2f%%",score)
            //



        return view
    }


}
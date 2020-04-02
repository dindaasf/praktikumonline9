package com.example.praktikumonline9


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.lifecycle.ViewModelProviders

class ThridFragment : Fragment(){
    private var comViewModel: ComViewModel? = null
    private var txtName: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        comViewModel = ViewModelProviders.
            of(requireActivity()).   get(ComViewModel::class.java)
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?     ): View? {
        return inflater.inflate(R.layout.fragment_thrid,
            container, false)     }
    companion object {

        fun newInstance(): ThridFragment{
            return ThridFragment()         }
    }
}

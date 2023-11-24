package com.example.t_ket.presentation.EventInfo

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.t_ket.R
import com.example.t_ket.databinding.FragmentEventInfoBinding


class EventInfoFragment : Fragment() {

    private var _binding: FragmentEventInfoBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        _binding = FragmentEventInfoBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

}
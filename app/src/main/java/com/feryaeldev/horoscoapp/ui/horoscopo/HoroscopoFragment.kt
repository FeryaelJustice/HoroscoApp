package com.feryaeldev.horoscoapp.ui.horoscopo

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.feryaeldev.horoscoapp.databinding.FragmentHoroscopoBinding
import com.feryaeldev.horoscoapp.ui.OnFragmentActionsListener

class HoroscopoFragment : Fragment() {

    private var _binding: FragmentHoroscopoBinding? = null
    private val binding get() = _binding!!
    private var listener: OnFragmentActionsListener? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentHoroscopoBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.buttonListener.setOnClickListener {
            listener?.onClickFragmentButton()
        }
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        if (context is OnFragmentActionsListener) {
            listener = context
        } else {
            throw RuntimeException("$context must implement OnFragmentActionsListener")
        }
    }

    override fun onDetach() {
        super.onDetach()
        listener = null
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
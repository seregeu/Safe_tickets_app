package com.example.safeticketsapp.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.NavController
import androidx.navigation.findNavController
import com.example.safeticketsapp.R

class SingUpFragment : Fragment() {
    private lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_sing_up, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setListeners(view)
    }

    private fun setListeners(view:View){
        navController = view.findNavController()

        val signInButton: Button = view.findViewById(R.id.sign_up_button)
        signInButton.setOnClickListener{
            // TODO: Вызвать метод для отправки данных на сервер, пока переход на экран
            navController.navigate(R.id.action_singUpFragment_to_signInFragment)
        }
    }
}
package com.example.safeticketsapp.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.navigation.NavController
import androidx.navigation.findNavController
import com.example.safeticketsapp.R

class SignInFragment : Fragment() {

    private lateinit var navController: NavController
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setListeners(view)
    }

    private fun setListeners(view:View){
        navController = view.findNavController()

        val signInButton: Button = view.findViewById(R.id.sign_in_button)
        signInButton.setOnClickListener{
        }
        val signupLabel: TextView = view.findViewById(R.id.signup_textwiew)
        signupLabel.setOnClickListener{
            navController.navigate(R.id.action_signInFragment_to_singUpFragment)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_sign_in, container, false)
    }

}
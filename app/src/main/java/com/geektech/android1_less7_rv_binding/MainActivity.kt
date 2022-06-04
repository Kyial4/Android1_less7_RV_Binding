package com.geektech.android1_less7_rv_binding

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.View
import androidx.fragment.app.Fragment
import com.geektech.android1_less7_rv_binding.databinding.ActivityMainBinding
import com.geektech.android1_less7_rv_binding.databinding.FragmentMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        addFragment(MainFragment())
    }


}
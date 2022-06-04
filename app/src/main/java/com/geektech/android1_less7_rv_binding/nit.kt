package com.geektech.android1_less7_rv_binding

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity

fun FragmentActivity.addFragment(fragment: Fragment){
    supportFragmentManager.beginTransaction().add(R.id.container, MainFragment()).commit()

}
package com.example.modulo.activities.main

import android.app.Activity
import android.content.Intent
import android.content.res.Configuration
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.widget.Toolbar
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.core.view.GravityCompat
import androidx.databinding.DataBindingUtil
import androidx.drawerlayout.widget.DrawerLayout
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.modulo.R
import com.example.modulo.activities.DetailActivity
import com.example.modulo.activities.SettingsActivity
import com.example.modulo.activities.TransportistasActivity
import com.example.modulo.adapters.ContainerListAdapter
import com.example.modulo.databinding.ActivityMainBinding
import com.example.modulo.databinding.FragmentContainersBinding
import com.example.modulo.fragments.BlankFragment
import com.example.modulo.fragments.BlankFragment.Companion.newInstance
import com.example.modulo.fragments.ContainersFragment
import com.example.modulo.fragments.SettingsFragment
import com.example.modulo.fragments.SettingsFragment.Companion.newInstance
import com.example.modulo.models.Container
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.navigation.NavigationView



class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bottnav = findViewById<BottomNavigationView>(R.id.bottom_navigation)
        bottnav.setOnNavigationItemSelectedListener  { menuItem ->
            when (menuItem.itemId) {
                R.id.page_1 -> {
                    val fragment = ContainersFragment.newInstance()
                    openFragment(fragment)
                    true
                }
                R.id.page_2 -> {
                    val fragment = BlankFragment.newInstance()
                    openFragment(fragment)
                    true
                }
                R.id.page_3 -> {
                    val fragment = SettingsFragment.newInstance()
                    openFragment(fragment)
                    true
                }
                else -> false
            }
        }




        bottnav.selectedItemId = R.id.page_1





    }

    private fun openFragment(fragment: Fragment) {
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.main_container, fragment)
        transaction.addToBackStack(null)
        transaction.commit()
    }
}
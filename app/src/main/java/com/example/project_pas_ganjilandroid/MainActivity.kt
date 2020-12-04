package com.example.project_pas_ganjilandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.FragmentTransaction
import com.example.project_pas_ganjilandroid.UI.FragmentHome
import com.example.project_pas_ganjilandroid.UI.FragmentProfile
import com.example.project_pas_ganjilandroid.UI.FragmentStore
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var Home_Fragment : FragmentHome
    lateinit var Store_Fragment: FragmentStore
    lateinit var profile_Fragment: FragmentProfile

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Home_Fragment = FragmentHome()
        supportFragmentManager.beginTransaction().replace(R.id.frame_layout, Home_Fragment)
            .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN).commit()

        bottom_nav.setOnNavigationItemSelectedListener { item ->
            when (item.itemId) {

                R.id.home -> {
                    Home_Fragment = FragmentHome()
                    supportFragmentManager.beginTransaction().replace(R.id.frame_layout, Home_Fragment)
                        .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN).commit()
                }

                R.id.store -> {
                    Store_Fragment = FragmentStore()
                    supportFragmentManager.beginTransaction().replace(R.id.frame_layout, Store_Fragment)
                        .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN).commit()
                }

                R.id.profile -> {
                    profile_Fragment = FragmentProfile()
                    supportFragmentManager.beginTransaction().replace(R.id.frame_layout, profile_Fragment)
                        .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN).commit()
                }

            }
            // harus mengembalikan nilai
            true

        }
    }
}

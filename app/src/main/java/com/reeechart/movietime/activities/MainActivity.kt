package com.reeechart.movietime.activities

import android.os.Bundle
import android.support.design.widget.BottomNavigationView
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentTransaction
import android.support.v7.app.AppCompatActivity
import com.reeechart.movietime.R
import com.reeechart.movietime.fragments.PlayingFragment
import com.reeechart.movietime.fragments.SearchFragment
import com.reeechart.movietime.fragments.UpcomingFragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private val mOnNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
        val transaction: FragmentTransaction = supportFragmentManager.beginTransaction()
        when (item.itemId) {
            R.id.navigation_playing -> {
                val playingFragment = PlayingFragment()

                transaction.replace(R.id.fragmentContainer, playingFragment)
                transaction.commit()

                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_upcoming -> {
                val upcomingFragment = UpcomingFragment()

                transaction.replace(R.id.fragmentContainer, upcomingFragment)
                transaction.commit()

                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_search -> {
                val searchFragment = SearchFragment()

                transaction.replace(R.id.fragmentContainer, searchFragment)
                transaction.commit()

                return@OnNavigationItemSelectedListener true
            }
        }
        false
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)
    }
}

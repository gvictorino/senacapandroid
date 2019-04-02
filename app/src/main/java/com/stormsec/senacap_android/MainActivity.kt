package com.stormsec.senacap_android

import android.support.design.widget.BottomNavigationView
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.app.AppCompatActivity
import android.view.MenuItem
import android.widget.FrameLayout
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), BottomNavigationView.OnNavigationItemSelectedListener {
    private var navigationView: BottomNavigationView? = null
    private var container : FrameLayout? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        navigationView = findViewById(R.id.bottomNavigation)
        container = mainContainer
        openFragment(HomeFragment())
        navigationView?.setOnNavigationItemSelectedListener(this)
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.action_home -> {
                supportActionBar?.title = "Home"
                val homeFragment = HomeFragment()
                openFragment(homeFragment)
            }
            R.id.action_titles -> {
                supportActionBar?.title = "Títulos"
                val titleFragment = TitleFragment()
                openFragment(titleFragment)
            }
            R.id.action_buy_titles -> {
                supportActionBar?.title = "Comprar Títulos"
                val buyFragment = BuyFragment()
                openFragment(buyFragment)
            }
            R.id.action_raspadinhas -> {
                supportActionBar?.title = "Raspadinhas"
                val raspadinhaFragment = RaspadinhaFragment()
                openFragment(raspadinhaFragment)
            }
            R.id.action_profile ->{
                val profileFragment = ProfileFragment()
                openFragment(profileFragment)
            }
        }
        return true
    }

    private fun openFragment(fragment: Fragment) {
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.mainContainer, fragment)
        transaction.addToBackStack(null)
        transaction.commit()
    }
}
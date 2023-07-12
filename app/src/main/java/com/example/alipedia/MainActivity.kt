package com.example.alipedia

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.core.view.GravityCompat
import androidx.fragment.app.Fragment
import com.example.alipedia.databinding.ActivityMainBinding
import com.example.alipedia.fragments.FragmentCars
import com.example.alipedia.fragments.FragmentExplore
import com.example.alipedia.fragments.FragmentProfile
import com.example.alipedia.fragments.FragmentTrends

class MainActivity : AppCompatActivity() {
    lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(binding.toolBarMain)

        val actionBarDrawerToggle = ActionBarDrawerToggle(
            this,
            binding.drawerLayoutMain,
            binding.toolBarMain,
            R.string.open_drawer,
            R.string.close_drawer
        )
        binding.drawerLayoutMain.addDrawerListener(actionBarDrawerToggle)
        actionBarDrawerToggle.syncState()

        binding.navigationViewMain.setNavigationItemSelectedListener {


            when (it.itemId){
                R.id.nav_menu_repairMan -> {
                    Toast.makeText(this, "you are a repair man now", Toast.LENGTH_SHORT).show()
                    binding.drawerLayoutMain.closeDrawer(GravityCompat.START)
                }
                R.id.nav_menu_carEnthusiast ->{
                    Toast.makeText(this, "you are a carEnthusiast now", Toast.LENGTH_SHORT).show()
                    binding.drawerLayoutMain.closeDrawer(GravityCompat.START)
                }
                //---------------------------
                R.id.menu_open_web -> {
                    Toast.makeText(this, "you are in web now", Toast.LENGTH_SHORT).show()
                    binding.drawerLayoutMain.closeDrawer(GravityCompat.START)
                }

            }

            true
        }

        binding.bottomNavigationMain.setOnItemSelectedListener {

            when (it.itemId){

                R.id.menu_cars -> {
                    replaceFragment(FragmentCars())
                }
                R.id.menu_explore -> {
                    replaceFragment(FragmentExplore())
                }
                R.id.menu_profile -> {
                    replaceFragment(FragmentProfile())
                }
                R.id.menu_trends -> {
                    replaceFragment(FragmentTrends())
                }

            }
            true
        }

        binding.bottomNavigationMain.setOnItemReselectedListener {  }
    }
    fun replaceFragment(fragment : Fragment){

        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.frame_main_continer , fragment)
        transaction.commit()

    }

    fun firstRun (){
        replaceFragment(FragmentExplore())
        binding.bottomNavigationMain.selectedItemId = R.id.menu_explore
    }
}
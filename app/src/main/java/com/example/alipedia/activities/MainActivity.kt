package com.example.alipedia.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.core.content.ContextCompat
import androidx.core.view.GravityCompat
import androidx.fragment.app.Fragment
import cn.pedant.SweetAlert.SweetAlertDialog
import com.example.alipedia.R
import com.example.alipedia.databinding.ActivityMainBinding
import com.example.alipedia.fragments.*
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

//        firstRun()

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


            when (it.itemId) {
                R.id.nav_menu_repairMan -> {
                    binding.drawerLayoutMain.closeDrawer(GravityCompat.START)

                    val dialog = SweetAlertDialog(this, SweetAlertDialog.SUCCESS_TYPE)
                    dialog.titleText = "alert"
                    dialog.confirmText = "confirm"
                    dialog.cancelText = "Cancel"
                    dialog.contentText = "wanna be a repair man?"
                    dialog.setConfirmClickListener {

                        Toast.makeText(this, "confirmed", Toast.LENGTH_SHORT).show()
                        dialog.dismiss()
                    }
                    dialog.setCancelClickListener {
                        dialog.dismiss()
                    }
                    dialog.show()
                }
                R.id.nav_menu_carEnthusiast -> {
                    Toast.makeText(this, "you are a carEnthusiast now", Toast.LENGTH_SHORT).show()
                    binding.drawerLayoutMain.closeDrawer(GravityCompat.START)

                    binding.navigationViewMain.setCheckedItem(R.id.nav_menu_carEnthusiast)

                    val transaction = supportFragmentManager.beginTransaction()
                    transaction.add(R.id.frame_main_continer, FragmentCarLover())
                    transaction.addToBackStack(null)
                    transaction.commit()

                }
                //---------------------------
                R.id.menu_open_web -> {

                    Snackbar
                        .make(binding.root , "No internet!", Snackbar.LENGTH_INDEFINITE)
                        .setAction("Retry"){
                            Toast.makeText(this, "cheking internet", Toast.LENGTH_SHORT).show()
                        }
                        .setTextColor(ContextCompat.getColor(this,android.R.color.holo_red_dark))
                        .setBackgroundTint(ContextCompat.getColor(this, R.color.blue))
                        .show()

                    binding.drawerLayoutMain.closeDrawer(GravityCompat.START)
                }

            }

            true
        }

        binding.bottomNavigationMain.setOnItemSelectedListener {

            when (it.itemId) {

                R.id.menu_cars -> {
//                    replaceFragment(FragmentCars())
                    val intent = Intent(this,MainActivity3::class.java)
                    startActivity(intent)
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

            binding.navigationViewMain.menu.getItem(1).isChecked = false

            true
        }

        binding.bottomNavigationMain.setOnItemReselectedListener { }
    }

    fun replaceFragment(fragment: Fragment) {

        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.frame_main_continer, fragment)
        transaction.commit()

    }

    fun firstRun() {
        replaceFragment(FragmentExplore())
        binding.bottomNavigationMain.selectedItemId = R.id.menu_explore
    }

    override fun onBackPressed() {
        super.onBackPressed()
        binding.navigationViewMain.menu.getItem(1).isChecked = false
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_main , menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.menu_exit ->{
                finish()
            }
        }
        return true
    }


}
//end of lessons
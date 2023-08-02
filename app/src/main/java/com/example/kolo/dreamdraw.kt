package com.example.kolo

import android.os.Bundle
import android.view.Menu
import com.google.android.material.snackbar.Snackbar
import com.google.android.material.navigation.NavigationView
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import androidx.drawerlayout.widget.DrawerLayout
import androidx.appcompat.app.AppCompatActivity
import com.example.kolo.databinding.ActivityDreamdrawBinding

class dreamdraw : AppCompatActivity() {

    private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var binding: ActivityDreamdrawBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityDreamdrawBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(binding.appBarDreamdraw.toolbar)

        val drawerLayout: DrawerLayout = binding.drawerLayout
        val navView: NavigationView = binding.navView
        val navController = findNavController(R.id.nav_host_fragment_content_dreamdraw)
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        appBarConfiguration = AppBarConfiguration(
            setOf(
                R.id.nav_home,R.id.nav_dna,R.id.nav_educ,R.id.nav_das,R.id.nav_anthems,R.id.nav_ceo,R.id.nav_direct,R.id.nav_orgstru,
            R.id.nav_schcir,R.id.nav_acaact,R.id.nav_coact,R.id.nav_reli,R.id.nav_clubs,R.id.nav_ple,R.id.nav_online,R.id.nav_schools,
                R.id.nav_board,R.id.nav_primary,R.id.nav_health,R.id.nav_admin,R.id.nav_news,R.id.nav_down,R.id.nav_careerss,
            ), drawerLayout
        )
        setupActionBarWithNavController(navController, appBarConfiguration)
        navView.setupWithNavController(navController)
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.dreamdraw, menu)
        return true
    }

    override fun onSupportNavigateUp(): Boolean {
        val navController = findNavController(R.id.nav_host_fragment_content_dreamdraw)
        return navController.navigateUp(appBarConfiguration) || super.onSupportNavigateUp()
    }
}
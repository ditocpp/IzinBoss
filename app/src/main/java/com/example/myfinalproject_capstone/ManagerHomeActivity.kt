package com.example.myfinalproject_capstone

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import com.example.myfinalproject_capstone.databinding.ActivityManagerHomeBinding

class ManagerHomeActivity : AppCompatActivity() {

    private var binding: ActivityManagerHomeBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityManagerHomeBinding.inflate(layoutInflater)
        setContentView(binding!!.root)


        binding!!.fabAdd.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        binding = null
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        val inflater = menuInflater
        inflater.inflate(R.menu.topbar_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val intent = Intent(this@ManagerHomeActivity, AccountActivity::class.java)
        startActivity(intent)
        return super.onOptionsItemSelected(item)
    }
}
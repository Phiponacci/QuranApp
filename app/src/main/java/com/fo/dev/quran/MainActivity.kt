package com.fo.dev.quran

import android.os.Bundle
import android.view.MenuItem
import android.widget.SeekBar
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager2.widget.ViewPager2
import com.fo.dev.quran.databinding.ActivityMainBinding
import com.fo.dev.quran.ui.GoToDialog
import com.fo.dev.quran.ui.adapters.ViewPagerAdapter


class MainActivity : AppCompatActivity() {
    private var _binding: ActivityMainBinding? = null
    val binding get() = _binding!!
    lateinit var dialog: GoToDialog


    companion object {
        const val IMG_COUNT = 9
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setupPagerWithSeekBar()
        setupBottomNavigation()
        setupGotoDialog()
    }


    private fun setupGotoDialog() {
        dialog = GoToDialog(this)
        dialog.setOnGotoClicked { hizb, thomn ->
            val pageNumber = (hizb - 1) * 8 + thomn
            binding.viewpager.currentItem = pageNumber - 1
            dialog.hide()
        }
    }

    private fun setupBottomNavigation() {
        binding.bottomNavigation.setOnItemSelectedListener {
            when (it.itemId) {
                R.id.index -> index()
                R.id.goto_page -> goto()
                R.id.memorize -> memorize()
                R.id.about -> about()
            }
            true
        }
    }

    private fun loadImages(): MutableList<Int> {
        val list = mutableListOf<Int>()
        for (i in 1..IMG_COUNT) {
            val id = resources.getIdentifier("warsh$i", "drawable", packageName)
            list.add(id)
        }
        return list
    }

    private fun setupPagerWithSeekBar() {
        val images = loadImages()

        val adapter = ViewPagerAdapter(images)
        binding.viewpager.adapter = adapter
        binding.viewpager.registerOnPageChangeCallback(object : ViewPager2.OnPageChangeCallback() {
            override fun onPageSelected(index: Int) {
                binding.seekBar.progress = index
            }
        })
        binding.seekBar.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
                binding.viewpager.currentItem = progress
            }

            override fun onStartTrackingTouch(seekBar: SeekBar?) {}

            override fun onStopTrackingTouch(seekBar: SeekBar?) {}
        })
    }

    private fun index() {

    }

    private fun goto() {
        dialog.show()
    }


    private fun memorize() {
        /*var badge = binding.bottomNavigation.getOrCreateBadge(item.itemId)
        badge.isVisible = true*/
    }


    fun about() {

    }


}
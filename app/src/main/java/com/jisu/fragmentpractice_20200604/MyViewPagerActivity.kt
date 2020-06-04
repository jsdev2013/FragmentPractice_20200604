package com.jisu.fragmentpractice_20200604

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.jisu.fragmentpractice_20200604.adapter.MyPagerAdapter
import kotlinx.android.synthetic.main.activity_my_view_pager.*

class MyViewPagerActivity : BaseActivity() {

    lateinit var myPagerAdapter: MyPagerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_my_view_pager)
        setupEvents()
        setValues()
    }

    override fun setupEvents() {

    }

    override fun setValues() {
        myPagerAdapter = MyPagerAdapter(supportFragmentManager)
        myViewPager.adapter = myPagerAdapter
    }
}

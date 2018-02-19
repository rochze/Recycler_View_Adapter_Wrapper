/**************************************************************************************************
 *                                                                                                *
 *                         Created by Dwi Ariyanto (creatures99@gmail.com)                        *
 *                             Copyright © 2018. All rights reserved.                             *
 *                                                                                                *
 *                                                                                                *
 * Create On:                                                                                     *
 * Sunday, February 18, 2018 at 21:26                                                             *
 *                                                                                                *
 **************************************************************************************************/

package com.dwiariyanto.recyclerview.example.feature.home

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.dwiariyanto.recyclerview.example.R
import com.dwiariyanto.recyclerview.example.feature.multiitem.MultiItemActivity
import com.dwiariyanto.recyclerview.example.feature.singleitem.SingleItemActivity
import com.dwiariyanto.recyclerview.example.utils.Navigator
import dagger.android.AndroidInjection
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject

class HomeActivity : AppCompatActivity() {
	@Inject lateinit var navigator: Navigator
	
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		AndroidInjection.inject(this)
		setContentView(R.layout.activity_main)
		setupButton()
	}
	
	private fun setupButton() {
		btnSingleItem.setOnClickListener { navigator.goto(SingleItemActivity::class.java) }
		btnMultiItem.setOnClickListener { navigator.goto(MultiItemActivity::class.java) }
	}
}
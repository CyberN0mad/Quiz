package com.example.quiz.ui

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.quiz.ui.fragments_viewpager.DashboardFragment
import com.example.quiz.ui.fragments_viewpager.HistoryFragment
import com.example.quiz.ui.fragments_viewpager.SettingsFragment

class ViewPagerAdapter(container: FragmentActivity) : FragmentStateAdapter(container) {
    companion object {
        private const val PAGE_COUNT = 3
    }
    override fun getItemCount() = PAGE_COUNT

    override fun createFragment(position: Int): Fragment {
        return  when (position){
            0 -> DashboardFragment()
            1 -> HistoryFragment()
            2 -> SettingsFragment()
            else -> DashboardFragment()
        }
    }

}
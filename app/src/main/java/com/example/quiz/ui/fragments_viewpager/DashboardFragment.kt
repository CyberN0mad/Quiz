package com.example.quiz.ui.fragments_viewpager


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.SeekBar
import androidx.fragment.app.Fragment
import com.example.myquizapp.R
import kotlinx.android.synthetic.main.fragment_dashboard.*

@Suppress("UNREACHABLE_CODE")
class DashboardFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_dashboard, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        changeSeekBar()
        getQuestions()
    }

    private fun getQuestions() {
        start_button.setOnClickListener {
            val amountCount: CharSequence? = questions_amount_count.text
            val category: String = category_spinner.selectedItem.toString()
            val difficulty: String = difficulty_spinner.selectedItem.toString()
        }
    }

    private fun changeSeekBar() {
        questions_amount_seek_bar.setOnSeekBarChangeListener(object :
            SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
                questions_amount_count.text = "$progress"
            }
            override fun onStartTrackingTouch(seekBar: SeekBar?) {
            }
            override fun onStopTrackingTouch(seekBar: SeekBar?) {
            }

        })
    }

}
package ru.spb.speech

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_recommendation.*

class RecommendationActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recommendation)

        val bundle = intent.extras
        val message = bundle!!.getString("recommendation")
        slidesTimeRecommendation.text = message

        val frequencyRecommendation = bundle.getString(getString(R.string.frequency_recommendation_key))
        if(frequencyRecommendation == getString(R.string.no_frequency_recommendation)){
            wordFrequencyLabel.visibility = View.GONE
            wordFrequencyRecommendation.visibility = View.GONE
        } else {
            wordFrequencyRecommendation.text = frequencyRecommendation
        }

        val parasitesRecommendation = bundle.getString(getString(R.string.parasites_recommendation_key))
        if (parasitesRecommendation == "") {
            scumWordsLabel.visibility = View.GONE
            scumWordsRecommendation.visibility = View.GONE
        } else {
            scumWordsRecommendation.text = parasitesRecommendation
        }

        val presTimeRecommendation = bundle.getString(getString(R.string.training_time_recommendation_key))
        if (presTimeRecommendation == "") {
            trainingTimeLabel.visibility = View.GONE
            trainingTimeRecommendation.visibility = View.GONE
        } else {
            trainingTimeRecommendation.text = presTimeRecommendation
        }

        backToStatistics.setOnClickListener {
            finish()
        }

        toHomeScreen.setOnClickListener {
            val intent = Intent(this, StartPageActivity::class.java)
            startActivity(intent)
        }
    }
}

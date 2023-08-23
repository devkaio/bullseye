package dev.kaio.bullseye

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import dev.kaio.bullseye.databinding.ActivityAboutBinding

class AboutActivity : AppCompatActivity() {
    private lateinit var binding: ActivityAboutBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAboutBinding.inflate(layoutInflater)
        setContentView(binding.root)

        title = getString(R.string.about_page_title)

        binding.backButton?.setOnClickListener {
            finish()
        }
    }
}
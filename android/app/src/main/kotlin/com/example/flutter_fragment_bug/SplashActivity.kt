package com.example.flutter_fragment_bug

import android.app.Activity
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import io.flutter.embedding.android.FlutterFragmentActivity
import kotlin.random.Random

/**
 * @author renbin
 * @date 2025/7/9
 * 简介:
 */
class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<Button>(R.id.bt).setOnClickListener {
            View.generateViewId()
            repeat(Random.nextInt(200), {
                View.generateViewId()
            })


            val intent = FlutterFragmentActivity.NewEngineInGroupIntentBuilder(
                MainActivity::class.java,
                "my_cached_engine_group_id"
            )
                .build(this@SplashActivity)
            startActivity(intent)

        }

    }
}
package com.example.flutter_fragment_bug

import android.os.Bundle
import android.widget.Toast
import io.flutter.embedding.android.FlutterFragmentActivity

class MainActivity : FlutterFragmentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Toast.makeText(this, "fragmentId = $FRAGMENT_CONTAINER_ID", Toast.LENGTH_SHORT).show()
    }
}

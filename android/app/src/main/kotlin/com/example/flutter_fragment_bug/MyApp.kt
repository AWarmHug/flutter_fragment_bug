package com.example.flutter_fragment_bug

import android.app.Application
import io.flutter.embedding.engine.FlutterEngineGroup
import io.flutter.embedding.engine.FlutterEngineGroupCache

/**
 * @author renbin
 * @date 2025/7/9
 * 简介:
 */
class MyApp: Application() {
    override fun onCreate() {
        super.onCreate()
       val mFlutterEngineGroup = FlutterEngineGroup(this)
        FlutterEngineGroupCache.getInstance().put("my_cached_engine_group_id", mFlutterEngineGroup)
    }
}
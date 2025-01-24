package com.example.differencegame

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // レイアウト内のボタンを取得
        val startButton = findViewById<Button>(R.id.buttonStart)

        // ボタンを押したときの処理
        startButton.setOnClickListener {
            // 別画面 (GameActivity) に遷移する
            val intent = Intent(this, GameActivity::class.java)
            startActivity(intent)
        }
    }
}

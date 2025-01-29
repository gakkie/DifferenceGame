package com.example.differencegame

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout

class GameActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game)

        // もしルートレイアウト自体を操作したいなら、こんな感じで取得
        val container = findViewById<ConstraintLayout>(R.id.gameContainer)

        // 画像Viewを取得したい場合
        val imageLeft = findViewById<android.widget.ImageView>(R.id.imageLeft)
        val imageRight = findViewById<android.widget.ImageView>(R.id.imageRight)
    }
}
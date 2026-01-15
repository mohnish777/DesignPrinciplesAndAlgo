package com.example.designPrinciplesAndAlgo.smartherd

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class GameViewModel:ViewModel(){
    var score = MutableLiveData<Int>()

    fun incrementScore(){
//        score++
    }
}

// watch this for example
// https://youtu.be/_yiYMn4YIzg?list=PLlxmoA0rQ-LwgK1JsnMsakYNACYGa1cjR&t=857



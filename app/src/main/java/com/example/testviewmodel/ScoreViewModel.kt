package com.example.testviewmodel

import androidx.lifecycle.ViewModel


class ScoreViewModel : ViewModel() {
    // Tracks the score for Team A
    var scoreTeamA = 0

    // Tracks the score for Team B
    var scoreTeamB = 0
}
package com.example.googlefitt

data class FitnessDataResponseModel(
    var steps: Int? = 0,
    var calories: Float? = 0f,
    var distance: Float? = 0f,
    var heartRate: Int? = 0,
    var height: Float? = 0f,
    var weight: Float? = 0f
)
package com.vk.directop.hilteasyexample

import android.util.Log
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject
import javax.inject.Named

@HiltViewModel
class TestViewModel @Inject constructor(
    @Named("String1") testString2: String
) : ViewModel() {

    init {
        Log.d("ViewModel", "Test String from ViewModel: $testString2")
    }
}
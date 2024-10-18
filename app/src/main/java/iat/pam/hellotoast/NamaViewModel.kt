package iat.pam.hellotoast

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class NamaViewModel : ViewModel() {

    val currentName: MutableLiveData<Int> by lazy {
        MutableLiveData<Int>()
    }
}
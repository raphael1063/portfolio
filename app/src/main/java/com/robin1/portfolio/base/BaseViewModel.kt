package com.robin1.portfolio.base

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.robin1.portfolio.Event
import io.reactivex.disposables.CompositeDisposable

abstract class BaseViewModel : ViewModel() {

    private val _isLoadingData = MutableLiveData<Boolean>()
    val isLoadingData: LiveData<Boolean>
        get() = _isLoadingData

    private val _toastStringEvent = MutableLiveData<Event<String>>()
    val toastStringEvent: LiveData<Event<String>>
        get() = _toastStringEvent

    private val _toastResEvent = MutableLiveData<Event<Int>>()
    val toastResEvent: LiveData<Event<Int>>
        get() = _toastResEvent

    private val _snackBarStringEvent = MutableLiveData<Event<String>>()
    val snackBarStringEvent: LiveData<Event<String>>
        get() = _snackBarStringEvent

    private val _snackBarResEvent = MutableLiveData<Event<Int>>()
    val snackBarResEvent: LiveData<Event<Int>>
        get() = _snackBarResEvent

    protected val compositeDisposable = CompositeDisposable()

    fun onToast(stringResId: Int) {
        _toastResEvent.value = Event(stringResId)
    }

    fun onToast(message: String) {
        _toastStringEvent.value = Event(message)
    }

    fun onSnackBar(stringResId: Int) {
        _snackBarResEvent.value = Event(stringResId)
    }

    fun onSnackBar(message: String) {
        _snackBarStringEvent.value = Event(message)
    }
}
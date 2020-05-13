package com.hackday.imageSearch.repository

import androidx.lifecycle.ViewModel
import io.reactivex.disposables.CompositeDisposable


class PhotoInfoViewModel (
    photoRepository: PhotoRepositoryImpl
) : ViewModel() {

    private val disposable: CompositeDisposable = CompositeDisposable()

}
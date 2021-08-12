package com.stslex93.notes.utilites

import android.content.Context
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import dagger.Lazy
import javax.inject.Inject

open class BaseFragment : Fragment() {

    @Inject
    open lateinit var viewModelFactory: Lazy<ViewModelProvider.Factory>

    override fun onAttach(context: Context) {
        super.onAttach(context)
        requireContext().applicationContext.appComponent.inject(this)
    }
}
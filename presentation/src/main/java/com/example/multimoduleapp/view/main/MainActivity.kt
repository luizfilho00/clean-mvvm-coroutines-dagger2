package com.example.multimoduleapp.view.main

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import com.example.multimoduleapp.R
import com.example.multimoduleapp.databinding.ActivityMainBinding
import dagger.android.AndroidInjection
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasAndroidInjector
import javax.inject.Inject

class MainActivity : AppCompatActivity(), HasAndroidInjector {

    @Inject
    lateinit var androidInjector: DispatchingAndroidInjector<Any>

    @Inject
    lateinit var viewModel: MainViewModel

    private lateinit var binding: ActivityMainBinding

    override fun androidInjector(): AndroidInjector<Any> = androidInjector

    override fun onCreate(savedInstanceState: Bundle?) {
        AndroidInjection.inject(this)
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,
            R.layout.activity_main
        )
        binding.run {
            lifecycleOwner = this@MainActivity
            vModel = viewModel
        }
        lifecycle.addObserver(viewModel)
        viewModel.todoLiveData.observe(this, Observer {
            Toast.makeText(this, it?.title, Toast.LENGTH_LONG).show()
        })
    }
}

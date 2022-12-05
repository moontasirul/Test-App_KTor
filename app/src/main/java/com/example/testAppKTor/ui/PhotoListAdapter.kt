package com.example.testAppKTor.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.testAppKTor.R

class PhotoListAdapter : RecyclerView.Adapter<PhotoListAdapter.PhotoViewHolder>() {


    class PhotoViewHolder(rootView: View) : RecyclerView.ViewHolder(rootView) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PhotoViewHolder {
        val binding =
            LayoutInflater.from(parent.context).inflate(R.layout.layout_photo_item, parent)
        return PhotoViewHolder(binding.rootView)
    }

    override fun onBindViewHolder(holder: PhotoViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }
}
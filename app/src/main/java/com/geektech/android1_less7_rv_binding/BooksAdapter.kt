package com.geektech.android1_less7_rv_binding

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.annotation.NonNull
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.geektech.android1_less7_rv_binding.databinding.ItemBooksBinding

class BooksAdapter( private val data :ArrayList<Books>) : RecyclerView.Adapter<BooksAdapter.booksViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): booksViewHolder {
        return booksViewHolder(
           ItemBooksBinding.inflate(LayoutInflater.from(parent.context), parent,false)
        )

    }

    override fun onBindViewHolder(holder: booksViewHolder, position: Int) {
        holder.bind(data.get(position))
    }

    override fun getItemCount(): Int = data.size

    inner class booksViewHolder(private val binding: ItemBooksBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(book: Books) {
            binding.tv1?.text=book.name
            book.color?.let { binding.parent?.setBackgroundColor(itemView.context.getColor(it)) }
            Glide.with(binding.image1).load(book.image).into(binding.image1);
        }

    }

}

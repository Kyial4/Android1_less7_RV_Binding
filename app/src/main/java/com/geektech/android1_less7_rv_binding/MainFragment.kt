package com.geektech.android1_less7_rv_binding

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import com.geektech.android1_less7_rv_binding.databinding.ActivityMainBinding
import com.geektech.android1_less7_rv_binding.databinding.FragmentMainBinding

class MainFragment : Fragment() {
    private lateinit var binding: FragmentMainBinding
    private val data = arrayListOf<Books>()


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding= FragmentMainBinding.inflate(LayoutInflater.from(requireContext()), container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        loadData()
        RV()

    }
    private fun RV(){
        var adapter = BooksAdapter(data = data)
        binding.recyclerView.adapter = adapter
        binding.recyclerView.layoutManager=GridLayoutManager(requireContext(),2)
    }

    private fun loadData() {
        data.add(
            Books(
                R.color.black, "Тонкое искусство пофигизма",
                "https://alpinabook.ru/upload/iblock/b17/b175202126b4660c05fa869c3996e853.png"
            )
        )
        data.add(
            Books(
                R.color.white, "К Дзену на шпильках",
                "https://image-cdn.kazanexpress.ru/c4l1tg0854rpsqrnu170/original.jpg"
            )
        )
        data.add(
            Books(
                R.color.white, "Финансист",
                "https://static.mk.ru/upload/entities/2019/04/15/17/articles/facebookPicture/df/d9/3e/bf/c0d76c1afcadfe84a62411a1fcf13bc0.jpg"
            )
        )
        data.add(
            Books(
                R.color.white, "Три товарища",
                "https://cdn2.static1-sima-land.com/items/1522194/0/700-nw.jpg"
            )
        )

    }

}


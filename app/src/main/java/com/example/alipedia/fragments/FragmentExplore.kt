package com.example.alipedia.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.alipedia.adapter.ExploreAdapter
import com.example.alipedia.data.ItemPost
import com.example.alipedia.databinding.FragmentExploreBinding


class FragmentExplore : Fragment() {
    lateinit var binding: FragmentExploreBinding
//    private val ferrariDetail = getString(R.string.ferrari_full_text)


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentExploreBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val data = arrayListOf<ItemPost>(
//ferrari
            ItemPost(
                "https://www.topgear.com/sites/default/files/cars-car/image/2020/07/dsc09285.jpg",
                "Ferrari",
                "Italian luxury sports car manufacturer",
                "Ferrari S.p.A. is an Italian luxury sports car manufacturer based in Maranello, Italy. Founded in 1939 by Enzo Ferrari (1898–1988), the company adopted its current name in 1945 and began producing its line of cars in 1947. Ferrari became a public company in 1960, and from 1969 to 2014 it was a subsidiary of Fiat S.p.A. It was spun off from Fiat",
                false,
                ""
            ),
            ItemPost(
                "https://www.autocar.co.uk/sites/autocar.co.uk/files/styles/gallery_slide/public/1-mercedes-benz-s-class-2022-road-test-review-tracking-front.jpg?itok=G-x3Q9Hv",
                "Mercedes-Benz",
                "German luxury and commercial vehicle automotive",
                "Mercedes-Benz commonly referred to as Mercedes and sometimes as Benz, is a German luxury and commercial vehicle automotive brand established in 1926. Mercedes-Benz AG (a Mercedes-Benz Group subsidiary established in 2019) is headquartered in Stuttgart, Baden-Württemberg, Germany. Mercedes-Benz AG produces consumer luxury vehicles and commercial vehicles badged as Mercedes-Benz. From November 2019 onwards, Mercedes-Benz-badged heavy commercial vehicles (trucks and buses) are managed by Daimler Truck, a former part of the Mercedes-Benz Group turned into an independent company in late 2021. In 2018, Mercedes-Benz was the largest brand of premium vehicles in the world, having sold 2.31 million passenger car ." +
                        "\n" +
                        "The brand's origins lie in Daimler-Motoren-Gesellschaft's 1901 Mercedes and Carl Benz's 1886 Benz Patent-Motorwagen, which is widely regarded as the first internal combustion engine in a self-propelled automobile. The slogan for the brand is the best or nothing.",
                false,
                ""
            ),
            ItemPost(
                "https://media.evo.co.uk/image/private/s--peFndBVA--/v1606409127/evo/2020/11/BMW%20i8%20review%2C%20history%2C%20prices%20and%20specs-11.jpg",
                "BMW",
                "German multinational manufacturer of luxury vehicles",
                "Bayerische Motoren Werke AG, abbreviated as BMW  is a German multinational manufacturer of luxury vehicles and motorcycles headquartered in Munich, Bavaria, Germany. The company was founded in 1916 as a manufacturer of aircraft engines, which it produced from 1917 to 1918 and again from 1933 to 1945.\n" +
                        "Automobiles are marketed under the brands BMW, Mini and Rolls-Royce, and motorcycles are marketed under the brand BMW Motorrad. In 2017, BMW was the world's fourteenth-largest producer of motor vehicles, with 2,279,503 vehicles produced. The company has significant motor-sport history, especially in touring cars, sports cars, and the Isle of Man TT.\n" +
                        "BMW is headquartered in Munich and produces motor vehicles in Germany, Brazil, China, India, Mexico, the Netherlands, South Africa, the United Kingdom, and the United States. The Quandt family is a long-term shareholder of the company, following investments by the brothers Herbert and Harald Quandt in 1959 that saved BMW from bankruptcy, with the remaining shares owned by the public.\n" ,
                false,
                ""
            )
        )

        val myAdapter = ExploreAdapter(data)

        binding.recycleExplore.layoutManager =
            LinearLayoutManager(context, RecyclerView.VERTICAL, false)
        binding.recycleExplore.adapter = myAdapter

    }

}
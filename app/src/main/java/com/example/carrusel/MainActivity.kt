package com.example.carrusel

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import org.imaginativeworld.whynotimagecarousel.ImageCarousel
import org.imaginativeworld.whynotimagecarousel.listener.CarouselListener
import org.imaginativeworld.whynotimagecarousel.model.CarouselItem
//import org.imaginativeworld.whynotimagecarousel.OnItemClickListener

class MainActivity : AppCompatActivity() {


    private val list = mutableListOf<CarouselItem>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val carousel: ImageCarousel = findViewById(R.id.carousel)

        list.add(CarouselItem("https://st4.depositphotos.com/5857850/24567/v/600/depositphotos_245672022-stock-illustration-synthwave-retro-futuristic-landscape-with.jpg","1"))
        list.add(CarouselItem("https://www.crushpixel.com/big-static14/preview4/retro-styled-futuristic-landscape-with-1654535.jpg","2"))
        list.add(CarouselItem("https://image.freepik.com/vector-gratis/fondo-paisaje-futurista-estilo-retro_52683-17906.jpg","3"))
        list.add(CarouselItem("https://image.freepik.com/vector-gratis/fondo-paisaje-futurista-estilo-retro_23-2148254281.jpg","4"))
        list.add(CarouselItem("https://image.freepik.com/vector-gratis/fondo-paisaje-retro-futurista-sol_52683-19326.jpg","5"))

        carousel.addData(list)

        carousel.carouselListener = object : CarouselListener {
            override fun onClick(position: Int, carouselItem: CarouselItem) {
                Toast.makeText(this@MainActivity, "Imagen: ${carouselItem.caption}", Toast.LENGTH_SHORT).show()
            }
        }

    }
}
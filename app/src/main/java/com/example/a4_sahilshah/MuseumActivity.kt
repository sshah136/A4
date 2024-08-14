package com.example.a4_sahilshah

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.a4_sahilshah.data.Place

class MuseumActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_museum)
        val recyclerView: RecyclerView = findViewById(R.id.rvMuseums)
        val data = ArrayList<Place>()

        data.add(Place(R.drawable.art_gallery_of_ontario,"Art Gallery of Ontario", 43.65413296988621, -79.39234099090412))
        data.add(Place(R.drawable.royal_bc_museum,"Royal BC Museum", 48.41988227503438, -123.36747116114915))
        data.add(Place(R.drawable.museum_of_anthropology,"Museum of Anthropology", 49.26965548402951, -123.25943017458133))
        data.add(Place(R.drawable.royal_ontario_musuem,"Royal Ontario Museum", 43.66790369008807, -79.39476637429374))
        data.add(Place(R.drawable.royal_tyrrell_museum,"Royal Tyrrell Museum", 51.47924308131294, -112.79012504558756))


        recyclerView.layoutManager = LinearLayoutManager(this)
        val adapter = LandmarkAdapter(data)
        recyclerView.adapter = adapter
    }
}
package com.example.a4_sahilshah

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.a4_sahilshah.data.Place
import com.google.android.gms.maps.model.LatLng

class AttractionsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_attractions)

        val recyclerView: RecyclerView = findViewById(R.id.rvAttractions)
        val data = ArrayList<Place>()

        data.add(Place(R.drawable.cntower,"CN Tower", 43.64259919527905, -79.3870460713938))
        data.add(Place(R.drawable.toronto_zoo,"Toronto Zoo", 43.81801375620268, -79.1854373037835))
        data.add(Place(R.drawable.sciencecenter,"Ontario Science Center", 43.717048168128024, -79.3389322604791))
        data.add(Place(R.drawable.wonderland,"Canada's Wonderland", 43.842671396472085, -79.54121550378191))


        recyclerView.layoutManager = LinearLayoutManager(this)
        val adapter = LandmarkAdapter(data)
        recyclerView.adapter = adapter


    }
}
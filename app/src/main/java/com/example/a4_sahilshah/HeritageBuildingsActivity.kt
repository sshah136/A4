package com.example.a4_sahilshah

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.a4_sahilshah.data.Place

class HeritageBuildingsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_heritage_buildings)

        val recyclerView: RecyclerView = findViewById(R.id.rvBuilding)
        val data = ArrayList<Place>()

        data.add(Place(R.drawable.distillery_district,"Distillery District", 43.65053425811047, -79.3587328487502))
        data.add(Place(R.drawable.notre_dame,"Notre-Dame Basilica", 45.50463064168045, -73.55609894535881))
        data.add(Place(R.drawable.parliament_hill,"Parliament Hill", 45.42400029708677, -75.70092900367916))
        data.add(Place(R.drawable.st_lawrence,"St. Lawrence Market", 43.649200242161605, -79.37152394612191))
        data.add(Place(R.drawable.chateau_frontenac,"Le Château Frontenac", 46.81214798327668, -71.20516475940546))


        recyclerView.layoutManager = LinearLayoutManager(this)
        val adapter = LandmarkAdapter(data)
        recyclerView.adapter = adapter
    }
}
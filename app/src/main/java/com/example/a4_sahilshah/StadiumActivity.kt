package com.example.a4_sahilshah

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.a4_sahilshah.data.Place

class StadiumActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_stadium)
        val recyclerView: RecyclerView = findViewById(R.id.rvStadiums)
        val data = ArrayList<Place>()

        data.add(Place(R.drawable.bc_place,"BC Place", 49.27910179501483, -123.113028967207))
        data.add(Place(R.drawable.olympic_stadium,"Olympic Stadium", 45.56026785072073, -73.55223444444798))
        data.add(Place(R.drawable.rogers_centre,"Rogers Centre", 43.643854215323046, -79.38857545751733))
        data.add(Place(R.drawable.bmo_field,"BMO Field", 43.635779262771486, -79.41792955341197))
        data.add(Place(R.drawable.scotiabank_arena,"Scotiabank Arena", 43.64595049850098, -79.37961388306847))


        recyclerView.layoutManager = LinearLayoutManager(this)
        val adapter = LandmarkAdapter(data)
        recyclerView.adapter = adapter
    }
}
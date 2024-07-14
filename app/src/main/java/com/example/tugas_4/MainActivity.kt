package com.example.tugas_4

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.tugas_4.Interface.RetrofitClient
import com.example.tugas_4.Interface.SuperheroApi
import com.example.tugas_4.Model.SuperheroResponse
import com.squareup.picasso.Picasso
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {
    private lateinit var textViewName: TextView
    private lateinit var imageView: ImageView
    private lateinit var textViewPowerstats: TextView
    private lateinit var textViewBiography: TextView
    private lateinit var textViewAppearance: TextView
    private lateinit var textViewWork: TextView
    private lateinit var textViewConnections: TextView
    private lateinit var superheroApi: SuperheroApi

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textViewName = findViewById(R.id.textViewName)
        imageView = findViewById(R.id.imageView)
        textViewPowerstats = findViewById(R.id.textViewPowerstats)
        textViewBiography = findViewById(R.id.textViewBiography)
        textViewAppearance = findViewById(R.id.textViewAppearance)
        textViewWork = findViewById(R.id.textViewWork)
        textViewConnections = findViewById(R.id.textViewConnections)

        val retrofit = RetrofitClient.getClient()
        superheroApi = retrofit.create(SuperheroApi::class.java)

        getSuperheroData("hellboy")
    }

    private fun getSuperheroData(name: String) {
        val call = superheroApi.searchSuperhero("d44200f0979ac7fa21a9c1d941a39493", name)
        call.enqueue(object : Callback<SuperheroResponse> {
            override fun onResponse(call: Call<SuperheroResponse>, response: Response<SuperheroResponse>) {
                if (response.isSuccessful && response.body() != null) {
                    val superheroResponse = response.body()
                    if (superheroResponse?.results != null && superheroResponse.results.isNotEmpty()) {
                        val superhero = superheroResponse.results[0]
                        textViewName.text = superhero.name
                        Picasso.get().load(superhero.image.url).into(imageView)

                        textViewPowerstats.text = formatPowerstats(superhero.powerstats)
                        textViewBiography.text = formatBiography(superhero.biography)
                        textViewAppearance.text = formatAppearance(superhero.appearance)
                        textViewWork.text = formatWork(superhero.work)
                        textViewConnections.text = formatConnections(superhero.connections)
                    } else {
                        textViewName.text = "No results found"
                    }
                } else {
                    textViewName.text = "Response unsuccessful"
                }
            }

            override fun onFailure(call: Call<SuperheroResponse>, t: Throwable) {
                textViewName.text = "Error: ${t.message}"
            }
        })
    }

    private fun formatPowerstats(powerstats: SuperheroResponse.Superhero.Powerstats): String {
        return "Powerstats:\n" +
                "Intelligence: ${powerstats.intelligence}\n" +
                "Strength: ${powerstats.strength}\n" +
                "Speed: ${powerstats.speed}\n" +
                "Durability: ${powerstats.durability}\n" +
                "Power: ${powerstats.power}\n" +
                "Combat: ${powerstats.combat}"
    }

    private fun formatBiography(biography: SuperheroResponse.Superhero.Biography): String {
        return "Biography:\n" +
                "Full Name: ${biography.fullName}\n" +
                "Alter Egos: ${biography.alterEgos}\n" +
                "Aliases: ${biography.aliases.joinToString(", ")}\n" +
                "Place of Birth: ${biography.placeOfBirth}\n" +
                "First Appearance: ${biography.firstAppearance}\n" +
                "Publisher: ${biography.publisher}\n" +
                "Alignment: ${biography.alignment}"
    }

    private fun formatAppearance(appearance: SuperheroResponse.Superhero.Appearance): String {
        return "Appearance:\n" +
                "Gender: ${appearance.gender}\n" +
                "Race: ${appearance.race}\n" +
                "Height: ${appearance.height.joinToString(", ")}\n" +
                "Weight: ${appearance.weight.joinToString(", ")}\n" +
                "Eye Color: ${appearance.eyeColor}\n" +
                "Hair Color: ${appearance.hairColor}"
    }

    private fun formatWork(work: SuperheroResponse.Superhero.Work): String {
        return "Work:\n" +
                "Occupation: ${work.occupation}\n" +
                "Base: ${work.base}"
    }

    private fun formatConnections(connections: SuperheroResponse.Superhero.Connections): String {
        return "Connections:\n" +
                "Group Affiliation: ${connections.groupAffiliation}\n" +
                "Relatives: ${connections.relatives}"
    }
}





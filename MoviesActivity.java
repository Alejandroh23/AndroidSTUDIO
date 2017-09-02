package mx.edu.cetys.alejandroh.pojos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;

public class MoviesActivity extends AppCompatActivity {
MovieAdapter oMovieAdapter;
    listView oListView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movies);

        oListView=(listView) findViewById(R.id.lv_movie);
        oMovieAdapter=new MovieAdapter(this);
        oListView.setAdapter(oMovieAdapter);

        this.getIntent().getParcelableArrayExtra("MiLlave");

        oMovie.getMovie_name();
        ArrayList<Movies> miArreglillo = new ArrayList<Movies>();

        MoviesArray.add(new Movies("Annabelle", 120, "Richard Nixon", "Terror", 2017));
        MoviesArray.add(new Movies("Fast & Furious", 90, "Toreto", "Action", 2016));
        MoviesArray.add(new Movies("Dead Silence", 80, "James Wan", "Terror", 2007));
        MoviesArray.add(new Movies("Insidious", 110, "James Wan", "Terror", 2010));
        MoviesArray.add(new Movies("Paranormal Activity", 70, "Oren Peli", "Terror", 2008));
        fillMoviesDataBase(miArreglillo);
    }



    private void  fillMovieAdapter(ArrayList<Movies> lMovies) {
        oMovieAdapter.clear();

        for(movie oMovie:lMoviesMovies){
            oMovieAdapter.add(oMovie);
        }

        oMovieAdapter.notifyDataSetChanged();
    }
}
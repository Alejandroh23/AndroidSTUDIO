package mx.edu.cetys.alejandroh.pojos;

import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.LayoutRes;
import android.support.annotation.ArrayRes;
import android.support.v4.view.ViewGroupCompat;

/**
 * Created by PC on 25/08/2017.
 */

public class MovieAdapter extends ArrayAdapter<Movies> {
   public MovieAdapter(Context context){
       super(context, R.layout.movie_row, R.id.txtMovieName);
   }
   @NonNull
    @Override
    public getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
       view Oview=super.getView(position, convertView,parent);

       TextView txtMovieName=(TextView) oView.findViewById(R.id.txtMovieName);
       TextView txtMovieLength=(TextView) oView.findViewById(R.id.txtMovieLength);
       TextView txtMovieDirector=(TextView) oView.findViewById(R.id.txtMovieDirector);
       TextView txtMovieGenre=(TextView) oView.findViewById(R.id.txtMovieGenre);
       TextView txtMovieYear=(TextView) oView.findViewById(R.id.txtMovieYear);

        Movies oMovie=this.getItem(position);
        txtMovieDirector.setText(oMovie.getDirector());
       txtMovieGenre.setText(oMovie.getGenre());
       txtMovieLength.setText(oMovie.getDuration());
       txtMovieName.setText(oMovie.getName());
       txtMovieYear.setText(oMovie.getYear());


       return oView;
   }
}

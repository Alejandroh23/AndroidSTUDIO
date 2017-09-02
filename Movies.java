package mx.edu.cetys.alejandroh.pojos;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by PC on 25/08/2017.
 */

public class Movies implements Parcelable{
    private String movie;
    private int duration;
    private String director;
    private String genre;
    private int year;

    public Movies(){
}

    public Movies(String name, int duration, String director, String director, String genre, int year) {

    }

    public Movies(Parcel in){
        name=in.readString();
        duration=in.readInt();
        director=in.readString();
        genre=in.readString();
        year=in.readInt();
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Integer getYear() {
        return year;
    }


    public void setYear(Integer year) {
        this.year = year;
    }

    private String name;
    private Integer duration;
    private String director;
    private String genre;
    private Integer year;

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
    dest.writeString(name);
        dest.writeInt(duration);
        dest.writeString(director);
        dest.writeString(genre);
        dest.writeInt(year);
    }
    public static final Parcelable.Creator CREATOR= new Parcelable.Creator(){
        @Override
            public Movies createFromParcel(Parcel in){
                return new Movies(in);
            }
            @Override
            public Movies[] newArray(int size) {
                return new Movies[size];
            }
    };
}

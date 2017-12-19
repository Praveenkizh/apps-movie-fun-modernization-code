package org.superbiz.moviefun.albumsapi;

import java.util.Objects;

public class AlbumsInfo {
    private Long id;
    private String artist;
    private String title;
    private int year;
    private int rating;

    public AlbumsInfo(){

    }

    public AlbumsInfo(String artist, String title, int year, int rating){
        this.artist = artist;
        this.title = title;
        this.year = year;
        this.rating = rating;
    }
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AlbumsInfo that = (AlbumsInfo) o;
        return year == that.year &&
                rating == that.rating &&
                Objects.equals(id, that.id) &&
                Objects.equals(artist, that.artist) &&
                Objects.equals(title, that.title);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, artist, title, year, rating);
    }


}

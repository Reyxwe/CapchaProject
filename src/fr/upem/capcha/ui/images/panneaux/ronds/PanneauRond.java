package fr.upem.capcha.ui.images.panneaux.ronds;

import fr.upem.capcha.ui.images.Images;

import java.net.URL;
import java.util.List;

public class PanneauRond implements Images {

    @Override
    public List<String> getPhotos(){
        return null;
    }

    @Override
    public List<String> getRandomPhotosURL(int nbPhotos){
        return null;

    }

    @Override
    public String getRandomPhotosURL(){
        return null;

    }

    @Override
    public boolean isPhotoCorrect(String address) {
        return false;
    }

    @Override
    public String toString(){
        return "panneaurond";
    }
}

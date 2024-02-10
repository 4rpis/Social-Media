import java.util.ArrayList;


class Photo{
    private String url;
    private String caption;

    public Photo(String url, String caption) {
        this.url = url;
        this.caption = caption;
    }

    public String getUrl() {
        return url;
    }

    public String getCaption() {
        return caption;
    }
}

class Album {
    private String title;
    private ArrayList<Photo> photos;

    public Album(String title) {
        this.title = title;
        this.photos = new ArrayList<>();
    }

    public void addPhoto(Photo photo) {
        photos.add(photo);
    }

    public ArrayList<Photo> getPhotos() {
        return photos;
    }
}


public class PhotoViewerApp{
    public static void main(String[] args){
        
        Album album = new Album("Мій альбом");
        album.addPhoto(new Photo("https://bestviews.com/photo1.jpg", "Красивий пейзаж"));
        album.addPhoto(new Photo("https://tastiestfood.com/photo2.jpg", "Смачна їжа"));

        
        ArrayList<Photo> photos = album.getPhotos();
        for (Photo photo : photos) {
            System.out.println("Ссилка: " + photo.getUrl());
            System.out.println("Опис: " + photo.getCaption());
            System.out.println();
        }
    }
    
}
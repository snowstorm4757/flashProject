package depOrphClasses;

public class OrphanPhotos {
    private int id;
    private String created_at;
    private String updated_at;
    private String photoPortraitUrl;
    private String photoLongUrl;
    private int orphanId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public String getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(String updated_at) {
        this.updated_at = updated_at;
    }

    public String getPhotoPortraitUrl() {
        return photoPortraitUrl;
    }

    public void setPhotoPortraitUrl(String photoPortraitUrl) {
        this.photoPortraitUrl = photoPortraitUrl;
    }

    public String getPhotoLongUrl() {
        return photoLongUrl;
    }

    public void setPhotoLongUrl(String photoLongUrl) {
        this.photoLongUrl = photoLongUrl;
    }

    public int getOrphanId() {
        return orphanId;
    }

    public void setOrphanId(int orphanId) {
        this.orphanId = orphanId;
    }
}
package Models;

/**
 *
 * @author ADMIN
 */
public class Category {

    private int cid;
    private String cname;
    private String cimg;

    public Category() {
    }

    public Category(int cid, String cname, String cimg) {
        this.cid = cid;
        this.cname = cname;
        this.cimg = cimg;
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public String getCimg() {
        return cimg;
    }

    public void setCimg(String cimg) {
        this.cimg = cimg;
    }

    @Override
    public String toString() {
        return "Category{" + "cid=" + cid + ", cname=" + cname + ", cimg=" + cimg + '}';
    }

}

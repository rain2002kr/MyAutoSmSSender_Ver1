package rain2002kr.techworld.myautosmssender_ver1.Tel_Item;

public class telItem {
    int resId;
    String name,phone;

    @Override
    public String toString() {
        return "telItem{" +
                "resId=" + resId +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }

    public int getResId() {
        return resId;
    }

    public void setResId(int resId) {
        this.resId = resId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public telItem(int resId, String name, String phone) {
        this.resId = resId;
        this.name = name;
        this.phone = phone;
    }
    public telItem(){
        ;
    }
}

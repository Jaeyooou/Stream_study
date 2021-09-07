package HashSet;

public class Occurence {
    private int id;
    private int count;

    public int getCount() {
        return count;
    }

    public int getId() {
        return id;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void setId(int id) {
        this.id = id;
    }


    @Override
    public int hashCode() {
        return id;
    }

    //두개의 occurence 가 같은지
    //hashcode 와 equals
    @Override
    public boolean equals(Object o) {
        Occurence other = (Occurence) o;
        if (id == other.getId()) return true;
        return false;

    }
}

public class Email {
    private Integer src;
    private Integer dst;

    Email(){

    }
    Email(Integer src , Integer dst) {
        this.src = src;
        this.dst = dst;
    }

    public Integer getDst() {
        return dst;
    }

    public Integer getSrc() {
        return src;
    }

    @Override
    public String toString() {
        return "Email{" +
                "src=" + src +
                ", dst=" + dst +
                '}';
    }
}

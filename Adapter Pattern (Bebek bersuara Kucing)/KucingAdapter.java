public class KucingAdapter implements Bebek{
    Kucing kucing;

    public KucingAdapter(Kucing kucing){
        this.kucing = kucing;
    }

    @Override 
    public void suaraBebek() {
        kucing.suaraKucing();
    }
}

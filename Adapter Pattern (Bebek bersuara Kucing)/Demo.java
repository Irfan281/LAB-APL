public class Demo {
    public static void main(String[] args) {
        System.out.println("\nSuara Bebek :");
        Bebek bebek = new BebekSuara();
        bebek.suaraBebek();

        System.out.println("\nSuara Kucing :");
        Kucing kucing = new KucingSuara();
        kucing.suaraKucing();

        System.out.println("\nBebek bersuara Kucing :");
        Bebek bebekKucing = new KucingAdapter(kucing);
        bebekKucing.suaraBebek();
    }
}
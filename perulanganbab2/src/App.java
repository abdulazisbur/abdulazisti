import java.util.Stack;
public class App {
    public static void main(String[] args) {
    
    Stack<String> animals = new Stack<String>();
    animals.push("Cikgu Tiger");
    animals.push("Sharkbid");
    animals.push("Naga bayangan");
    animals.push("Kucing oyen");
    animals.push("Kuda Nil jawa");

    System.out.println("Stack Item \t\t:" + animals);
    //jurusan.pop();

    //System.out.println("Peek \t\t\T:" + animals);
    System.out.println("Check apakah kosong? \t" + animals.empty());
    System.out.println("Check apakah kosong?" + animals.isEmpty());
    System.out.println("lihat data yang pertama \t" + animals.firstElement());
    System.out.println("Lihat data teng terakhir \t" + animals.lastElement());
    System.out.println("lihat data ke 2" + animals.get(1));




    
    }
}

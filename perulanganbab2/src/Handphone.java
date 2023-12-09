import java.util.ArrayList;
public class Handphone {

int id;
String merk;
String type;
String color;
int harga;

Handphone(int id, String merk, String type, String color, int harga){
    this.id = id;
    this.merk = merk;
    this.type = type;
    this.color = color;
    this.harga = harga;
}
public static void main(String[] args){
    ArrayList<Handphone> daftarHandphone = new ArrayList<Handphone>();
    daftarHandphone.add(new Handphone(1,"samsung","redmi","black",2000));

    for (Handphone dataHandphone : daftarHandphone){
        System.out.println(dataHandphone.id + " " + dataHandphone.merk + " " + dataHandphone.type + " " + dataHandphone.color + " " + dataHandphone.harga);
    }

   }
}

import java.util.ArrayList;

public class array {
    public static void main(String[] args){
        ArrayList<String> country = new ArrayList<String>();

        country.add("ausie");
        country.add("india");
        country.add("istanbul");
        country.add("indonesia");
        country.add("thailand");
        country.add(0,"china");
        country.add("kamboja");
        country.add("myanmar");
        country.add("sokor");
        country.add("afrika");
        country.set(3, "nepal");

        country.remove(9);

        System.out.println(country);


        System.out.println(country.size());
    }
}

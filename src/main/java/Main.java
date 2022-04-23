import com.google.gson.Gson;


public class Main {
    public static void main(String[] args) {
        Gson gson = new Gson();
        Car firsCar = new Car("Audi", "A1", 105);
        String firstCarJson = gson.toJson(firsCar);

        System.out.println(firstCarJson);

    }
}

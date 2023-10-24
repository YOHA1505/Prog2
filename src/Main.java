// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        // Skapar en instans av klassen Car som har dessa egenskaper:
        // > ID: 1
        // > Bilmärke: Nissan
        // > Ägare: Yoel
        // > Värde: 900 000 sek
        Car r35 = new Car(1, "Nissan", "Yoel", 900000);

        // Ökar bilens hastighet med 140 km/h
        r35.speedUp(140);

        // Sänker bilens hastighet med 20 km/h
        r35.slowDown(20);

        // Stannar bilen (Sätter hastigheten till 0km/h)
        r35.stop();

        // Hämtar och skriver ut bilens id
        r35.getID();

        // Hämtar och skriver ut bilens märke
        r35.getBrand();

        // Hämtar och skriver ut bilens hastighet
        r35.getSpeed();

        // Ökar antalet körda kilometer till 10 000 och skriver ut den nya körsträckan
        r35.getMilage();

        // Hämtar och skriver ut bilens ägare
        r35.getOwner();

        // Ändrar ägaren till "Mr.Habtit" och skriver ut nya ägaren
        r35.setOwner("Mr.Habtit");

        // Hämtar bilens värde och skriver ut det
        r35.getValue();

    }
}

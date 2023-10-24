public class Car {
    //Attrinbutes
    private int id;                 //Unik identifierare för bilen
    private String brand;           //Bilens märke
    private double speed = 0.0;     //Bilens hastighet i km/h
    private int milage = 0;         //Antal körda kilometer
    private String owner;           //Bilens ägaren
    private int value;              //Bilens värde

    //constructor
    public Car(int id, String brand, String owner, int value) {
        this.id = id;               //Sätter id till det värde som skickades som argument
        this.brand = brand;         //Sätter brand till det värde som skickades som argument
        this.owner = owner;         //Sätter owner till det värde som skickades som argument
        this.value = value;         //Sätter value till det värde som skickades som argument
    }

    //Methods

    //Ökar bilens hastighet med, increase, antal km/h
    public void speedUp(double increase) {
        if (this.speed + increase < 220) {
            this.speed = this.speed + increase;
            System.out.println("Speed: " + this.speed + " km/h");
        } else {
            System.out.println("You have reached your top speed!!!");
            System.out.println(this.speed);
        }
    }

    //Sänker bilens hastighet med, decrease, antal km/h
    public void slowDown(double decrease) {
        if (this.speed - decrease > 0) {
            this.speed = this.speed - decrease;
            System.out.println("Speed: " + this.speed + " km/h");
        } else {
            System.out.println("How is your speed negative?!");
        }
    }

    //Stannar bilen(Sätter bilens hastighet till 0 km/h)
    public void stop() {
        this.speed = 0;
    }

    //Hämtar id
    public void getID() {
        System.out.println("ID: " + this.id);
    }

    //Hämtar brand
    public String getBrand() {
        this.brand = brand;
        System.out.println("Brandname: " + this.brand);
        return this.brand;
    }

    //Hämta hasigheten
    public double getSpeed() {
        return this.speed;
    }

    //Ökar antal körda kilometer med 10 000 och hämtar den
    public int getMilage() {
        this.milage = milage + 10000;
        System.out.println("Milage: " + this.milage + " km");
        return this.milage;
    }

    //Hämtar owner
    public String getOwner() {
        this.owner = owner;
        System.out.println("Owner: " + this.owner);
        return this.owner;
    }

    //Hämtar ägaren och skriver ut den nya ägaren
    public void setOwner(String owner) {
        this.owner = owner;
        System.out.println("New owner: " + this.owner);
    }

    //Hämtar värdet och skriver ut det
    public int getValue() {
        this.value = value;
        System.out.println("Value: " + this.value + " sek");
        return this.value;
    }
}

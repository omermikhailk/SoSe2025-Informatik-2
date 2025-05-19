class Food {
    private String name;
    private int energyPerGram;

    public Food(String name, int energyPerGram) {
        this.setName(name);
        this.setEnergyPerGram(energyPerGram);
    }

    public boolean checkName(String name) {
        return name instanceof String;
    }

    public boolean checkEnergyPerGram(int energyPerGram) {
        return Integer.class.isInstance(energyPerGram);
    }

    public void setName(String name) {
        if (this.checkName(name)) {
            this.name = name;
        }
    }

    public void setEnergyPerGram(int energyPerGram) {
        if (this.checkEnergyPerGram(energyPerGram)) {
            this.energyPerGram = energyPerGram;
        }
    }

    public String getName() {
        return this.name;
    }

    public int getEnergyPerGram() {
        return this.energyPerGram;
    }

    public String toString() {
        return this.getName();
    }
}

class House {
    private String address;
    private double squareMeter;

    public House(String address, double squareMeter) {
        this.setAddress(address);
        this.setSquareMeter(squareMeter);
    }

    public boolean checkAddress (String name) {
        return address instanceof String;
    }

    public boolean checkSquareMeter(double squareMeter) {
        return Double.class.isInstance(squareMeter);
    }

    public void setAddress(String address) {
        if (this.checkAddress(address)) {
            this.address = address;
        }
    }

    public void setSquareMeter(double squareMeter) {
        if (this.checkSquareMeter(squareMeter)) {
            this.squareMeter = squareMeter;
        }
    }

    public String getAddress() {
        return this.address;
    }

    public double getSquareMeter() {
        return this.squareMeter;
    }

    public String toString() {
        return this.getAddress() + " (" + this.getSquareMeter() + ")m^2";
    }
}

class GuardDog {
    private String name;
    private int energy;
    private House house;

    public GuardDog(String name, int energy, House house) {
        this.setName(name);
        this.setEnergy(energy);
        this.setHouse(house);
    }

    public GuardDog(String name, House house) {
        this.setName(name);
        this.setHouse(house);
        this.energy = 100;
    }

    public boolean checkName(String name) {
        return name instanceof String;
    }

    public boolean checkEnergy(int energy) {
        return Integer.class.isInstance(energy);
    }

    public boolean checkHouse(House house) {
        return house instanceof House;
    }

    public void setName(String name) {
        if (this.checkName(name)) {
            this.name = name;
        }
    }

    public void setEnergy(int energy) {
        if (this.checkEnergy(energy)) {
            this.energy = energy;
        }
    }

    public void setHouse(House house) {
        if (this.checkHouse(house)) {
            this.house = house;
        }
    }

    public String getName() {
        return this.name;
    }

    public int getEnergy() {
        return this.energy;
    }

    public House getHouse() {
        return this.house;
    }

    public String toString() {
        return this.getName() + " [house=" + this.getHouse() + ", current energy=" + this.getEnergy() + "]";
    }

    public int guard(int duration) {
        if (duration <= 0) {
            return 0;
        }
        int requiredEnergy = (int) (duration * (this.getHouse().getSquareMeter() / 10));
        if (requiredEnergy > this.getEnergy()) {
            return -1;
        }
        else {
            this.setEnergy(this.getEnergy() - requiredEnergy);
            return 1;
        }
    }

    public boolean feed(Food food, int grams) {
        if (grams <= 0) {
            return false;
        }
        else {
            this.setEnergy(this.getEnergy() + grams * food.getEnergyPerGram());
            return true;
        }
    }
}

class LazyGuardDog extends GuardDog {
    public LazyGuardDog(String name, int energy, House house) {
        super(name, energy, house);
    }

    public LazyGuardDog(String name, House house) {
        super(name, house);
    }

    @Override
    public int guard(int duration) {
        if (duration <= 0) {
            return 0;
        }
        int requiredEnergy = (int) (duration * (0.5 * (this.getHouse().getSquareMeter() / 10)));
        if (requiredEnergy > this.getEnergy()) {
            return -1;
        }
        else {
            this.setEnergy(this.getEnergy() - requiredEnergy);
            return 1;
        }
    }
}

class GuardDogApplication {
    public static void main(String[] args) {
        Food f1 = new Food("Beef", 30);
        Food f2 = new Food("Chicken", 10);
        Food f3 = new Food("Duck", 50);

        House h1 = new House("Mainistan City, South Street 27", 120.5);
        House h2 = new House("Mainistan City, South Street 28", 247.75);

        GuardDog g1 = new GuardDog("John", 200, h1);
        GuardDog g2 = new GuardDog("David", h1);
        LazyGuardDog lg1 = new LazyGuardDog("Mike", h2);

        System.out.println(g1.toString());
        System.out.println(g2.toString());
        System.out.println(lg1.toString());

        feed(g1, f1, 100);
        feed(g2, f2, 0);
        feed(lg1, f3, 5);

        guard(g1, 10);
        guard(g2, 0);
        guard(lg1, 20);
    }

    public static void guard(GuardDog dog, int duration) {
        int result = dog.guard(duration);
        if (result == 1) {
            System.out.println(dog.toString() + " has guarded the property successfully!");
        }
        else if (result == 0) {
            System.out.println(dog.toString() + " can't guard for 0 minutes or less!"); 
        }
        else {
            System.out.println(dog.toString() + " has too little energy!");
        }
    }

    public static void feed(GuardDog dog, Food food, int grams) {
        boolean result = dog.feed(food, grams);        
        if (result == false) {
            System.out.println(dog.toString() + " wurde zu wenig Essen gegeben!");
        }
        else {
            System.out.println(dog.toString() + " hat alles gefressen!");
        }
    }
}

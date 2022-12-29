public class MyLaptop {
    String name;
    int ram;
    int ssd;
    String os;
    String color;
    float weight;

    public MyLaptop (String name, int ram, int ssd, String os, String color, float weight) {
        this.name = name;
        this.ram = ram;
        this.ssd = ssd;
        this.os = os;
        this.color = color;
        this.weight = weight;
    }

    public MyLaptop() {
    }

    @Override
    public String toString() {
        return String.format("Ноутбук: %s, ОЗУ: %d ГБ, ssd: %d ГБ, OS: %s, Цвет: %s, вес: %.2f кг", name, ram, ssd, os, color, weight);
        //return String.format("Ноутбук: %s, ОЗУ: %d ГБ, ssd: %d ГБ, OS: %s, Цвет: %s, вес: %f кг", name, ram, ssd, os, color, weight);
    }

    public String getName() {
        return name;
    }

    public Integer getRam() {
        return ram;
    }

    public Integer getSsd() {
        return ssd;
    }

    public String getOs() {
        return os;
    }

    public String getColor() {
        return color;
    }

    public float getWeight() {
        return weight;
    }
}
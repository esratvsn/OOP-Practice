
public class Main {
    public static void main(String[] args) {
        try {
            Worker worker1 = new Worker("Esra", 1000);
        } catch (Exception e) {
            System.out.println("Esra için hata: " + e.getMessage());
        }

        try {
            Worker worker2 = new Worker("Ahmet", 0);
        } catch (Exception e) {
            System.out.println("Ahmet için hata: " + e.getMessage());
        }

        try {
            Worker w3 = new Worker("Zehra", 18000);
        } catch (Exception e) {
            System.out.println("Zehra için hata: " + e.getMessage());
        }

        System.out.println("Total workers: " + Worker.getTotalWorkers());
    }

}
public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int price = 12_600;
        int miles = service.calculate(price); // должно получиться 630
        System.out.println(miles);
    }

}

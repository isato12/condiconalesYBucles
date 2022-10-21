public class CondicionalIfSwitch {
    public static void main(String[] args) {
        String station = "primavera";
        // if
        if (station == "otoño") {
            System.out.println("Hay que abrigarse");
        } else {
            System.out.println("no estamos en otoño");
        }
        // switch

        String stationActual = "invierno";

        switch (stationActual) {
            case "primavera":
                System.out.println("Es primavera");
                break;
            case "verano":
                System.out.println("Es verano");
                break;
            case "otoño":
                System.out.println("Es otoño");
                break;
            default:
                System.out.println("Es " + stationActual);

                break;
        }
    }
}
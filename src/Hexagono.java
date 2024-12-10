public class Hexagono {
    public static double calcularVolume(double lado, double altura){
        double volume = 0.0;
        volume = (3.0 * Math.sqrt(3.0) * lado * lado * altura) / 2.0;
        return volume;
    }
}
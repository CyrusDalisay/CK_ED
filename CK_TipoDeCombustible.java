package clases;

public class CK_TipoDeCombustible {

    public enum TipoCombustible {
        GASOLINA(1.60),
        DIESEL(1.45),
        ELECTRICO(0.20);

        private final double precioPorLitro;

        TipoCombustible(double precioPorLitro) {
            this.precioPorLitro = precioPorLitro;
        }

        public double getPrecioPorLitro() {
            return precioPorLitro;
        }
    }

    public static void main(String[] args) {


        }
    }


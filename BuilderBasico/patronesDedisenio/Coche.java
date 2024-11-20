package patronesDedisenio;

public class Coche {
    private String color;
    private String modelo;
    private String motor;
    private String ruedas;

    // Constructor privado, solo accesible desde el Builder
    private Coche(CocheBuilder builder) {
        this.color = builder.color;
        this.modelo = builder.modelo;
        this.motor = builder.motor;
        this.ruedas = builder.ruedas;
    }

    @Override
    public String toString() {
        return "Coche [color=" + color + ", modelo=" + modelo + ", motor=" + motor + ", ruedas=" + ruedas + "]";
    }

    // Clase Builder
    public static class CocheBuilder {
        private String color;
        private String modelo;
        private String motor;
        private String ruedas;

        public CocheBuilder color(String color) {
            this.color = color;
            return this;
        }

        public CocheBuilder modelo(String modelo) {
            this.modelo = modelo;
            return this;
        }

        public CocheBuilder motor(String motor) {
            this.motor = motor;
            return this;
        }

        public CocheBuilder ruedas(String ruedas) {
            this.ruedas = ruedas;
            return this;
        }

        public Coche build() {
            return new Coche(this);
        }
    }
}

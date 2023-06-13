public class Mascota {
    private int energia;
    private int fatiga;
    private int sueno;
    private int higiene;
    private int peso;
    private String raza;
    private int numeroDavid;

    public Mascota(String raza) {
        this.raza = raza;
        final int ValorMax = 60;
        final int ValorMin = 40;
        this.energia = (int) (Math.random() * (ValorMax - ValorMin) + ValorMin);
        this.fatiga = (int) (Math.random() * (ValorMax - ValorMin) + ValorMin);
        this.sueno = (int) (Math.random() * (ValorMax - ValorMin) + ValorMin);
        this.higiene = (int) (Math.random() * (ValorMax - ValorMin) + ValorMin);
        this.peso = (int) (Math.random() * (ValorMax - ValorMin) + ValorMin);
    }

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }

    public int getFatiga() {
        return fatiga;
    }

    public void setFatiga(int fatiga) {
        this.fatiga = fatiga;
    }

    public int getSueno() {
        return sueno;
    }

    public void setSueno(int sueno) {
        this.sueno = sueno;
    }

    public int getHigiene() {
        return higiene;
    }

    public void setHigiene(int higiene) {
        this.higiene = higiene;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public void dormir() {
        System.out.println("Has seleccionado dormir");
        System.out.println("La energia aumenta 15 puntos");
        System.out.println("La fatiga disminuye 15 puntos");
        switch (this.raza) {
            case "Gato":
                this.sueno -= 20;
                System.out.println("El sueño disminuye 20 puntos");
                break;
            case "Perro":
                this.sueno -= 25;
                System.out.println("El sueño disminuye 25 puntos");
        }
        this.fatiga -= 15;
        this.energia += 15;
    }

    public void jugar() {
        System.out.println("Has seleccionado jugar");
        System.out.println("La fatiga aumenta 10 puntos");
        System.out.println("La energia disminuye 10 puntos");
        System.out.println("La higiene aumenta 15 puntos");
        System.out.println("El peso disminuye 10 puntos");
        switch (this.raza) {
            case "Gato":
                this.sueno += 15;
                System.out.println("El sueño aumenta 15 puntos");
                break;
            case "Perro":
                this.sueno += 10;
                System.out.println("El sueño aumenta 10 puntos");
        }
        this.fatiga += 10;
        this.energia -= 10;
        this.higiene += 15;
        this.peso -= 10;
    }

    public void comer(){
        System.out.println("Has seleccionado dormir");
        System.out.println("La energia aumenta 15 puntos");
        System.out.println("La fatiga disminuye 15 puntos");

        switch (raza) {
            case "Gato":
                sueno -= 20;
                System.out.println("El sueño disminuye 20 puntos");
                break;
            case "Perro":
                sueno -= 25;
                System.out.println("El sueño disminuye 25 puntos");
                break;
        }

        fatiga -= 15;
        energia += 15;
    }

    public void jugar() {
        System.out.println("Has seleccionado jugar");
        System.out.println("La fatiga aumenta 10 puntos");
        System.out.println("La energia disminuye 10 puntos");
        System.out.println("La higiene aumenta 15 puntos");
        System.out.println("El peso disminuye 10 puntos");

        switch (raza) {
            case "Gato":
                sueno += 15;
                System.out.println("El sueño aumenta 15 puntos");
                break;
            case "Perro":
                sueno += 10;
                System.out.println("El sueño aumenta 10 puntos");
                break;
        }

        fatiga += 10;
        energia -= 10;
        higiene += 15;
        peso -= 10;
    }

    public void comer() {
        System.out.println("Has seleccionado comer");
        System.out.println("La energia aumenta 10 puntos");
        System.out.println("La higiene disminuye 10 puntos");
        System.out.println("El peso aumenta 10 puntos");

        switch (raza) {
            case "Gato":
                sueno += 10;
                System.out.println("El sueño aumenta 10 puntos");
                break;
            case "Perro":
                sueno += 15;
                System.out.println("El sueño aumenta 15 puntos");
                break;
        }

        energia += 10;
        higiene -= 10;
        peso += 10;
    }

    public void limpiar() {
        switch (raza){
            case "Gato":
                sueno += 10;
                System.out.println("El sueño aumenta 10 puntos");
                break;
            case "Perro":
                sueno += 15;
                System.out.println("El sueño aumenta 15 puntos");
                break;

        }

    }
}
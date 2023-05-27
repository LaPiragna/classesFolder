package guia5.ejercicio3;

public class ExeClass {
    Password[] passwords;
    Boolean[] fuerzaPasswords;
    private int cantidadPasswords;
    private int longitudPasswords;
    public ExeClass(int cantidadPasswords, int longitudPasswords) {
        this.cantidadPasswords = cantidadPasswords;
        this.longitudPasswords = longitudPasswords;
        this.passwords = new Password[cantidadPasswords];
        this.fuerzaPasswords = new Boolean[cantidadPasswords];

        for (int i = 0; i < cantidadPasswords; i++) {
            Password password = new Password(longitudPasswords);
            this.passwords[i] = password;
        }

        for (int i = 0; i < cantidadPasswords; i++) {
            this.fuerzaPasswords[i] = this.passwords[i].esFuerte();
        }
    }

    public void fuerzaPasswords() {
        for (int i = 0; i < cantidadPasswords; i++) {
            if (this.passwords[i].esFuerte())
                System.out.println(this.passwords[i].getContraseña() + " es fuerte.");
            else
                System.out.println(this.passwords[i].getContraseña() + " no es fuerte.");
        }
    }
}

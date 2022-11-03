
package testes;

public class Objeto {
    String string;
    String string2;
    int integer;

    public Objeto(String string, String string2, int integer) {
        this.string = string;
        this.string2 = string2;
        this.integer = integer;
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    public String getString2() {
        return string2;
    }

    public void setString2(String string2) {
        this.string2 = string2;
    }

    public int getInteger() {
        return integer;
    }

    public void setInteger(int integer) {
        this.integer = integer;
    }
    
}

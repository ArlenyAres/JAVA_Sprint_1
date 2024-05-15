package tasca3Collections.n1.ejercici1;

public class Month {
    private String name;

    public Month() {

    }

    public Month(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public boolean equals( Object objeto ) {
        if (objeto == null) return false;

        Month month = (Month)objeto;
        if (this.getName().equals(month.getName()) )
            return true;

        return false;
    }

    public int hashCode() {
        return this.getName().hashCode();
    }
}


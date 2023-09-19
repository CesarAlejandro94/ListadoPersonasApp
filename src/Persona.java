public class Persona {
    private int id;
    private String nombre;
    private String tel;
    private String email;
    private static int numeroPersonas = 0;

    //Constructor vacio
    public Persona(){
        this.id = ++Persona.numeroPersonas;
    }
    public Persona(String nombre, String tel, String email){
        //asi se llama el constructor vacio para inicializar tambien id aumentado
        this();
        this.nombre = nombre;
        this.tel = tel;
        this.email = email;
    }
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", tel='" + tel + '\'' +
                ", email='" + email + '\'' +
                '}'+ super.toString(); //super se utiliza para llamar metodos de la clase padre.
    }

    public static void main(String[] args) {
        Persona persona1 = new Persona("Cesar","5558529422","cesar@hmail.com");
        //System.out.println(persona1.toString()); Para eso se define el metodo toString.
        System.out.println(persona1);
    }
}

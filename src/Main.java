public class Main {
    public static void main(String[] args) {


        Socio Sam;
        Socio Mike;

        Sala Bump;
        Sala Cardio;

        Gimnasio MyGym;
        Gimnasio UaxGym;

        Sam = new Socio(0001, "Sam Sulek");
        Mike = new Socio(0002, "Miguel Torres");
        System.out.println(Sam.toString()+ "\n" + Mike.toString() + "\n");


        Bump = new Sala(0001, "Sala para poner los musculos bien grandes y duros");
        Cardio = new Sala(0002, "Sala para ganar fondo fisico");
        System.out.println(Bump.toString()+ "\n" + Cardio.toString() + "\n");


        MyGym = new Gimnasio("1","JavaGym",10,10);
        UaxGym = new Gimnasio("2","JavaGym",10,10);
        System.out.println(MyGym.toString() +"\n"+ UaxGym.toString() + "\n");






    }
}
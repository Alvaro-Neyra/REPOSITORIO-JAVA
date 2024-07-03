import java.util.Scanner;

public class Rpg {

    public static void main(String[] args) {

        Scanner player = new Scanner(System.in);
        System.out.println("Bienvenido aventurero, estas listo para una mision epica?");

        String respuesta = player.nextLine();
        switch (respuesta) {
            case "SI":
                System.out.println("entonces vamonos a la aventura");
                break;
            case "NO":
                System.out.println("*lo mata*");
                System.out.println("Game Over");
                System.exit(0);

            default:
                System.out.println("no entendi");
                System.out.println("Game Over???? easter egg");
                System.exit(0);
        }
        System.out.println(
                "Bienvenido a la aventura, tu nombre es Fifi el archimagoy tu objetivo es llegar a la cima de la montaña y encontrar el tesoro que esta en la cima en solo tres pasos y las opciones que elijas deben ser sabias");
        System.out.println(
                "entonces para avanzar, que haras primero para ir a la montaña?, recuerda elegir sabiamente");
        System.out.println("Elija CON CUIDADO:");
        System.out.println("A. escalar");
        System.out.println("B. cruzar por el sendero seguro");
        System.out.println("C. usar magia");
        System.out.println("negarse a elegir o decir otra cosa, es una muerte inmediata");
        String respuesta2 = player.nextLine();
        switch (respuesta2) {
            case "A":
                System.out.println("al escalar no llegaste muy lejos pero fue la altura suficiente para morir de caida");
                System.out.println("Game Over");
                System.exit(0);
            case "B":
                System.out.println(
                        "intentaste subir por el sendero -seguro- pero solo te encnotraste con la muerte mas fatal por unos extraños y repulsivos cuervos que devoraron tu cuerpo lenta y dolorosamente");
                System.out.println("Game Over");
                System.exit(0);
            case "C":
                System.out.println(
                        "usaste magia para subir y defenderte, eres un hechicero medianamente poderoso, por milagro funciono");
                break;
            default:
                System.out.println("*lo mata*");
                System.out.println("Game Over");
                System.exit(0);
        }

        System.out.println(
                "el gran aventurero, esta casi por llegar a la cima pero fue detenido por un gran y poderoso dragón que te atacara con fuego y veneno, que haras?");

        System.out.println("Elija CON CUIDADO:");
        System.out.println("A. intentar pelear");
        System.out.println("B. intentar huir");
        System.out.println("C. usar magia");
        System.out.println("negarse a elegir o decir otra cosa, es una muerte inmediata");
        String respuesta3 = player.nextLine();
        switch (respuesta3) {
            case "C":
                System.out.println(
                        "usaste magia para defenderte, pero que tonto fuiste al pensar que la magia puede dañar a un dragon");
                System.out.println("Game Over");
                break;
            case "B":
                System.out.println("intentaste huir pero el dragón te alcanzo y te devoró");
                System.out.println("Game Over");
                System.exit(0);
            case "A":
                System.out.println(
                        "intentaste pelear, afortunadamente te caiste al tropezar y por casualidad liberaste un hechizo tan poderoso que sello al dragon en un huevo, por lo tanto guardas el huevo y sigues tu camino");
                break;
            default:
                System.out.println("*lo mata*");
                System.out.println("Game Over");
                System.exit(0);
        }
        System.out.println(
                "el gran aventurero, por fin llego a la cima de la montaña, con audacia y valor se adentro a la cueva donde estaba el tesoro que buscaba, pero estando cerca de la luz, escuchas ruidos de patas aracnidas");
        System.out.println("UN ESCORPION GIGANTE TE ESTA ACECHANDO!!!");
        System.out.println("Elija CON CUIDADO:");
        System.out.println("A. huir");
        System.out.println("B. intentar pelear");
        System.out.println("C. ESCABULLIRSE Y LLEGAR AL TESORO SIN HACER RUIDO");
        System.out.println("negarse a elegir o decir otra cosa, es una muerte inmediata");
        String respuesta4 = player.nextLine();
        switch (respuesta4) {
            case "A":
                System.out.println(
                        "huyes desesperadamente, pero el escorpion te alcanzo y te comenzo a arrancar cada extremidad con mucha facilidad, dejando solo un charco de sangre");
                System.out.println("Game Over");
                System.exit(0);
            case "B":
                System.out.println(
                        "intentaste pelear, pero aunque tu magia fuera lo suficientemente fuerte y tu espadas sumamente afiladas, la coraza del escorpion era bastante dura, te termino agotando y envenenando en el transcurso de la pelea, mueres por el veneno");
                System.out.println("Game Over");
                System.exit(0);
            case "C":
                System.out.println(
                        "escabulliste y llegaste al tesoro, pero al llegar al tesoro, te das cuenta que el tesoro es un espejo, y que el espejo te refleja a ti mismo, y que el espejo es el espejo de la muerte, y que el espejo te refleja a ti mismo, y que el espejo es el espejo de la muerte, y que el espejo te refleja a ti mismo, y que el espejo es el espejo de la muerte, y que el espejo te refleja a ti mismo, y que el espejo es el espejo de la muerte, y que el espejo te refleja a ti mismo, te vuelves loco por la revelacion, comienzas a gritar de la desesperacion y dolor, terminas atrayendo al escorpion a ti y te termina matando, acabando tu sufrimiento");
                System.out.println("Game Over");
                System.exit(0);
            case "HERO":
                System.out.println(
                        "sacas el huevo del dragon y lo tiras contra el escorpion, esta accion rompe al huevo y de este sale el dragon enfurecido, cual con tanto odio se procede a matar con el escorpion, aprovechas que se pelean, vas al tesoro y ves un espejo roto, pues este se rompio por una espina del escorpion");
                System.out.println(
                        "pones a un lado el espejo roto para abrir el cofre, te sientes muy emocionado pues habias encontrado el amuleto divino de los mares, lo que te faltaba para buscar el tesoro de los mares profundos");
                System.out.println("estas listo para otra aventura?...");
                System.out.println("felicidades terminaste la mision");
                System.exit(0);
            default:
                System.out.println("*lo mata*");
                System.out.println("Game Over");
                System.exit(0);

        }
    }
}
package academy.devdojo.EstruturasCondicionais.Switchcase;

public class Aula01DiasDaSemana {
    public static void main(String[] args) {
        int dia = 1;
        switch (dia) {
            case 1:
                System.out.println("Segunda");
                break;
            case 2:
                System.out.println("Terça");
                break;
            case 3:
                System.out.println("Quarta");
                break;
            case 4:
                System.out.println("Quinta");
                break;
            case 5:
                System.out.println("Sexta");
                break;
            case 6:
                System.out.println("Sabado");
                break;
            case 7:
                System.out.println("Dormingo");
                break;
            default:
                System.out.println("Dia invalido");
        }
        System.out.println("Fim do programa");
    }
}

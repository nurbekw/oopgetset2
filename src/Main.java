import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Rectangle rectangle = new Rectangle();
        System.out.print("Вверхняя часть: ");
        rectangle.setSale(scanner.nextInt());
        System.out.print("Левая сторона: ");
        rectangle.setLeft(scanner.nextInt());
        System.out.print("Правая сторона: ");
        rectangle.setRight(scanner.nextInt());
        System.out.print("Нижняя часть: ");
        rectangle.setFloor(scanner.nextInt());
        System.out.println("\nВверх прямооугольника: "+rectangle.getSale()+"\nЛевая сторона: "+ rectangle.getLeft()+
        "\nПравая сторона: "+rectangle.getRight()+"\nНиз прямоугольника: "+rectangle.getFloor());
        System.out.println("\tПлошадь: "+rectangle.vm());
    }
}
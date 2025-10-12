package FullLessons.lesson5;

import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  //javautil papki meji klasse Scanner@, system.in

        //aysinqn sarkink skanner, tvink system.in-hmi k karda en amen@ inchor mard@ k gre konsoli mej u k pahe ira
        //popoxakani mej
       String input = scanner.nextLine();
        System.out.println(input.toUpperCase()); //toUpperCase-@ uxaki metod e vornor mecatar k sarke input-i mejin@

        System.out.println("введи свое имя");
        String name = scanner.nextLine(); //nextLine-@ k vercne @ntanur sax grac@ konsoli meji
        if(name.length() > 0) {
            System.out.println("Привет " + name);
        }


    }
}

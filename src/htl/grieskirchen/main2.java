package htl.grieskirchen;

import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author hoegl
 */
public class main2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a;
        RationalCalculator rC = new RationalCalculator(((x, y) -> {

            double x1 = x.getA() + x.getB();
            double y1 = y.getA() + y.getB();

            Number n = new Number();

            n.setA(x1);
            n.setB(y1);
            return n;

        }), ((x, y) -> {

            double x1 = x.getA() - x.getB();
            double y1 = y.getA() - y.getB();

            Number n = new Number();
            n.setA(x1);
            n.setB(y1);
            return n;
        }), ((x, y) -> {

            double x1 = x.getA() * x.getB();
            double y1 = y.getA() * y.getB();

            Number n = new Number();
            n.setA(x1);
            n.setB(y1);
            return n;
        }), (x, y) -> {

            double x1 = x.getA() / x.getB();
            double y1 = y.getA() / y.getB();

            Number n = new Number();
            n.setA(x1);
            n.setB(y1);
            return n;
        }
        );
        VectorCalculator vC = new VectorCalculator(((x, y) -> {

            double x1 = x.getA() + y.getA();
            double y1 = x.getB() + y.getB();

            Number n = new Number();
            n.setA(x1);
            n.setB(y1);
            return n;

        }), ((x, y) -> {

            double x1 = x.getA() - y.getA();
            double y1 = x.getB() - y.getB();

            Number n = new Number();
            n.setA(x1);
            n.setB(y1);
            return n;
        }), ((x, y) -> {

            double x1 = x.getA() * y.getB() + x.getB() * y.getB();
            double y1 = x.getA() * y.getB() + x.getB() * y.getB();

            Number n = new Number();
            n.setA(x1);
            n.setB(y1);
            return n;
        }), (x, y) -> {

            double x1 = x.getA() * y.getB() + x.getB() * y.getB();
            double y1 = x.getA() * y.getB() + x.getB() * y.getB();

            Number n = new Number();
            n.setA(x1);
            n.setB(y1);
            return n;
        }
        );
        ComplexCalculator cC = new ComplexCalculator(((x, y) -> {

            double real = x.getA() + y.getA();
            double ima = x.getB() + y.getB();

            Number n = new Number();
            n.setA(real);
            n.setB(ima);
            return n;

        }), ((x, y) -> {

            double real = x.getA() - y.getA();
            double ima = x.getB() - y.getB();

            Number n = new Number();
            n.setA(real);
            n.setB(ima);
            return n;
        }), ((x, y) -> {

            double x1 = x.getA() * y.getB() + x.getB() * y.getB();
            double y1 = x.getA() * y.getB() + x.getB() * y.getB();

            Number n = new Number();
            n.setA(x1);
            n.setB(y1);
            return n;
        }), (x, y) -> {

            double x1 = x.getA() * y.getB() + x.getB() * y.getB();
            double y1 = x.getA() * y.getB() + x.getB() * y.getB();

            Number n = new Number();
            n.setA(x1);
            n.setB(y1);
            return n;
        }
        );

        do {

            System.out.println("1 - Relational calculator");
            System.out.println("2 - Vector calculator");
            System.out.println("3 - Complex calculator");
            System.out.println("4 - Exit program");
            a = scanner.nextInt();

            switch (a) {
                case 1:
                    System.out.println("Enter number x>");
                    double numa = scanner.nextDouble();

                    System.out.println("Enter number y>");
                    double numb = scanner.nextDouble();
                    System.out.println("Enter number x>");
                    double numas = scanner.nextDouble();

                    System.out.println("Enter number y>");
                    double numbc = scanner.nextDouble();
                    Number n1 = new Number();
                    Number n2 = new Number();

                    n1.setA(numa);
                    n1.setB(numb);
                    n2.setA(numas);
                    n2.setB(numbc);

                    System.out.println("Choose operation");
                    System.out.println("1 - add");
                    System.out.println("2 - subtract");
                    System.out.println("3 - multiply");
                    System.out.println("4 - divide");
                    System.out.println("5 - enter numbers again");
                    int ca = scanner.nextInt();
                    switch (ca) {
                        case 1:
                            Number na = rC.add(n1, n2);

                            System.out.println("Ergebnis");
                            System.out.println("a =" + na.getA());
                            System.out.println("b =" + na.getB());

                            break;
                        case 2:
                            Number ns = rC.subtract(n1, n2);
                            System.out.println("Ergebnis");
                            System.out.println("a =" + ns.getA());
                            System.out.println("b =" + ns.getB());

                            break;
                        case 3:
                            Number nm = rC.multiply(n1, n2);
                            System.out.println("Ergebnis");
                            System.out.println("a =" + nm.getA());
                            System.out.println("b =" + nm.getB());
                            break;
                        case 4:
                            Number nd = rC.divide(n1, n2);
                            System.out.println("Ergebnis");
                            System.out.println("a =" + nd.getA());
                            System.out.println("b =" + nd.getB());
                            break;
                        case 5:

                            break;
                        default:
                            break;

                    }

                    break;
                case 2:

                    System.out.println("Enter number x>");
                    double numara = scanner.nextDouble();

                    System.out.println("Enter number y>");
                    double numbaba = scanner.nextDouble();
                    System.out.println("Enter number x>");
                    double numasasa = scanner.nextDouble();

                    System.out.println("Enter number y>");
                    double numbcas = scanner.nextDouble();
                    Number n3 = new Number();
                    Number n4 = new Number();

                    n3.setA(numara);
                    n4.setB(numbaba);
                    n3.setB(numasasa);
                    n4.setA(numbcas);

                    System.out.println("Choose operation");
                    System.out.println("1 - add");
                    System.out.println("2 - subtract");
                    System.out.println("3 - multiply");
                    System.out.println("4 - divide");
                    System.out.println("5 - enter numbers again");
                    int cas = scanner.nextInt();
                    switch (cas) {
                        case 1:
                            Number nav = vC.add(n3, n4);

                            System.out.println("Ergebnis");
                            System.out.println("a =" + nav.getA());
                            System.out.println("b =" + nav.getB());

                            break;
                        case 2:
                            Number nave = vC.subtract(n3, n4);

                            System.out.println("Ergebnis");
                            System.out.println("a =" + nave.getA());
                            System.out.println("b =" + nave.getB());

                            break;
                        case 3:
                            Number naver = vC.multiply(n3, n4);

                            System.out.println("Ergebnis");
                            System.out.println("a =" + naver.getA());
                            System.out.println("b =" + naver.getB());
                            break;
                        case 4:
                            Number naves = vC.divide(n3, n4);

                            System.out.println("Ergebnis");
                            System.out.println("a =" + naves.getA());
                            System.out.println("b =" + naves.getB());
                            break;
                        case 5:
                            break;
                        default:
                            break;

                    }

                    break;
                case 3:
                    System.out.println("Enter number x>");
                    int numbab1 = scanner.nextInt();

                    System.out.println("Enter number y>");
                    int nubebe = scanner.nextInt();
                    System.out.println("Enter number x>");
                    int numbabe = scanner.nextInt();

                    System.out.println("Enter number y>");
                    int nubebee = scanner.nextInt();

                    System.out.println("Choose operation");
                    int caso = scanner.nextInt();
                    Number n5 = new Number();
                    n5.setA(numbab1);
                    n5.setB(nubebe);
                    Number n6 = new Number();
                    n6.setA(numbabe);
                    n6.setB(nubebee);
                    switch (caso) {
                        case 1:
                            Number numerere1 = cC.add(n5, n6);

                            System.out.println("Ergebnis");
                            System.out.println("a =" + numerere1.getA());
                            System.out.println("b =" + numerere1.getB());

                            break;
                        case 2:
                            Number numerere2 = cC.subtract(n5, n6);

                            System.out.println("Ergebnis");
                            System.out.println("a =" + numerere2.getA());
                            System.out.println("b =" + numerere2.getB());

                            break;
                        case 3:
                            Number numerere3 = cC.multiply(n5, n6);

                            System.out.println("Ergebnis");
                            System.out.println("a =" + numerere3.getA());
                            System.out.println("b =" + numerere3.getB());

                            break;
                        case 4:
                            Number numerere4 = cC.divide(n5, n6);

                            System.out.println("Ergebnis");
                            System.out.println("a =" + numerere4.getA());
                            System.out.println("b =" + numerere4.getB());

                            break;
                        case 5:
                            break;
                        default:
                            break;

                    }
                    break;
                
                default:
                    break;

            }
        } while (a != 5);

    }
}

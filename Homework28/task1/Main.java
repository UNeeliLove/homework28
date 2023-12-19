package kg.attractor.java.task1;

public class Main {


        public static void main(String[] args) {

            var cats = Cat.makeCats(10);
            Printer.print(cats);

            cats.sort((cat1, cat2) -> cat1.getBreed().compareTo(cat2.getBreed()));
            Printer.print(cats);

            cats.sort((cat1, cat2) -> {
                if (cat1.getName().equals(cat2.getName())) {
                    return Integer.compare(cat1.getAge(), cat2.getAge());
                }
                return cat1.getName().compareTo(cat2.getName());
            });
            Printer.print(cats);

            cats.removeIf(cat -> cat.getColor() == Cat.Color.TABBY);
            Printer.print(cats);

            cats.removeIf(cat -> cat.getName().length() == 5);
            Printer.print(cats);
        }
    }

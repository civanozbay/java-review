package Task_Stream_3;

import java.util.Comparator;
import java.util.Optional;

import static java.util.Comparator.comparing;

public class TransactionTest {
    public static void main(String[] args) {

        //1-Find all transactions in 2011 and in sort by value
        System.out.println("*******Task-1*********");
        TransactionData.getAll().stream()
                .filter(transaction -> transaction.getYear()==2011)
                .sorted(comparing(Transaction::getValue))
                .forEach(System.out::println);

        //2- What are all the unique cities where the traders work ?
        System.out.println("*******Task-2*********");
        TransactionData.getAll().stream()
                .map(transaction -> transaction.getTrader().getCity())
                .distinct()
                .forEach(System.out::println);

        //3- Find all traders from Cambridge and sort them by name
        System.out.println("*******Task-3*********");
        TransactionData.getAll().stream()
                .map(transaction -> transaction.getTrader())
                .filter(trader -> trader.getCity()=="Cambridge")
                .distinct()
                .sorted(comparing(Trader::getName))
                .forEach(System.out::println);

        //4- Return a string of all traders names sorted alphabetically
        System.out.println("*******Task-4*********");
        String reduce = TransactionData.getAll().stream()
                .map(transaction -> transaction.getTrader().getName())
                .distinct()
                .sorted()
                .reduce("", (name1, name2) -> name1 + name2 + " ");
        System.out.println(reduce);


        //5-Are any traders based in milan
        System.out.println("*******Task-5*********");
        boolean milan = TransactionData.getAll().stream()
                .anyMatch(transaction -> transaction.getTrader().getCity().equals("Milan"));
        System.out.println(milan);

        //6- print the values of all transactions from the traders living in Cambridge
        System.out.println("*******Task-6*********");
        TransactionData.getAll().stream()
                .filter(transaction -> transaction.getTrader().getCity().equals("Cambridge"))
                .map(Transaction::getValue)
                .forEach(System.out::println);

        //7- What is the highest value of all the transactions
        System.out.println("*******Task-7*********");
        Optional<Integer> high = TransactionData.getAll().stream()
                .map(transaction -> transaction.getValue())
                .reduce(Integer::max); // since we dont declare the initial value we assign to optinal
        System.out.println(high);

        //8-Find the  transaction with the smallest value
        System.out.println("*******Task-8*********");
        Optional<Transaction> smallValue = TransactionData.getAll().stream()
                .reduce((t1, t2) -> t1.getValue() < t2.getValue() ? t1 : t2);
        System.out.println(smallValue);

        // you can also write like this
        Optional<Transaction> min = TransactionData.getAll().stream()
                .min(comparing(Transaction::getValue));
    }
}

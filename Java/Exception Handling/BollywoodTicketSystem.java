package sj;

import java.util.Scanner;

class BollywoodTicketSystem {
    static int ticketPrice = 200;
    static int maxAvailableTickets = 50;
    static String movieName = "3 Idiots";
    int remainTickets;
    int ticket;
    int Tbill;

    static int getTicketPrice() {
        return ticketPrice;
    }

    static void setTicketPrice(int ticketPrice) {
        BollywoodTicketSystem.ticketPrice = ticketPrice;
    }

    static int getMaxAvailableTickets() {
        return maxAvailableTickets;
    }

    void remain() {
        this.remainTickets = getMaxAvailableTickets();
    }

    static void setMaxAvailableTickets(int maxAvailableTickets) {
        BollywoodTicketSystem.maxAvailableTickets = maxAvailableTickets;
        System.out.println(getMaxAvailableTickets());
    }

    BollywoodTicketSystem(int tn) {
        this.ticket = tn;
    }

    void validate() throws InvalidTicketNumberException, TicketSoldOutException {
        if (this.ticket <= 0) {
            throw new InvalidTicketNumberException();
        }
        Activity();
        if (BollywoodTicketSystem.maxAvailableTickets <= 0) {
            throw new TicketSoldOutException();
        }
        System.out.println("Tickets are confirm! Enjoy Your show..");
        TotalCost();
        toString();
    }

    void Activity() {
        setMaxAvailableTickets(BollywoodTicketSystem.maxAvailableTickets - ticket);
    }

    void TotalCost() {
        this.Tbill = BollywoodTicketSystem.ticketPrice * this.ticket;
    }

    public String toString() {
        return "Movies Name:- " + BollywoodTicketSystem.movieName +
               "\n Total Tickets:- " + this.ticket +
               "\n Total cost:- " + this.Tbill;
    }
}

class InvalidTicketNumberException extends Exception {
    public String toString() {
        return "Please Enter of ticket above 0";
    }
}

class TicketSoldOutException extends Exception {
    public String toString() {
        return "All tickets are sold out!";
    }
}

class DemoTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Welcome to Show! you want to goi in kindly press 1 for exit 0:- ");
        int choice = sc.nextInt();

        while (choice != 0) {
            System.out.println("Welcome!");
            System.out.println("Movie Name:- 3 Idiots\n Price :- 200 rs Ticket");
            System.out.print("Enter number of Tickets you want to purchase:- ");
            int ticket = sc.nextInt();
            BollywoodTicketSystem b1 = new BollywoodTicketSystem(ticket);
            try {
                b1.validate();
                System.out.println(b1);
            }
            catch (InvalidTicketNumberException a) {
                System.out.println(a);
            }
            catch (TicketSoldOutException b) {
                System.out.println(b);
            }
            System.out.print("Welcome to Show! you want to goi in kindly press 1 for exit 0:- ");
            System.out.println("\nremain tickets:- " + BollywoodTicketSystem.getMaxAvailableTickets());
            sc.nextInt();

        }
    }
}

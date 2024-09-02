public class TicketPrinterTwo {
    public static void main(String[] args) {
        int ticketNumber = 200000;

        // Печать билетов от 200000 до 210000
        while (ticketNumber <= 210000) {
            System.out.println(ticketNumber);
            ticketNumber++;
        }

        // Переход к следующему диапазону
        ticketNumber = 220000;

        // Печать билетов от 220000 до 235000
        while (ticketNumber <= 235000) {
            System.out.println(ticketNumber);
            ticketNumber++;
        }
    }
}

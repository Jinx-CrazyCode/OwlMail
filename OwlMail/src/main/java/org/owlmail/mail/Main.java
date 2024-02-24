package org.owlmail.mail;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String purple = "\u001B[35m";
        String reset = "\u001B[0m";


            System.out.println(purple + "                          ████  ██████   ██████            ███  ████\n" +
                    "                         ░░███ ░░██████ ██████            ░░░  ░░███ \n" +
                    "  ██████  █████ ███ █████ ░███  ░███░█████░███   ██████   ████  ░███ \n" +
                    " ███░░███░░███ ░███░░███  ░███  ░███░░███ ░███  ░░░░░███ ░░███  ░███ \n" +
                    "░███ ░███ ░███ ░███ ░███  ░███  ░███ ░░░  ░███   ███████  ░███  ░███ \n" +
                    "░███ ░███ ░░███████████   ░███  ░███      ░███  ███░░███  ░███  ░███ \n" +
                    "░░██████   ░░████░████    █████ █████     █████░░████████ █████ █████ \n" +
                    "░░░░░░     ░░░░ ░░░░    ░░░░░ ░░░░░     ░░░░░  ░░░░░░░░ ░░░░░ ░░░░░ ");
            System.out.println(purple + "1 - Send Email Outlook \n" +
                    "2 - Credits \n" +
                    "3 - Exit");
            while(true) {
            System.out.print(purple + "[OwlMail] - > " + reset);
                int choice = input.nextInt();
                input.nextLine();
                switch (choice) {

                    case 1:
                        System.out.print(purple + "Insert your Outlook Email: " + reset);
                        String sender = input.nextLine();
                        System.out.print(purple + "Insert your outlook email Password: " + reset);
                        String password = input.nextLine();
                        System.out.print(purple + "Insert Subject Email: " + reset);
                        String subject = input.nextLine();
                        System.out.print(purple + "Insert Message Email: " + reset);
                        String msg = input.nextLine();
                        System.out.print(purple + "Insert Receiver Email: " + reset);
                        String receiver = input.nextLine();
                        System.out.print(purple + "Insert spam number email: " + reset);
                        int spam = input.nextInt();
                        input.nextLine();
                        Mail mail = new Mail(sender, password, subject, msg, receiver);
                        for (int i = 0; i < spam; i++) {
                            mail.sendEmail();
                        }
                        System.out.println(" ");
                        try {
                            Thread.sleep(2000);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                        break;

                    case 2:

                        System.out.println(purple + "Made: Oracle");
                        System.out.println("Version: 1.0");
                        System.out.println("Discord: https://discord.gg/kna6EtAfhK" + reset);
                        System.out.println(" ");
                        try {
                            Thread.sleep(4000);

                        } catch (InterruptedException e) {
                         throw new RuntimeException(e);
                        }
                        break;

                    case 3:
                        System.out.println("Thank you for using OwlMail");
                        break;
                }
                
                if (choice == 3) {
                    break;
            }
        }
    }
}

package com.addressbookproblems;

import java.util.ArrayList;
import java.util.Scanner;

public class AddContact {
        Scanner scan = new Scanner(System.in);
        ArrayList<CreateContact> person; //ArrayList for ContactUc1

        /*
         * Creating Constructor with arraylist
         */
        public AddContact() {
            person = new ArrayList<CreateContact>();
        }

        public void addPerson() {
            System.out.println("Enter Fisrt Name ");
            String fname = scan.next();

            System.out.println("Enter Last Name ");
            String last = scan.next();

            System.out.println("Enter Address ");
            String address = scan.next();

            System.out.println("Enter City ");
            String city = scan.next();

            System.out.println("Enter State ");
            String state = scan.next();

            System.out.println("Enter Zip Code ");
            String zip = scan.next();

            System.out.println("Enter Phone Number ");
            String pno = scan.next();

            System.out.println("Enter Email ");
            String email = scan.next();

            CreateContact contact = new CreateContact(fname, last, address, city, state, zip, pno, email);
            /*
             *adding above details to contact arrayList
             */
            person.add(contact);
            /*
             * printing contact
             */
            System.out.println(contact);
        }

        public static void main(String[] args) {
            System.out.println("Welcome to Address Book Program..!");

            /*
             * Creating Object of Contact
             */
            CreateContact cont = new CreateContact(" Mohamad ", " Fakir ", " Karnal", " Sangli ", "Maharastra ", "416416 ", "7219164272 ",
                    "mohamadjaid786@gmail.com ");
            System.out.print(cont.getFirstName());
            System.out.println(cont.getLastName());
            System.out.println(cont.getCity());
            System.out.println(cont.getState());
            System.out.println(cont.getZip());
            System.out.println(cont.getPhoneNumber());
            System.out.println(cont.getEmail());

            AddContact ap = new AddContact();
            ap.addPerson();

        }
}

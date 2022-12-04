package com.addressbookproblems;

import java.util.ArrayList;
import java.util.Scanner;

public class DeleteContact {
        Scanner scan = new Scanner(System.in);
        ArrayList<CreateContact> person;

        public DeleteContact() {
            person = new ArrayList<>();
        }

        public CreateContact addPerson() {
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
            person.add(contact);
            System.out.println(contact);
            return contact;
        }

        public void editName() {
            System.out.println("Enter Name to Edit");
            String edit = scan.next();
            EditExistingContact app = new EditExistingContact();

            for(int i=0; i< person.size();i++) {
                CreateContact name = (CreateContact) person.get(i);
                if(edit.equals(name.getFirstName())) {
                    System.out.println(name);
                    name = app.addPerson();
                    for(int j=0; j<person.size(); j++) {
                        person.set(j, name);
                    }
                }
                else {
                    System.out.println("Given information is Not present");
                }
            }
        }

        public void delete() {
            System.out.println("Enter name to Delete");
            String del = scan.next();

            for (int i=0; i< person.size(); i++) {
                CreateContact name = (CreateContact)person.get(i);
                if(del.equals(name.getFirstName())) {
                    System.out.println(name);
                    person.remove(i);
                    System.out.println("Contact Deleted");
                }
                else {
                    System.out.println("Contact not found");
                }
            }
        }

        public static void main(String[] args) {
            System.out.println("Welcome to Address Book Program..!");

            CreateContact cont = new CreateContact("Mohamad ", "Fakir ", "Karnal ", "Sangli ", "Maharastra ", "416416 ", "7219164272 ",
                    "mohamadjaid786@gmail.com ");
            System.out.print(cont.getFirstName());
            System.out.println(cont.getLastName());
            System.out.println(cont.getCity());
            System.out.println(cont.getState());
            System.out.println(cont.getZip());
            System.out.println(cont.getPhoneNumber());
            System.out.println(cont.getEmail());

            DeleteContact ap = new DeleteContact();
            ap.addPerson();
            ap.editName();
            ap.delete();
        }
}

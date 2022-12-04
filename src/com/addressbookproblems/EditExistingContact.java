package com.addressbookproblems;


import java.util.ArrayList;
import java.util.Scanner;

public class EditExistingContact {
        
        Scanner scan = new Scanner(System.in);
        ArrayList<CreateContact> person;
        public EditExistingContact() {
            person = new ArrayList<CreateContact>();
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

        public static void main(String[] args) {
            System.out.println("Welcome to Address Book Program..!");

            CreateContact cont = new CreateContact("Shamashoddin ", "Fakir ", "Karnal ", "Sangli ", "Maharastra ", "416416 ", "7757987242 ",
                    "deven@gmail.com ");
            System.out.print(cont.getFirstName());
            System.out.println(cont.getLastName());
            System.out.println(cont.getCity());
            System.out.println(cont.getState());
            System.out.println(cont.getZip());
            System.out.println(cont.getPhoneNumber());
            System.out.println(cont.getEmail());

            EditExistingContact ap = new EditExistingContact();
            ap.addPerson();
            ap.editName();
        }

    }

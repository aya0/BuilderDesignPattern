package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
            //     User user = new User("aya" , 20 , "aya@gmail.com" , "Active" ,"AL-tirah" , " 1999029039" );


                 User user = new User.Builder().
                         setName("aya")
                         .setAge(20)
                         .builder();

                 User user1 = new User.Builder().
                         setName("Raya")
                         .setAge(19)
                         .builder();

                 User user2 = new User.Builder().
                         setName("Malak")
                         .setAge(16)
                         .builder();

                 System.out.println( user.toString() );
                 System.out.println( user1.toString() );
                 System.out.println( user2.toString() );
                 System.out.println( User.getId() );

        }
    }

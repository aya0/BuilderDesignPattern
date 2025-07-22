package org.example;

public class User {
    private static int  id =0  ;
    private String name ;
    private int age ;
    private String email;
    private String type ;
    private String address;
    private String phone ;

    /*  constructor here is private because i need him to make instanace from bulider only    */
    private User(Builder builder){
        id ++;
        this.name = builder.name;
        this.age = builder.age ;
        this.email = builder.email;
        this.type = builder.type;
        this.address =builder. address;
        this.phone = builder.phone;

    }

    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        User.id = id;
    }
    /*   This The main way to make object from class by para constracoter
     *
     *
     *
    User(String name , int age , String email , String type , String address , String phone ){
        id++;
        this.name = name;
        this.age = age ;
        this.email = email;
        this.type = type;
        this.address = address;
        this.phone = phone;

    }

     */



    public static class Builder{

        private static int  id =0  ;
        private String name ;
        private int age ;
        private String email;
        private String type ;
        private String address;
        private String phone ;

     /*  setters here return bulider to allow chaning to make bulid for constr */
        public Builder setType(String type) {
            this.type = type;
            return this ;
        }

        public Builder  setName(String name) {
            this.name = name;
            return this ;
        }

        public Builder  setAge(int age) {
            this.age = age;
            return this ;
        }

        public Builder  setEmail(String email) {
            this.email = email;
            return this ;
        }

        public Builder  setAddress(String address) {
            this.address = address;
            return this ;
        }

        public Builder  setPhone(String phone) {
            this.phone = phone;
            return this ;
        }


        public User builder(){
            return new User(this);
        }
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                ", type='" + type + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}

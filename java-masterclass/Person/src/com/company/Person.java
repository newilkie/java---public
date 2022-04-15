package com.company;

public class Person {
    private String firstName = null;
    private String lastName = null;
    private int age = 0;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        if(age > 100 || age < 0){
            age = 0;
        }else{
            this.age = age;
        }
    }

    public boolean isTeen(){
        if(age > 12 && age < 20){
            return true;
        }else{
            return false;
        }
    }

    public String getFullName(){
        if(lastName.isEmpty() && firstName.isEmpty()){
            return "";
        }else if(lastName.isEmpty()){
            return firstName;
        }else if(firstName.isEmpty()){
            return lastName;
        }else{
            return (firstName + " " + lastName);
        }
    }
}

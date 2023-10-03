/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package work04;

/**
 *
 * @author Advice
 */
public class Person {
    private int id;

    public Person(int userid) {
        id = userid;
    }

    public int getId() {
        return id;
    }

    public void setId(int newid) {
        this.id = newid;
    }
    @Override
    public String toString(){
        return "id" + id;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recap;

/**
 *
 * @author EVI
 */
public class PersonD {
    
    private String name;
    private int age;
    private Dog skyli;

    public PersonD() {
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public PersonD(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Dog getSkyli() {
        return skyli;
    }

    public void setSkyli(Dog skyli) {
        this.skyli = skyli;
    }

    public PersonD(String name, int age, Dog skyli) {
        this.name = name;
        this.age = age;
        this.skyli = skyli;
    }

    @Override
    public String toString() {
        return "PersonD{" + "name=" + name + ", age=" + age + ", skyli=" + skyli + '}';
    }
    
    
    
    
}

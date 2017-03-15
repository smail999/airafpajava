/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

/**
 *
 * @author Formation
 */
public class Functions {
private int id ;
private String definition ;

    public Functions(int id, String definition) {
        this.id = id;
        this.definition = definition;
    }

    public int getId() {
        return id;
    }

    public String getDefinition() {
        return definition;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDefinition(String definition) {
        this.definition = definition;
    }

}

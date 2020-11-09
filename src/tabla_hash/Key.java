/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tabla_hash;

/**
 *
 * @author JOSED
 * @param <T>
 * @param <V>
 */
public class Key <T> {

    private int hash;
    private T valor;
    private boolean delited;
    
    public Key(int hash, T valor){
        this.hash = hash;
        this.valor = valor;
        this.delited = false;
    }
    
    
    //Get & Set

    public int getHash() {
        return hash;
    }

    public void setHash(int hash) {
        this.hash = hash;
    }

    public T getValor() {
        return valor;
    }

    public void setValor(T valor) {
        this.valor = valor;
    }
    
    public boolean isDelited(){
        return this.delited;
    }
    
    public void setDelited(){
        this.delited = true;
    }
}

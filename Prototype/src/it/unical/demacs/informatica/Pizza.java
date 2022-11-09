package it.unical.demacs.informatica;



public abstract class Pizza implements Cloneable{
    protected String nome;
    protected String ingredienti;



    public String getNome(){
        return nome;
    }

    public String getIngredienti(){
        return ingredienti;
    }

    public void setNome(String nome){
        this.nome=nome;
    }


    public Object clone(){
        Object clone= null;
        try{
            clone=super.clone();
        } catch(CloneNotSupportedException e){
            e.printStackTrace();
        }

        return clone;
    }

}

package com.sprite.characters;

/**
 * Created with IntelliJ IDEA.
 * User: fran
 * Date: 08/09/2013
 * Time: 10:38
 * To change this template use File | Settings | File Templates.
 */
public  class ProtoElf extends ProtoCharacter implements Cloneable{


    @Override
    public void loadInitValues() {
        setHealth(90);
        setLevel(1);
        setScore(1);
    }

    public Object clone(){
        return  this.clone();
    }

    public Integer deepSearch(){
        return 1;
    }




}

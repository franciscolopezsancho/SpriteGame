package com.sprite.characters;

/**
 * Created with IntelliJ IDEA.
 * User: fran
 * Date: 08/09/2013
 * Time: 11:03
 * To change this template use File | Settings | File Templates.
 */
public class ProtoDwarf extends ProtoCharacter {



    @Override
    public void loadInitValues() {
       setHealth(100);
       setLevel(1);
       setScore(1);
    }

    public Object clone(){
          return  this.clone();
    }

    public Integer cutHead(){
          return 1;
    }

}

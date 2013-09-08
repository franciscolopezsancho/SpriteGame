package com.sprite.characters;

/**
 * Created with IntelliJ IDEA.
 * User: fran
 * Date: 08/09/2013
 * Time: 10:38
 * To change this template use File | Settings | File Templates.
 */
public  abstract class ProtoCharacter implements Character,Cloneable {

    Integer score;
    Integer health;
    Integer level;


    public void damaged(Integer damage){
           health -= damage;
    }

    public void levelUp(){
        level +=1;
    }
    public void addExperience(Integer experience){
            score += experience;
    }





    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public Integer getHealth() {
        return health;
    }

    public void setHealth(Integer health) {
        this.health = health;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }
}

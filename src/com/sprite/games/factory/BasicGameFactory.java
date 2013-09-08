package com.sprite.games.factory;

import com.sprite.tiles.Tile;

/**
 * Extend to create different games with diferent Characters and Tiles.
 * createCharacters and createTiles must be overridden to create different games.
 */
public class BasicGameFactory {



    Character[] characters;
    Tile[] tiles;

    public void createSprite() {
        setCharacters(createCharacters());
        setTiles(createTiles());

        //some other method to create basic configurations of a game.

    }





    public Character[] createCharacters() {
        return (Character[]) new Character[0];
    }


    public Tile[] createTiles() {
        return new Tile[0];
    }


    public Character[] getCharacters() {
        return characters;
    }

    public void setCharacters(Character[] characters) {
        this.characters = characters;
    }

    public Tile[] getTiles() {
        return tiles;
    }

    public void setTiles(Tile[] tiles) {
        this.tiles = tiles;
    }
}

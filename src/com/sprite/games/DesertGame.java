package com.sprite.games;

import com.sprite.games.factory.BasicGameFactory;
import com.sprite.tiles.Tile;

/**
 * Created with IntelliJ IDEA.
 * User: fran
 * Date: 08/09/2013
 * Time: 10:58
 * To change this template use File | Settings | File Templates.
 */
public class DesertGame extends BasicGameFactory {





    public Character[] createCharacters() {
        Character[] characters = null ;
        //checkDataBase....WebService.. ->   creation of Characters
        return characters;
    }


    public Tile[] createTiles() {
        Tile[] tiles = null;
        //checkDataBase....WebService.. ->   creation of tiles through TilesFactory
        //some context could be used  as Flyweight Context
        return tiles;
    }
}

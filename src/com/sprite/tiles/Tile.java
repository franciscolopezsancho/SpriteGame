package com.sprite.tiles;

/**
 * Created with IntelliJ IDEA.
 * User: fran
 * Date: 08/09/2013
 * Time: 11:31
 * To change this template use File | Settings | File Templates.
 */
public interface Tile {

    enum TileTypes{STONE("StoneTile"),TREE("TreeTile");
         private String className;
        TileTypes(String className) {
            this.className = className;
        }
        public String getClassName(){
            return this.className;
        }
    };

    void setImage(String imageUrl);
}

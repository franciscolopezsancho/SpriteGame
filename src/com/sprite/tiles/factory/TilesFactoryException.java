package com.sprite.tiles.factory;

/**
 * Created with IntelliJ IDEA.
 * User: fran
 * Date: 08/09/2013
 * Time: 14:24
 * To change this template use File | Settings | File Templates.
 */
public class TilesFactoryException extends Exception {


    TilesFactoryException(Throwable t){
        super("Tile couldn't been made. Check error",t);
    }

}

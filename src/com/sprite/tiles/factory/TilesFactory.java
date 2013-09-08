package com.sprite.tiles.factory;

import com.sprite.tiles.Tile;

import java.util.HashMap;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: fran
 * Date: 08/09/2013
 * Time: 10:54
 * To change this template use File | Settings | File Templates.
 */
public class TilesFactory {

    private Map<Tile.TileTypes,Tile> tiles = new HashMap<Tile.TileTypes, Tile>();

    /**
     * Obtains tile from a pool. If is not yet there it will create it an add it to the pool.
     * @param tileName
     * @return
     * @throws TilesFactoryException
     */
    public Tile getTile(Tile.TileTypes tileName) throws TilesFactoryException {
        Tile tile = tiles.get(tileName);
        if(tile == null){
            try {
                Class<?> c = Class.forName(tileName.getClassName());
                tile = (Tile) c.newInstance();
            } catch (Exception e) {
                throw  new TilesFactoryException(e);
            }
        }
        return tile;
    }


}

using System.Collections;
using System.Collections.Generic;
using UnityEngine;
using UnityEngine.Tilemaps;

public class TilemapController : MonoBehaviour
{
    public Tilemap tilemap;
    public int[,] tileArray;

    void Start()
    {
        tilemap.CompressBounds();
        BoundsInt bound = tilemap.cellBounds;
        tileArray = new int[bound.size.y, bound.size.x];

        for (int i = bound.yMax - 1; i > bound.yMin - 1; i--)
        {
            for (int j = bound.xMin; j < bound.xMax; j++)
            {
                Vector3Int tilePos = new Vector3Int(j, i, 0);

                TileBase tBase = tilemap.GetTile(tilePos);

                if (tBase.name.Substring(0, 4) == "Soil")
                    tileArray[bound.yMax - 1 - i, j - bound.xMin] = 1;

                else
                    tileArray[bound.yMax - 1 - i, j - bound.xMin] = 0;

            }
        }
    }
}

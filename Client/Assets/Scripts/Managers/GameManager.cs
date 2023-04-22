using System.Collections;
using System.Collections.Generic;
using UnityEngine;
using UnityEngine.EventSystems;

public class GameManager
{
    public int coin;
    public Tower selectedTower;
    public GameObject towerOptions;



    public void Pause()
    {
        Time.timeScale = 0;
    }

    public void Resume()
    {
        Time.timeScale = 1;
    }

    public void TowerSelect()
    {

    }
}

using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class UI_TowerOption : MonoBehaviour
{
    void Awake()
    {
        Managers.Game.towerOptions = gameObject;
    }


    void Update()
    {
        if (Managers.Game.selectedTower == null || Managers.Game.selectedTower.transform != gameObject.transform.parent)
            gameObject.SetActive(false);
    }
}

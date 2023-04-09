using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class GameManager : MonoBehaviour
{
    public GameObject gameScene;

    public void GoInGame()
    {
        gameScene.SetActive(true);
    }
}

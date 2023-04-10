using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class UIs : MonoBehaviour
{
    public GameManager manager;

    public void OpenUI(GameObject opens)
    {
        opens.SetActive(true);
    }

    public void CloseUI(GameObject go)
    {
        go.SetActive(false);
    }

    public void Pause()
    {
        manager.Pause();
    }

    public void Resume()
    {
        manager.Resume();
    }
}

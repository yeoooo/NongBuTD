using System.Collections;
using System.Collections.Generic;
using UnityEngine;
using UnityEngine.SceneManagement;

public class UIs : MonoBehaviour
{
    public void OpenUI(GameObject opens)
    {
        if (opens.activeSelf)
            return;

        opens.SetActive(true);
        Debug.Log($"{opens.name}");
    }

    public void CloseUI(GameObject go)
    {
        go.SetActive(false);
    }

    public void Pause()
    {
        if (Time.timeScale == 0)
            return;

        Managers.Game.Pause();
        Debug.Log("pause");
    }

    public void Resume()
    {
        if (Time.timeScale != 0)
            return;

        Managers.Game.Resume();
        Debug.Log("resume");
    }

    public void QuitGame()
    {
        Application.Quit();
        Debug.Log("quitGame");
    }

    public void LoadScene(int idx)
    {
        Debug.Log("LoadScene");
        SceneManager.LoadScene(idx);
    }
}

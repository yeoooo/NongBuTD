using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class UIs : MonoBehaviour
{
    public void CloseUI()
    {
        gameObject.SetActive(false);
    }

    public void OpenUI(GameObject opens)
    {
        opens.SetActive(true);
    }

}

using System.Collections;
using System.Collections.Generic;
using TMPro;
using UnityEngine;
using UnityEngine.UI;

public class UI_CoinText : MonoBehaviour
{

    void Update()
    {
        gameObject.GetComponent<TextMeshProUGUI>().text = Managers.Game.coin.ToString();
    }
}

using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class Crops : MonoBehaviour
{
    public int cost;
    public float earningTime;
    public int income;

    void Start()
    {
        StartCoroutine(Earn());
    }

    IEnumerator Earn()
    {
        while (true)
        {
            yield return new WaitForSeconds(earningTime);

            // ����ȹ��
            Managers.Game.coin += income;
        }
    }
}

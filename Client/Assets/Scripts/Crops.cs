using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class Crops : MonoBehaviour
{
    public int cost;
    public float earningTime;

    void Start()
    {
        StartCoroutine(Earn());
    }

    IEnumerator Earn()
    {
        while (true)
        {
            yield return new WaitForSeconds(earningTime);

            // ƒ⁄¿Œ»πµÊ
        }
    }
}

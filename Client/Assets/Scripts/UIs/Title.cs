using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class Title : MonoBehaviour
{
    float count = 0;

    void Update()
    {
        transform.position = new Vector3(transform.position.x, transform.position.y + Mathf.Sin(count) * 0.5f, transform.position.z);

        count += 0.1f;

        if (count >= 314)
            count = 0;
    }
}

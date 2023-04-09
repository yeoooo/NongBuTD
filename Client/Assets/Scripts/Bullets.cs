using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class Bullets : MonoBehaviour
{
    public float speed;
    public float atk;
    public Tower tower;
    public Enemy target;
    public Vector3 lastPos;

    void Awake()
    {
        tower = transform.parent.GetComponent<Tower>();
        atk = tower.atk;
        target = tower.target;
    }

    void Update()
    {
        DestinationUpdate();
        Move();
    }

    void DestinationUpdate()
    {
        if (target == null)
            return;

        lastPos = target.transform.position;
    }

    void Move()
    {
        transform.position += (lastPos - transform.position).normalized * speed * Time.deltaTime;

        if (Vector3.Distance(transform.position, lastPos) <= 0.05f)
        {
            Destroy(gameObject);

            if (target != null)
                target.hp -= atk;
        }
    }

}

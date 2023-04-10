using System.Collections;
using System.Collections.Generic;
using System.Linq;
using Unity.VisualScripting;
using UnityEngine;

public class Tower : MonoBehaviour
{
    public float atkRange;
    public float atk;
    public float atkSpeed;
    public int cost;
    public bool shotDelay;

    public Enemy target;
    public GameObject bullet;

    void Update()
    {

        if (target == null)
            EnemyScan();
    }

    void EnemyScan()
    {
        RaycastHit2D[] hits = Physics2D.CircleCastAll(transform.position, atkRange, Vector2.zero, 0, LayerMask.GetMask("Enemy"));

        if (hits.Length < 1)
            return;

        target = hits[0].transform.GetComponent<Enemy>();

        Attack(target);
    }

    void Attack(Enemy target)
    {
        if (shotDelay)
            return;

        StartCoroutine(CoAttack());
    }

    IEnumerator CoAttack()
    {
        Shot(target);
        shotDelay = true;

        yield return new WaitForSeconds(atkSpeed);
        shotDelay = false;

        Vector3 targetPos = target.transform.position;
        float distance = Vector3.Distance(transform.position, targetPos);

        if (distance > atkRange)
        {
            target = null;
            yield break;
        }

        Attack(target);
    }


    void Shot(Enemy target)
    {
        Instantiate(bullet, transform);
    }

    private void OnDrawGizmosSelected()
    {
        Gizmos.color = Color.red;
        Gizmos.DrawWireSphere(transform.position, atkRange);
    }
}

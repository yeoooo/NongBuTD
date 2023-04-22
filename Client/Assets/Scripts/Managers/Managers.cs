using System.Collections;
using System.Collections.Generic;
using TMPro;
using UnityEngine;
using UnityEngine.SceneManagement;

public class Managers : MonoBehaviour
{

    public bool isInGame;
    public float rayDistance = 10f;
    public Tower selectedTower;

    static Managers instance;


    public static Managers Instance { get { Init(); return instance; } }


    UserInfo user = new UserInfo();
    GameManager game = new GameManager();
    SceneManagerEX scene = new SceneManagerEX();

    public static GameManager Game { get { return Instance.game; } }
    public static UserInfo User { get { return Instance.user; } }
    public static SceneManagerEX Scene { get { return Instance.scene; } }

    void Start()
    {
        Init();
    }

    void Update()
    {
        if (Input.GetMouseButtonUp(0))
            InputControl();
    }

    static void Init()
    {
        if (instance == null)
        {
            GameObject go = GameObject.Find("@Managers");

            if (go == null)
            {
                go = new GameObject("@Managers");
                go.AddComponent<Managers>();
            }

            DontDestroyOnLoad(go);
            instance = go.GetComponent<Managers>();
        }
    }

    void InputControl()
    {
        Vector2 mousePosition = Camera.main.ScreenToWorldPoint(Input.mousePosition);
        RaycastHit2D hit = Physics2D.Raycast(mousePosition, Vector2.zero, rayDistance, LayerMask.GetMask("Tower"));

        if (hit.collider != null)
        {
            Debug.Log(hit.collider.name);
            Game.selectedTower = hit.transform.GetComponent<Tower>();
            game.towerOptions.transform.SetParent(hit.transform);
            game.towerOptions.transform.position = hit.transform.position;
            game.towerOptions.gameObject.SetActive(true);
        }

        else
        {
            Game.selectedTower = null;
        }
    }

}

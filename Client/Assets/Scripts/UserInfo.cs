using System.Collections;
using System.Collections.Generic;
using UnityEngine;
using UnityEngine.UI;
using UnityEngine.Networking;

public class UserInfo
{
    
    public IEnumerator SendLoginRequest(string username, string password)
    {
        string url = "http://localhost:8088/api/v1/login/";


        WWWForm form = new WWWForm();
        form.AddField("username", username);
        form.AddField("password", password);

        UnityWebRequest www = UnityWebRequest.Post(url, form);


        yield return www.SendWebRequest();


        if (www.result != UnityWebRequest.Result.Success)
        {
            Debug.LogError("Error: " + www.error);
        }
        else
        {
            Debug.Log("Result: " + www.downloadHandler.text);
        }
    }
}

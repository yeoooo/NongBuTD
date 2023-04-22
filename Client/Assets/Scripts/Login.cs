using System.Collections;
using System.Collections.Generic;
using TMPro;
using UnityEngine;
using UnityEngine.UI;

public class Login : MonoBehaviour
{
    public TMP_InputField usernameField;
    public TMP_InputField passwordField;

    
    public void DoLogin()
    {
        Debug.Log($"username : {usernameField.text}, password: {passwordField.text}");
        StartCoroutine(Managers.User.SendLoginRequest(usernameField.text, passwordField.text));
    }
}

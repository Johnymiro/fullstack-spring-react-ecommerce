import axios from "axios";
import { useEffect, useState } from "react"


function App() {
  const serverURL = "http://127.0.0.1:8888";

  useEffect(() => {
    const myHeaders = new Headers({
      'Content-Type': 'application/json',
      // 'Authorization': 'Bearer eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJLaXJhMTEyIiwiaWF0IjoxNjI3NTc3MTQ5LCJleHAiOjE2Mjc1ODA3NDl9.cAxf1xkZqqZ7-eQAxGsMb30J5gEyca5_5Noh7UHM9BGBpoFwAjoDaS244fROcJi_F6IMD0tbYQ26SCYb5DjBKw'
    });
    const fetchApi = async () => {

      const res = await fetch("http://localhost:8888/items/all",
        {
          method: 'GET',
          headers: myHeaders,
          mode: 'no-cors',
          cache: 'default'
        })

      const josn = await res.blob();

      console.log("josn: ", josn)
    }

    fetchApi();
  })

  const handleSignUp = async () => {
    console.log("Signing up the user")

    try {

      const res = await axios.post(`${serverURL}/api/auth/signup`, {
        "username": "Kira112",
        "email": "test1@gmial.com",
        "password": "123456",
        "role": ["MODERATOR", "ADMIN"]
      })

      console.log("Response from spring", res)
    } catch (er) { console.log("error: ", er) }
  }


  const handleSignUp2 = async () => {
    console.log("Signing up the user")

    try {
      axios({

        method: 'post',
        url: `${serverURL}/api/auth/signup`,
        responseType: "json",
        data: {
          "username": "Kira11",
          "email": "test3@gmial.com",
          "password": "123456",
          "role": ["MODERATOR", "ADMIN"]
        },

      }).then(console.log);

    } catch (er) { console.log("error: ", er) }
  }

  const handleSignIn = async () => {
    console.log("Signing in")

    try {
      const myHeaders = new Headers({
        'Content-Type': 'application/json',
        'Accept': 'application/json',
      });

      /*     fetch("http://localhost:8888//api/auth/signin",
              {
                method: 'POST',
                headers: myHeaders,
                mode: 'no-cors',
                cache: 'default',
                body: JSON.stringify({
                  "username": "Kira11",
                  "email": "test3@gmial.com"
                })
      
              }).then(r => console.log("This is the response", r.json())) */

/* 
      fetch("http://127.0.0.1:8888/api/auth/signin", {
        method: 'POST',
        headers: {
          "Content-type": "application/json"
        },
        body: JSON.stringify({
          "username": "Kira112",
          "password": "123456"
        })
      })
        .then(function (response) {
          //console.log('My JWT:', response.headers.get('jwt'));
          return response.json();
        })
        .then(function (data) {
          console.log("JSON data", data)
        })
        .catch(function (error) {
          console.log('Request failed', error);
        }); */


      axios({
        method: 'post',
        url: `${serverURL}/api/auth/signin`,
        responseType: "json",
        data: {
          "username": "Kira112",
          "password": "123456"
        },
        headers: {
          'Content-Type': 'application/json'
        }

      }).then(console.log);

    } catch (er) { console.log("error: ", er) }
  }
  return (
    <div className="App">
      <h1>React App</h1>
      <button onClick={handleSignIn}>Sign In</button>
    </div>
  );
}

export default App;

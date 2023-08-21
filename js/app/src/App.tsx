import React, {useState} from 'react';
import logo from './logo.svg';
import './App.css';


function App() {
    const [text, setText] = useState("");

    const addTaskRequest = async () => {
        await fetch("http://localhost:8080/addTask", {
            "method": "POST",
            "mode": "cors",
            "cache": "no-cache",
            "headers": {
                "Content-Type": "application/json",
                "Access-Control-Allow-Origin": "*"
            },
            "body": JSON.stringify({
                "completed": false,
                "text": text
            })
        });
    }

    return (
        <div className="App">
          <header className="App-header">
            <img src={logo} className="App-logo" alt="logo" />
            <form action="">
                <label htmlFor="task">New task:</label>
                <input type="text" id="task" name="task" value={text} onChange={(event) => setText(event.target.value)}/>
                <input type="submit" id="" name="button" value="Submit" onClick={addTaskRequest}/>
            </form>
          </header>
        </div>
    );
}

export default App;

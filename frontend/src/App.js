import logo from './logo.svg';
import './App.css';
import { useEffect, useState } from 'react';
import axios from 'axios';

const Interface = {
    "id":String,
    "name":String
}

function App() {
  
  const [Data,setData] = useState(Interface)
  useEffect(()=>{
      axios.get("/api/users").then(res=>setData(res.data))
  },[])
  console.log(Data)
  return (
    <div className="App">
      <header className="App-header">
        <img src={logo} className="App-logo" alt="logo" />
        <p>
          Edit <code>src/App.js</code> and save to reload.
        </p>
      </header>
    </div>
  );
}

export default App;

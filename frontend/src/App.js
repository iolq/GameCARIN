
import { BrowserRouter as Router, Route, Routes } from 'react-router-dom';
import {useEffect} from 'react'
import GameController from './component/GameController';
// import styled from "styled-components";


import Dressing from './dressing';
import Lobby from './Lobby';
import SelectArena from './SelectArena';
<<<<<<< HEAD
import Arena from './Arena';
=======
import Arena from './component/arena';

>>>>>>> 511682deacb31817896fd30896a136fc3c659972
// const BannerBtn = styled.a`
//     background: #2B39AF;
//     display: inline-block;
//     padding: .5rem 1rem;
//     text-decoration: none;
//     color: #fff;
//     border: 2px solid transparent;
//     transition: 0.3s;
//     margin-top: 1rem;
//     border-radius: 30px;
//     text-transform: uppercase;
//     cursor: pointer;
//     &:hover {
//         /* border: 2px solid #fff; */
//         background: #E85137;
//         color: #fff;
// }
// `




function App() {
    
    useEffect(()=>{
        var data = GameController.getStageGame();
        data.then(resp=>console.log(resp)) 
    },[])
    
  return (

    <Router>
      <Routes>
        <Route path='/' exact element={<Lobby />} />
        <Route path='/Dressing' exact element={<Dressing />} />
        <Route path='/SelectArena' exact element={<SelectArena />} />
<<<<<<< HEAD
        <Route path='/arena' exact element={<Arena />} />

=======
        <Route path='/component/arena' exact element={<Arena />} />
>>>>>>> 511682deacb31817896fd30896a136fc3c659972
      </Routes>
    </Router>


  )
}


export default App;


import { BrowserRouter as Router, Route, Routes } from 'react-router-dom';
// import styled from "styled-components";


import Dressing from './Dressing';
import Lobby from './Lobby';
import SelectArena from './SelectArena';

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
  return (




    <Router>
      <Routes>
        <Route path='/' exact element={<Lobby />} />
        <Route path='/Dressing' exact element={<Dressing />} />
        <Route path='/SelectArena' exact element={<SelectArena />} />

      </Routes>
    </Router>


  )
}


export default App;

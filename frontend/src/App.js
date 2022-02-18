import { Link } from 'react-router-dom';
import styled from "styled-components";

import './App.css';

const BannerBtn = styled.a`
    background: #2B39AF;
    display: inline-block;
    padding: .5rem 1rem;
    text-decoration: none;
    color: #fff;
    border: 2px solid transparent;
    transition: 0.3s;
    margin-top: 1rem;
    border-radius: 30px;
    text-transform: uppercase;
    cursor: pointer;
    &:hover {
        /* border: 2px solid #fff; */
        background: #E85137;
        color: #fff;
}
`

function App() {
  return (
    <div className="App">
      <div class="container">
        <div className='homepage-bgimage '>


          <BannerBtn className='button-corner' href="/dressing">PLAY GAME</BannerBtn>


        </div>

      </div >
    </div>
  );
}


export default App;

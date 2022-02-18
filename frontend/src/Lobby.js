import './Lobby.css';

import styled from "styled-components";

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
function Lobby() {
    return (
        <>
            <div className="App">
                <div class="container">
                    <div className='homepage-bgimage '></div>
                    <BannerBtn className='button-corner' href="/Dressing">PLAY GAME</BannerBtn>
                </div>

            </div >


        </>
    )
}

export default Lobby
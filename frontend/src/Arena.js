import styled from "styled-components";
import './Lobby.css';
import {useEffect,useState} from 'react'
const Bgimage = styled.div`
    background: url("https://scontent.fcnx4-1.fna.fbcdn.net/v/t1.15752-9/275299087_299954292205802_8252198721689245338_n.jpg?_nc_cat=104&ccb=1-5&_nc_sid=ae9488&_nc_eui2=AeGIsrfvR1034dEE0RCtUi0CLOlJqdN0SAAs6Ump03RIAM6NrENnAb_Ar3emMYuURfR1XP8lGgrqmwxNxr_Vzh-P&_nc_ohc=rGbBfP2LXVoAX8b0OlI&_nc_oc=AQkFpn3gJrP1A0YAQbqUbf3jM4CENM_ONExq8YMGgURdDh3SgRszhtVK4Vz7v5X1-ZoB3df4moJvAD0I7dYrcHp9&_nc_ht=scontent.fcnx4-1.fna&oh=03_AVI1wTEChWiQ9mI59o5mhX6nFqHCgL_Wc8NR1gdXZN8S7g&oe=62552C2C");
    height: 100vh;
    background-position: center;
    background-repeat: no-repeat;
    background-size: contain ;
  
    `;
const BannerBtn = styled.a`
    background-color: white;
 color: black;
 border: 2px solid #555555;
 border-radius: 24px;
 text-align: center;
 text-decoration: none;
 display: inline-block;
 font-size: 20px;
 
 padding: 16px 32px;
 /* cursor: pointer;
 position: fixed; */
 
   transition: 0.3s;
   text-transform: uppercase;
   cursor: pointer;
   &:hover {
       /* border: 2px solid #fff; */
       background: black;
       color: #fff;
}
`;
const Container = styled.div`
    max-width: 1000px;
    margin: 0 auto;
    justify-content: center;
`
function Arena() {

    

    return (


        <Container>
            <Bgimage>
                <BannerBtn href="/SelectArena">back</BannerBtn>



            </Bgimage>
        </Container>







    );
}


export default Arena
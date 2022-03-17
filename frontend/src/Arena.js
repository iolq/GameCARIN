import styled from "styled-components";
import './Lobby.css';
import { useEffect, useState } from 'react'
import GameController from "./component/GameController";
const Bar = styled.div`
justify-content: center;
display: flex;
flex-direction: column;
 border: 2px solid #555555;
 width: 140px;

  /* border-radius: 24px; */
  
  padding: 16px 32px;
  
    `
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
  cursor: pointer;
  position: fixed;
  bottom: 60px;
  right: 300px;
 
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

    const [arena1, setArena1] = useState();
    const [arena2, setArena2] = useState();
    const [arena3, setArena3] = useState();
    

    useEffect(()=>{
        GameController.getArea(1).then(datas=>setArena1(datas))
        GameController.getArea(3).then(data2=>setArena3(data2))
        GameController.getArea(2).then(data1=>setArena2(data1))
    },[])
    
    console.log(arena1)
    
    

    return (


        <Container>
            <Bgimage>
                <BannerBtn href="/SelectArena">back</BannerBtn>

                <Bar>
                    <img src="whitebloodcell.png" width="100%">
                    </img>white blood cell</Bar>
                <Bar><img src="whitebloodcelleat.png" width="100%">
                </img>white blood cell eat</Bar>
                <Bar><img src="redbloodcell.png" width="100%">
                </img>red blood cell</Bar>
                <Bar><img src="antibody.png" width="100%">
                </img>antibody</Bar>


            </Bgimage>
        </Container>







    );
}


export default Arena

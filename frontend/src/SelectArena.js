
import styled from "styled-components";
import Arena from "./component/arena";
import GameController from "./component/GameController";
import './Lobby.css';

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
const Button_corner = styled.a` 
    /* background-color: white; */
    color: black;
    
    border-radius: 24px;
    text-align: center;
    text-decoration: none;
    display: flex;
    font-size: 20px;
    justify-content: space-around;
    padding: 16px 32px;
    cursor: pointer;
    position: relative;
    top: 420px;
    
    
  
  `
const Row = styled.div`
  display: flex;
  justify-content: center;

  @media screen and (max-width: 60px) {
      display: flex;
      flex-direction: column;
  }
`
const Container = styled.div`
    max-width: 1000px;
    margin: 0 auto;
    justify-content: center;
`
const Bgimage = styled.div`
    background: url("https://scontent.fcnx4-1.fna.fbcdn.net/v/t1.15752-9/274160774_391891562700164_1152465655997423887_n.jpg?_nc_cat=101&ccb=1-5&_nc_sid=ae9488&_nc_eui2=AeH5_x4T-CB8RRuh2_CuJvLYJDhWFfO7WSwkOFYV87tZLLUkAah4Iv4NoDNhUxPq8BPjt7yMI83ktBnRdlTZvWh-&_nc_ohc=A0uRMaar5IIAX9hKH7C&_nc_ht=scontent.fcnx4-1.fna&oh=03_AVIlxphd3U3n9jKIMM3y3dbAWCU1E2ACnbdElu_Hkx8aGg&oe=62394630");
    height: 100vh;
    background-position: center;
    background-repeat: no-repeat;
    background-size: contain ;
  
    `;
function SelectArena(){

    return (

        <Container>
            <Bgimage>
                <BannerBtn href="/Dressing">back</BannerBtn>
                <Button_corner>
                    <BannerBtn href="/component/arena">EASY</BannerBtn>
                    <BannerBtn href="/SelectArena">MEDIUM</BannerBtn>
                    <BannerBtn href="/SelectArena">HARD</BannerBtn>
                </Button_corner>
            </Bgimage>



        </Container>

    );
}


export default SelectArena
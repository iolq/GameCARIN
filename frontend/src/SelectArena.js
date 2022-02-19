
import styled from "styled-components";
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
    background-color: white;
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
    max-width: 960px;
    margin: 0 auto;
    justify-content: center;
`
function SelectArena() {
    return (

        <Container>
            <BannerBtn href="/Dressing">back</BannerBtn>

            <Button_corner>
                <BannerBtn href="/SelectArena">EASY</BannerBtn>
                <BannerBtn href="/SelectArena">MEDIUM</BannerBtn>
                <BannerBtn href="/SelectArena">HARD</BannerBtn>
            </Button_corner>





        </Container>

    );
}


export default SelectArena
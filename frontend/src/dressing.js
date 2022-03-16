
import styled from "styled-components";

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
  
    transition: 0.3s;
    text-transform: uppercase;
    cursor: pointer;
    &:hover {
        /* border: 2px solid #fff; */
        background: black;
        color: #fff;
}
`
const Container = styled.div`
    max-width: 1000px;
    margin: 0 auto;
    justify-content: center;
`

function Dressing() {
    return (

        <Container >
            <div>HOW TO PLAY</div>


            <BannerBtn className='button-corner' href="/SelectArena">Select Arena</BannerBtn>





        </Container >

    );
}


export default Dressing

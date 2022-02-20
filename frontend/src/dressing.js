
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

function Dressing() {
    return (

        <div >



            <BannerBtn className='button-corner' href="/SelectArena">Select Arena</BannerBtn>





        </div >

    );
}


export default Dressing

import React  from 'react'
import Social from './Social'
import styled from 'styled-components';

const AboutStyle = styled.div`
    text-align: center;
`;
const AboutAvatar = styled.div`
    padding: 2em 0 0 0;
`;

const AboutImg = styled.img`
    border-radius: 100%;
    width: 160px;
    heigth: 160px;
    border: 2px solid #e91e63;
    margin: 0 auto;
    display: block;
    box-shadow: 0 0 10px rgba(0,0,0,0.6);

`;

const AboutName = styled.div`
    text-align: center;
`;

const AboutH2 = styled.h2`
    font-family: 'Roboto', sans-serif;
    font-weight: 400;
    letter-spacing: 1.2px;
    margin: .5em 0 0 0;
    color: #C2185B;
`;

const AboutProfession = styled.p`
    margin: .2em 0 1em 0;
    letter-spacing: 1.6px;
    font-weight: 300;
    color: #C2185B;
`;

const AboutBio = styled.p`
    color: #757575;
    font-size: 1em;
    font-weight: 300;
   
`;

const AboutLocation= styled.p`
    color: #757575;
    font-size: 1em;
    font-weight: 400;
`;

const About = ({ avatar, name, profession, bio, address, social }) => (
    <AboutStyle>
        <div className="About-container">
            <AboutAvatar>
                <figure>
                    <AboutImg src={'https://scontent.fgdl3-1.fna.fbcdn.net/v/t1.0-9/83540840_2765726393506639_6320790063990964224_o.jpg?_nc_cat=102&_nc_oc=AQk0sQR-FhwyiJo_h_vES6_U-feQ_tvs-asdrI6pYMJDSYIRy99lUxN_HsNgnk0Ygkk&_nc_ht=scontent.fgdl3-1.fna&oh=30e098207a8ec238c40984ffa71f518d&oe=5EBE1F80'} alt="imagen"/>
                </figure>
            </AboutAvatar>
            <AboutName>
                <AboutH2>{'Julio Jaramillo'}</AboutH2>
            </AboutName>
            <AboutProfession>
                {profession}
            </AboutProfession>
            <AboutBio>
                {bio}
            </AboutBio>
            <AboutLocation>
                {address}
            </AboutLocation>
            <div className="About-social">
                <Social social={social}/>
                
            </div>
        </div>
    </AboutStyle>
)

export default About;
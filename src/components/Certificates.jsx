import React from 'react';
import H2Styled from '../styled/H2Styled';
import H3Styled from '../styled/H3Styled';
import PStyled from '../styled/PStyled';

const Certificates = props => (
    <div className="Certificates">
        <div className="Certificates-container">
            <H2Styled name="Certificates"/>
            {
                props.data.map((cert, index)=>(
                    <div className="Certificates-item" key={`Certificates-${index}`}>
                        <H3Styled>
                            {cert.name} @ {cert.institution} 
                            <span>{ cert.date } </span>
                        </H3Styled>
                        <p>{cert.description}</p>
                        <PStyled name={cert.description}></PStyled>
                    </div>
                ))
            }
        </div>
    </div>
)

export default Certificates;
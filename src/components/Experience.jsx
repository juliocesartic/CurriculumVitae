import React from 'react';
import H2Styled from '../styled/H2Styled';
import H3Styled from '../styled/H3Styled';
import PStyled from '../styled/PStyled';

const Experience = props => (
    <div className="Experience">
        <div className="Experience-container">
            <H2Styled name="Experience"/>
            {
                props.data.map((exp, index)=>(
                    <div className="Experience-item" key={`Experience-${index}`}>
                        <H3Styled>
                            {exp.jobTitle}@{exp.company} 
                            <span> ({ exp.startDate + " - " + exp.endDate })</span>
                        </H3Styled>
                        <PStyled name={exp.description}></PStyled>
                    </div>
                ))
            }
        </div>
    </div>
)

export default Experience;
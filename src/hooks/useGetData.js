import { useState, useEffect } from 'react';
const API = 'https://guarded-cliffs-57908.herokuapp.com/v1/curriculum/person';

const useGetData = ()=> {
    const [ myData, setData ] = useState([]);

    useEffect(()=>{
        fetch(API).
        then(response => response.json()).
        then(data => setData(data))
    }, [])

    return myData;
}

export default useGetData;
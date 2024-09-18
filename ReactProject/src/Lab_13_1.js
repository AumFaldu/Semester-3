import {useState} from 'react'
const StateChange = ()=>{
    const [count,setCount] = useState(0);
    return(
    <>
    <p className="h1">Count = {count}</p>
    <button className="btn btn-outline-success" onClick={()=>setCount(count+1)}>Increment</button>
    <button className="btn btn-outline-danger" onClick={()=>setCount(count-1)}>Decrement</button>
    </>
    )
}
export default StateChange;
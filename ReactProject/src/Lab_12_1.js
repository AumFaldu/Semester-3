import {BrowserRouter,Routes,Route} from 'react-router-dom'
const Home = ()=>{
    return (<h1>Home</h1>)
}
const About = ()=>{
    return (<h1>About</h1>)
}
const Contact = ()=>{
    return (<h1>Contact</h1>)
}
const App = ()=>{
    return(
    <BrowserRouter>
    <Routes>
        <Route path='/Home' element={<Home />}/>
        <Route path='/About' element={<About />}/>
        <Route path='/Contact' element={<Contact />}/>
    </Routes>
    </BrowserRouter>
    )
}
export default App;
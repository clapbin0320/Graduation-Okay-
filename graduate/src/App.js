import * as React from 'react';
import Axios from 'axios';
import {  Route, Routes} from 'react-router-dom';
import { Reset } from 'styled-reset';
import './css/App.css';
import Header from './components/Header';
import Nav from './pages/Nav';
import Footer from './components/Footer';
import EditBoard from './pages/EditBoard';
import GraduateOk from './pages/GraduateOk';
import Notice from './pages/Notice';
import Mainpage from './pages/Mainpage';
import Board from './pages/Board';
import KyRecommend from './pages/KyRecommend';


const App = () => {
 


  return (
    <React.Fragment>
            <Reset/>
            <Header/>
            <Nav/>
            <Routes>
              <Route path = "" exact element = {<Mainpage/>}/>
              <Route path = "Notice" exact element = {<Notice/>}/>
              <Route path = "Graduate" exact element = {<GraduateOk/>}/>
              <Route path = "KyRecommend" exact element = {<KyRecommend/>}/>
              <Route path = "Board" exact element = {<Board/>}/> 
              <Route path = "Board/EditBoard" exact element = {<EditBoard/>}/>

            </Routes>
            <Footer/>
            
    </React.Fragment>
    );
}
export default App;

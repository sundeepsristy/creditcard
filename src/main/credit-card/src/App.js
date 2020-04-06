import React from 'react';
import './App.css';
import CardsDetailsList from './Components/CardsDetailsList';
import CardForm from './Components/CardForm';
import axios from 'axios';

class  App extends React.Component {
constructor(props) {
    super(props);
this.state = {
  existingCardsList:[],
};
}

  addCard(card){
    axios.post('/api/card/Add',JSON.stringify(card),{headers: { 'Content-Type': 'application/json' }})
    .then (response => {
      if(response.status===201){
        this.refreshExistingCardsList();
      }
    })
      .catch(error =>{
        console.log(error);
      });

    }


    refreshExistingCardsList(){
              axios.get('/api/card/GetAll',{headers: { 'Content-Type': 'application/json'}})
              .then(
                response => {
                    if(response.status===200 && response.data.length>0){
                      this.updateCardsList(response.data);
                    }
                      console.log(response);
                }
              )
              .catch(error => {
                console.log(error);
              });
            }

  updateCardsList(cardsList){
    this.setState({existingCardsList:cardsList});
  }

render(){
  return (
    <div className="App">

       <div>
           <Title/>

          <CardForm addCard={this.addCard.bind(this)}/>
            <div>
            <CardsDetailsList refreshList={this.refreshExistingCardsList.bind(this)} cardsList={this.state.existingCardsList}/>
            </div>
          </div>
    </div>
  );
}
}

function Title() {
  return <h1>Credit Card System</h1>;
}
export default App;

import React from 'react';
import Label from './Label';


export default class CardForm extends React.Component{
  constructor(props) {
    super(props);
    this.handleSubmit=this.handleSubmit.bind(this);

     this.state= {
      cardName: "",
      cardNumber: "",
      limit:""
    };

  }

	handleNumberChange = evt => {
	this.setState({cardNumber:evt.target.value});
	}

	handleLimitChange  = evt => {
	this.setState({limit:evt.target.value});
	}

	handleNameChange  = evt => {
	this.setState({cardName:evt.target.value});
	}

	isReadyToSubmit(){
		const{cardName,cardNumber,limit}=this.state;
      return cardName.length>0 && cardNumber.length<20&&limit.length>0;
  }

handleSubmit = evt => {
    evt.preventDefault();
    if (!this.isReadyToSubmit()) {

      return;
    }
   const{cardName,cardNumber,limit}=this.state;
   const card ={};
   card["name"]=cardName;
   card["cardNumber"]=cardNumber;
   card["limit"]=limit;

   this.setState({cardName:""});
   this.setState({cardNumber:""});
   this.setState({limit:""});
   this.props.addCard(card);

  };


  render () {

	 const isSubmitEnabled = this.isReadyToSubmit();

    return (
  <div>
    <form id="AddCardForm" >
      <Label name="Name" /> <br/>
      <input type="text" placeholder="Enter Name" id="cardName" value={this.state.cardName} onChange={this.handleNameChange}/><br/>
		  <Label name="Card Number" /><br/>
    <input type="number" placeholder="Enter Card number" id="cardNumber" value={this.state.cardNumber} onChange={this.handleNumberChange}/><br/>

      <Label name="Limit" /><br/>

		 <input type="number" placeholder="Enter Limit" value={this.state.limit} onChange={this.handleLimitChange}/><br/><br/>

      <button disabled={!isSubmitEnabled} onClick={this.handleSubmit}>Add </button>
   </form>
  </div>

  );
  }
}

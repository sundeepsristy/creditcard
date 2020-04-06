
import React from 'react';
export default class CardDetailsRow extends React.Component{
  render(){
    const cardDetails = this.props.card;
    const cardName=cardDetails.name;
    const cardNumber=cardDetails.cardNumber;
    const balance=cardDetails.balance;
    const limit = cardDetails.limit;

    return(
      <tr>
        <td>{cardName}</td>
        <td>{cardNumber}</td>
        <td>{balance}</td>
        <td>{limit}</td>
        </tr>
    );
  }
}

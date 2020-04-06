
import React from 'react';
import CardDetailsRow from './CardDetailsRow'
export default class CardsDetailsList extends React.Component{

componentDidMount(){
  this.props.refreshList();
}
  render(){
console.log(this.props);
const cards = this.props.cardsList;
console.log(cards);
    const cardRows=[];
   cards.forEach((cardInfo)=>{
       cardRows.push(<CardDetailsRow key={cardInfo.cardNumber} card={cardInfo}/>);
    });


    return(
      <table>
        <thead>
          <tr>
            <th>Name </th>
            <th>Card Number </th>
            <th> Balance </th>
            <th> Limit </th>
            </tr>
        </thead>
        <tbody>{cardRows}</tbody>
        </table>

    );
  }

}

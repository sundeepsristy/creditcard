(this["webpackJsonpcredit-card"]=this["webpackJsonpcredit-card"]||[]).push([[0],{18:function(e,t,a){e.exports=a(42)},23:function(e,t,a){},24:function(e,t,a){},42:function(e,t,a){"use strict";a.r(t);var n=a(0),r=a.n(n),l=a(17),i=a.n(l),c=(a(23),a(2)),s=a(3),u=a(4),o=a(5),d=(a(24),function(e){Object(o.a)(a,e);var t=Object(u.a)(a);function a(){return Object(c.a)(this,a),t.apply(this,arguments)}return Object(s.a)(a,[{key:"render",value:function(){var e=this.props.card,t=e.name,a=e.cardNumber,n=e.balance,l=e.limit;return r.a.createElement("tr",null,r.a.createElement("td",null,t),r.a.createElement("td",null,a),r.a.createElement("td",null,n),r.a.createElement("td",null,l))}}]),a}(r.a.Component)),m=function(e){Object(o.a)(a,e);var t=Object(u.a)(a);function a(){return Object(c.a)(this,a),t.apply(this,arguments)}return Object(s.a)(a,[{key:"componentDidMount",value:function(){this.props.refreshList()}},{key:"render",value:function(){console.log(this.props);var e=this.props.cardsList;console.log(e);var t=[];return e.forEach((function(e){t.push(r.a.createElement(d,{key:e.cardNumber,card:e}))})),r.a.createElement("table",null,r.a.createElement("thead",null,r.a.createElement("tr",null,r.a.createElement("th",null,"Name "),r.a.createElement("th",null,"Card Number "),r.a.createElement("th",null," Balance "),r.a.createElement("th",null," Limit "))),r.a.createElement("tbody",null,t))}}]),a}(r.a.Component),h=a(6);function b(e){return r.a.createElement("label",null,e.name)}var p=function(e){Object(o.a)(a,e);var t=Object(u.a)(a);function a(e){var n;return Object(c.a)(this,a),(n=t.call(this,e)).handleNumberChange=function(e){n.setState({cardNumber:e.target.value})},n.handleLimitChange=function(e){n.setState({limit:e.target.value})},n.handleNameChange=function(e){n.setState({cardName:e.target.value})},n.handleSubmit=function(e){if(e.preventDefault(),n.isReadyToSubmit()){var t=n.state,a=t.cardName,r=t.cardNumber,l=t.limit,i={};i.name=a,i.cardNumber=r,i.limit=l,n.setState({cardName:""}),n.setState({cardNumber:""}),n.setState({limit:""}),n.props.addCard(i)}},n.handleSubmit=n.handleSubmit.bind(Object(h.a)(n)),n.state={cardName:"",cardNumber:"",limit:""},n}return Object(s.a)(a,[{key:"isReadyToSubmit",value:function(){var e=this.state,t=e.cardName,a=e.cardNumber,n=e.limit;return t.length>0&&a.length<20&&n.length>0}},{key:"render",value:function(){var e=this.isReadyToSubmit();return r.a.createElement("div",null,r.a.createElement("form",{id:"AddCardForm"},r.a.createElement(b,{name:"Name"})," ",r.a.createElement("br",null),r.a.createElement("input",{type:"text",placeholder:"Enter Name",id:"cardName",value:this.state.cardName,onChange:this.handleNameChange}),r.a.createElement("br",null),r.a.createElement(b,{name:"Card Number"}),r.a.createElement("br",null),r.a.createElement("input",{type:"number",placeholder:"Enter Card number",id:"cardNumber",value:this.state.cardNumber,onChange:this.handleNumberChange}),r.a.createElement("br",null),r.a.createElement(b,{name:"Limit"}),r.a.createElement("br",null),r.a.createElement("input",{type:"number",placeholder:"Enter Limit",value:this.state.limit,onChange:this.handleLimitChange}),r.a.createElement("br",null),r.a.createElement("br",null),r.a.createElement("button",{disabled:!e,onClick:this.handleSubmit},"Add ")))}}]),a}(r.a.Component),E=a(7),f=a.n(E);function v(){return r.a.createElement("h1",null,"Credit Card System")}var g=function(e){Object(o.a)(a,e);var t=Object(u.a)(a);function a(e){var n;return Object(c.a)(this,a),(n=t.call(this,e)).state={existingCardsList:[]},n}return Object(s.a)(a,[{key:"addCard",value:function(e){var t=this;f.a.post("/api/card/Add",JSON.stringify(e),{headers:{"Content-Type":"application/json"}}).then((function(e){201===e.status&&t.refreshExistingCardsList()})).catch((function(e){console.log(e)}))}},{key:"refreshExistingCardsList",value:function(){var e=this;f.a.get("/api/card/GetAll",{headers:{"Content-Type":"application/json"}}).then((function(t){200===t.status&&t.data.length>0&&e.updateCardsList(t.data),console.log(t)})).catch((function(e){console.log(e)}))}},{key:"updateCardsList",value:function(e){console.log("before update"),console.log(this.state.existingCardsList),this.setState({existingCardsList:e}),console.log(this.state.existingCardsList)}},{key:"render",value:function(){return r.a.createElement("div",{className:"App"},r.a.createElement("div",null,r.a.createElement(v,null),r.a.createElement(p,{addCard:this.addCard.bind(this)}),r.a.createElement("div",null,r.a.createElement(m,{refreshList:this.refreshExistingCardsList.bind(this),cardsList:this.state.existingCardsList}))))}}]),a}(r.a.Component);Boolean("localhost"===window.location.hostname||"[::1]"===window.location.hostname||window.location.hostname.match(/^127(?:\.(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)){3}$/));i.a.render(r.a.createElement(r.a.StrictMode,null,r.a.createElement(g,null)),document.getElementById("root")),"serviceWorker"in navigator&&navigator.serviceWorker.ready.then((function(e){e.unregister()})).catch((function(e){console.error(e.message)}))}},[[18,1,2]]]);
//# sourceMappingURL=main.1475d9ca.chunk.js.map
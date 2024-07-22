/*
The goal of this problem is to use prototypal inheritance in Javascript.

Implement inheritance as described below-

Create a function Activity that takes a single parameter amount (Number) and assigns it to member variable 'amount'.
Add the following functions to the Activity prototype -

1. setAmount - This function takes a single parameter , value.
    o If the value is less than or equal to 0, it returns false.
    o Otherwise, it assigns value to the member variable amount and returns true.
    
2. getAmount - This function returns the member variable amount value.

Create a function Payment that -
1. inherits from parent Activity.
2. takes 2 parameters - amount (Number) and receiver (string). It assigns the parent's member variable 'amount', and self's member variable 'receiver' respectively.

Add the following functions to Payment's existing prototype -

1. setReceiver - This function takes a single parameter and assigns it to the member variable 'receiver'.

2. getReceiver - This function returns the member variable 'receiver' value.

Create a function Refund that -
1. inherits from parent Activity.
2. takes 2 parameters - amount (Number) and sender (string) and assigns the parent's member variable 'amount', and self's member variable, 'sender'.

Add below functions to Refund's existing prototype -

1. setSender - This function takes a single parameter and assigns it to the member variable sender.
2. getSender - This function returns the member variable sender.

Implementation of the function will be tested by the provided code stub using several input files. Each input file contains parameters for the function calls. 
The result of their executions will be printed to the standard output by the provided code. 
In the case of a setAmount function call, if the value returned is false, 
the stubbed code prints 'Amount not updated'. If the value returned is true, 
it prints 'Amount updates to <value>'.

*/

'use strict';

const fs = require('fs');

process.stdin.resume();
process.stdin.setEncoding("ascii");
let inputString = "";
let currentLine = 0;

process.stdin.on("data", function (chunk) {
    inputString += chunk;
});
process.stdin.on("end", function () {
    inputString = inputString.split('\n');
    main();
});

function readLine() {
  return inputString[currentLine++];
}

function Activity(amount) {
    this.amount = amount;
}

Activity.prototype.setAmount = function(value) {
    if (value <= 0) {
        return false;
    } else {
        this.amount = value;
        return true;
    }
};

Activity.prototype.getAmount = function() {
    return this.amount;
};

function Payment(amount, receiver) {
    Activity.call(this, amount);
    this.receiver = receiver;
}

Payment.prototype = Object.create(Activity.prototype);
Payment.prototype.constructor = Payment;

Payment.prototype.setReceiver = function(receiver) {
    this.receiver = receiver;
};

Payment.prototype.getReceiver = function() {
    return this.receiver;
};

function Refund(amount, sender) {
    Activity.call(this, amount);
    this.sender = sender;
}

Refund.prototype = Object.create(Activity.prototype);
Refund.prototype.constructor = Refund;

Refund.prototype.setSender = function(sender) {
    this.sender = sender;
};

Refund.prototype.getSender = function() {
    return this.sender;
};


function main() {
    const ws = fs.createWriteStream(process.env.OUTPUT_PATH);
    
    const objectType = readLine().trim();
    
    const inputsForObjectCreation = readLine().trim().split(' ');
    const updatedAmount = parseInt(readLine().trim());
    const updatedSenderReceiver = readLine().trim();
    switch(objectType) {
        case 'Payment':
            const paymentObj = new Payment(parseInt(inputsForObjectCreation[0]), inputsForObjectCreation[1]);
            ws.write(`Payment object created with amount ${paymentObj.getAmount()} and receiver ${paymentObj.getReceiver()}\n`);
            if(paymentObj.setAmount(updatedAmount)) {
                ws.write(`Amount updated to ${updatedAmount}\n`);
            } else {
                ws.write(`Amount not updated\n`);
            }
            paymentObj.setReceiver(updatedSenderReceiver);
            ws.write(`Receiver updated to ${updatedSenderReceiver}\n`);
            ws.write(`Payment object details - amount is ${paymentObj.getAmount()} and receiver is ${paymentObj.getReceiver()}\n`);
            ws.write(`Payment.prototype has property setAmount: ${Payment.prototype.hasOwnProperty('setAmount')}\n`);
            ws.write(`Payment.prototype has property getAmount: ${Payment.prototype.hasOwnProperty('getAmount')}\n`);
            ws.write(`Payment.prototype has property setReceiver: ${Payment.prototype.hasOwnProperty('setReceiver')}\n`);
            ws.write(`Payment.prototype has property getReceiver: ${Payment.prototype.hasOwnProperty('getReceiver')}\n`);
            break;
        case 'Refund':
            const refundObj = new Refund(parseInt(inputsForObjectCreation[0]), inputsForObjectCreation[1]);
            ws.write(`Refund object created with amount ${refundObj.getAmount()} and sender ${refundObj.getSender()}\n`);
            if(refundObj.setAmount(updatedAmount)) {
                ws.write(`Amount updated to ${updatedAmount}\n`);
            } else {
                ws.write(`Amount not updated\n`);
            }
            refundObj.setSender(updatedSenderReceiver);
            ws.write(`Sender updated to ${updatedSenderReceiver}\n`);
            ws.write(`Refund object details - amount is ${refundObj.getAmount()} and sender is ${refundObj.getSender()}\n`);
            ws.write(`Refund.prototype has property setAmount: ${Refund.prototype.hasOwnProperty('setAmount')}\n`);
            ws.write(`Refund.prototype has property getAmount: ${Refund.prototype.hasOwnProperty('getAmount')}\n`);
            ws.write(`Refund.prototype has property setSender: ${Refund.prototype.hasOwnProperty('setSender')}\n`);
            ws.write(`Refund.prototype has property getSender: ${Refund.prototype.hasOwnProperty('getSender')}\n`);
            break;
        default:
            break;
    }
}
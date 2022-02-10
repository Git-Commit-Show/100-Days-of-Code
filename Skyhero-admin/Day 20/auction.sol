//SPDX-License-Identifier:MIT
pragma solidity 0.8.7;

contract Auction{
    event Start();
    address payable public seller;

    bool public started;
    bool public ended;
    uint public endAt;

    uint public highestBid;
    address public highestBidder;
    mapping(address => uint) public bids;

    constructor(){
        seller=payable(msg.sender);
    }

    function start() external{
        require(!started,"Already started!");
        require(msg.sender==seller,"You did not start the auction.");
        started=true;
        endAt=block.timestamp + 2 days;
        emit Start();
    }

    function end() external(){
        require(started, "You need to start before you end :)");
        require(block.timestamp<=endAt, "Auction is still going on");
        require(!ended, "Auction has already ended");

        ended=true;
    }
}
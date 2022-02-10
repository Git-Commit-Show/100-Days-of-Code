//SPDX-License-Identifier:MIT
pragma solidity 0.8.7;

contract MyContract{
    mapping(address => uint) private balances;

    function deposit() external payable {
        balances[msg.sender]+=msg.value;
    }

    function withdraw(address payable addr, uint amount) public payable {
        require(balances[addr]>=amount, "Insufficient funds");
        (bool sent, bytes memory data)=addr.call{value:amount}("");
        require(sent,"Could not withdraw!!");
        balances[msg.sender]-=amount;
    }

    function giveBalance() public view returns(uint){
        return address(this).balance;
    }
}
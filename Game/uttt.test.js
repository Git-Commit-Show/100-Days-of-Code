const uttt = require('./uttt.js');

module.exports = class tuttt extends uttt {
  constructor() {
    super();
    this.activate = false;
  }

  toggleDebug() {
    this.activate = !this.activate;
  }

  bulkMove(quantity) {
    for (let i = 0; i < Number(quantity); i += 1) {
      for (let j = 0; j < 9; j += 1) {
        for (let k = 0; k < 9; k += 1) {
          if (!super.makeMove(j, k, this.activate)) {
            console.log(`CUSTOM ERROR: ${j + 1} board and ${k + 1} cell is not valid`);
          }
          if (super.winner) {
            break;
          }
        }
      }
    }
  }

  bulkRandomMove(quantity) {
    for (let i = 0; i < Number(quantity * 100); i += 1) {
      const j = Math.floor(Math.random() * 9);
      const k = Math.floor(Math.random() * 9);
      console.log(j, k);
      if (!super.makeMove(j, k, this.activate)) {
        console.log(`CUSTOM ERROR: ${j + 1} board and ${k + 1} cell is not valid`);
      }
      if (super.winner) {
        break;
      }
    }
  }
};

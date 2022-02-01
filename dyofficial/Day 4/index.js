function solve(meal_cost, tip_percent, tax_percent) {
  // Write your code here

  const final = meal_cost + (meal_cost / 100) * tip_percent + (meal_cost / 100) * tax_percent;
  const finalAmount = Math.round(final);
  console.log(finalAmount);
}

function main() {
  const meal_cost = parseFloat(readLine().trim());

  const tip_percent = parseInt(readLine().trim(), 10);

  const tax_percent = parseInt(readLine().trim(), 10);

  solve(meal_cost, tip_percent, tax_percent);
}

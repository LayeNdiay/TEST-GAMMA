export default function has30r5(number) {
  const stringNumber = String(number);
  let result = "";

  if (stringNumber.includes("3")) {
    result += "FIZZ";
  }
  if (stringNumber.includes("5")) {
    result += "Buzz";
  }

  return result;
}

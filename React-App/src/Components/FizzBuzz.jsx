import React from "react";
import has30r5 from "../utils/verify";

export default function FizzBuzz() {
  const results = [];
  for (let i = 1; i < 100; i++) {
    let result = "";

    if (i % 3 === 0) {
      result = "FIZZ";
    } else if (i % 5 === 0) {
      result = "Buzz";
    } else {
      const verifyContains = has30r5(i);
      if (verifyContains !== "") {
        result = verifyContains;
      } else {
        result = String(i);
      }
    }
    results.push(<div key={i}>{result}</div>);
  }
  return results;
}

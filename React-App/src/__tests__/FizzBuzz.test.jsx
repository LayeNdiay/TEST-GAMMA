const { render, screen } = require("@testing-library/react");
const FizzBuzz = require("../Components/FizzBuzz").default;
const React = require("react");

test("renders FizzBuzz sequence correctly", () => {
  render(<FizzBuzz />);
  const fizzElements = screen.getAllByText("FIZZ");
  const buzzElements = screen.getAllByText("Buzz");
  const fizzbuzzElements = screen.getAllByText("FIZZBuzz");
  expect(fizzElements.length).toBeGreaterThan(0);
  expect(buzzElements.length).toBeGreaterThan(0);
  expect(fizzbuzzElements.length).toBeGreaterThan(0);
});

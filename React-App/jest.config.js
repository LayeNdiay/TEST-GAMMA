export default  {
    
    coverageThreshold: {
      global: {
        lines: 80,
      },
    },
    transform: {
        "^.+\\.jsx?$": "babel-jest"
      },
      testEnvironment: "jest-environment-jsdom",
      extensionsToTreatAsEsm: [".jsx"],
  };
# Weather Android Kotlin App
د
## Description
This weather application is designed to provide real-time weather information for a given city and country. It uses both the hotline API and an open API to retrieve weather data. The application displays essential weather details, including the city and country name, current temperature, minimum and maximum temperatures, and weather conditions.

## Features
- Display weather data for a specified city and country.
- Show the current temperature in Celsius.
- Provide the minimum and maximum temperatures for the day.
- Describe the current weather conditions.

## APIs Used
- **Hotline API**: Used to fetch city and country information.
- **Open Weather API**: Used to obtain weather data based on location.

## Installation and Setup
1. Clone this repository to your local machine.
2. Navigate to the project directory.

## Configuration
To run the application successfully, you need to set up API keys for both the hotline and open APIs. Follow these steps:

1. Sign up for an API key on the hotline API website.
2. Sign up for an API key on the Open Weather API website.
3. Create a file named `config.js` in the project directory.
4. Inside `config.js`, store your API keys as follows:

```javascript
module.exports = {
  hotlineApiKey: 'YOUR_HOTLINE_API_KEY',
  openWeatherApiKey: 'YOUR_OPEN_WEATHER_API_KEY',
};

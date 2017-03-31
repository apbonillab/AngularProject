const path = require('path');

module.exports = {
  // Example setup for your project:
  // The entry module that requires or imports the rest of your project.
  // Must start with `./`!
  entry: './src/entry.js',
  // Place output files in `./dist/my-app.js`
  output: {
    path: path.resolve(__dirname, 'dist'),
    filename: 'auth.js'
  },
  module: {
    loaders: [
      {
        test: /\.json$/,
        loader: 'json-loader'
      }
    ]
  }
};

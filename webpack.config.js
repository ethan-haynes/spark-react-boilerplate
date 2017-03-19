module.exports = {
  entry: './src/frontend/index.js',
  output: {
      path: __dirname + '/src/main/resources/public',
      filename: 'bundle.js'
  },
  resolve: {
    extensions: ['', '.js', '.jsx', '.json']
  },
  module: {
    loaders: [
      {
        test: [/\.jsx$/, /\.js$/],
        loader: 'babel-loader'
      } 
    ]
  }
}

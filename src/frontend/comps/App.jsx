import React, { Component } from 'react'

class App extends Component {
  constructor(props) {
    super(props)
  }
  render() {
    const { initialData } = this.props
    return (
      <div className="App">
        {initialData}
      </div>
    )
  }
}

module.exports = App

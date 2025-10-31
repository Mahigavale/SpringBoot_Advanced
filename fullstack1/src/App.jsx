import { useState } from 'react'
import reactLogo from './assets/react.svg'
import viteLogo from '/vite.svg'
import './App.css'

import { GetFromBackend } from './assets/Datafetch'

function App() {
 

 return  (
<>
<h1> Hii</h1>
<GetFromBackend></GetFromBackend>
</>
  )
}

export default App

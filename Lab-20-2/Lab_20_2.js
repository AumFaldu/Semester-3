const express = require('express');
const path = require('path');
const app = express();
const port = 3000;

// Serve static files from the "public" directory
app.use(express.static(path.join(__dirname, 'public')));

// Basic route
app.get('/', (req, res) => {
  res.send('Navigate to /index.html to see the static file');
});

// Start the server
app.listen(port, () => {
  console.log(`Server is running at ${port}`);
});

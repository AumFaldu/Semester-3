const express = require('express');
const app = express();
const port = 3000;

// Application-level middleware
app.use((req, res, next) => {
  console.log(`${req.method} ${req.url}`);
  next();
});

// Route-specific middleware
app.use('/user', (req, res, next) => {
  console.log('Request Type:', req.method);
  next();
});

// Error-handling middleware
app.use((err, req, res, next) => {
  console.error(err.stack);
  res.status(500).send('Something broke!');
});

// Routes
app.get('/', (req, res) => {
  res.send('Hello World!');
});

app.get('/user', (req, res) => {
  res.send('User Page');
});

// Start the server
app.listen(port, () => {
  console.log(`app listening at ${port}`);
});

const http = require('http');
const fs = require('fs');
const path = require('path');

// Server creation
const server = http.createServer((req, res) => {
    if (req.url === '/home' || req.url === '/') {
        // Serve index.html for the home route
        fs.readFile(path.join(__dirname, 'index.html'), (err, content) => {
            if (err) throw err;
            res.writeHead(200, { 'Content-Type': 'text/html' });
            res.end(content, 'utf-8');
        });
    } 
    else if (req.url === '/products') {
        // Serve products.html for the products route
        fs.readFile(path.join(__dirname, 'products.html'), (err, content) => {
            if (err) throw err;
            res.writeHead(200, { 'Content-Type': 'text/html' });
            res.end(content, 'utf-8');
        });
    } 
    else if (req.url === '/products.json') {
        // Serve products.json for the data
        fs.readFile(path.join(__dirname, 'products.json'), (err, content) => {
            if (err) throw err;
            res.writeHead(200, { 'Content-Type': 'application/json' });
            res.end(content, 'utf-8');
        });
    } 
    else {
        res.writeHead(404, { 'Content-Type': 'text/plain' });
        res.end('404 Not Found');
    }
});

// Start server
const PORT = 3000;
server.listen(PORT, () => {
    console.log(`Server is running on http://localhost:${PORT}`);
});

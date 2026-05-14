const express = require("express");

const app = express();

app.use(express.json());

app.post("/kyc/verify", (req, res) => {

    const result = {
        status: "VERIFIED"
    };

    res.json(result);
});

app.listen(3000, () => {
    console.log("KYC Service running");
});

app.post("/notify", (req, res) => {

    console.log("Sending Notification");

    res.json({
        status: "Notification Sent"
    });
});

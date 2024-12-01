document.addEventListener("DOMContentLoaded", () => {
   const inputContainer = document.getElementById("input-fields");
   for (let i = 0; i < 10; i++) {
       const input = document.createElement("input");
       input.type = "number";
       input.placeholder = `Feature ${i + 1}`;
       inputContainer.appendChild(input);
   }
});

async function predict() {
   const inputs = Array.from(document.querySelectorAll("#input-fields input"))
                       .map(input => parseFloat(input.value) || 0);
   
   const response = await fetch("http://127.0.0.1:5000/predict", {
       method: "POST",
       headers: {
           "Content-Type": "application/json"
       },
       body: JSON.stringify({ inputs })
   });

   const data = await response.json();
   document.getElementById("output").innerText = `Prediction: ${data.prediction}`;
}

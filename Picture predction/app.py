from flask import Flask, request, jsonify
import torch
import numpy as np
from sklearn.preprocessing import StandardScaler

app = Flask(__name__)

class ANNModel(torch.nn.Module):
    def __init__(self, input_dim):
        super(ANNModel, self).__init__()
        self.layer1 = torch.nn.Linear(input_dim, 64)
        self.layer2 = torch.nn.Linear(64, 32)
        self.output = torch.nn.Linear(32, 1)
    
    def forward(self, x):
        x = torch.relu(self.layer1(x))
        x = torch.relu(self.layer2(x))
        return self.output(x)

# Load or initialize model
model = ANNModel(input_dim=10)
model.load_state_dict(torch.load('ann_model.pth'))
model.eval()

scaler = StandardScaler()
scaler.mean_ = np.load("scaler_mean.npy")
scaler.scale_ = np.load("scaler_scale.npy")

@app.route('/predict', methods=['POST'])
def predict():
    data = request.json.get("inputs", [])
    inputs = np.array(data).reshape(1, -1)
    inputs = scaler.transform(inputs)
    inputs_tensor = torch.tensor(inputs, dtype=torch.float32)
    with torch.no_grad():
        prediction = model(inputs_tensor).item()
    return jsonify({"prediction": prediction})

if __name__ == '__main__':
    app.run(debug=True)

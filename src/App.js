import axios from "axios";
import { useState } from "react";

function LoanApplication() {

  const [formData, setFormData] = useState({
    name: "",
    amount: ""
  });

  const submitLoan = async () => {

    const response = await axios.post(
      "http://api.loan.com/loan/apply",
      formData
    );

    alert(response.data.message);
  };

  return (
    <div>
      <h1>Loan Application</h1>

      <input
        placeholder="Name"
        onChange={(e) =>
          setFormData({...formData, name: e.target.value})
        }
      />

      <input
        placeholder="Loan Amount"
        onChange={(e) =>
          setFormData({...formData, amount: e.target.value})
        }
      />

      <button onClick={submitLoan}>
        Apply Loan
      </button>
    </div>
  );
}

export default LoanApplication;

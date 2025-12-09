import { useEffect, useState } from "react";

function useMoneyinfo(currency = "USD") {
  const [data, setData] = useState({});

  useEffect(() => {
    fetch(
      `https://v6.exchangerate-api.com/v6/bd5c528b9392c5bd47a6ae53/latest/${currency}`
    )
      .then((res) => res.json())
      .then((res) => {
        if (res && res.conversion_rates) {
          setData(res.conversion_rates);
        } else {
          console.error("Conversion rates not found in response.");
        }
      })
      .catch((error) => console.error("Error fetching data:", error));
  }, [currency]);

  return data;
}

export default useMoneyinfo;

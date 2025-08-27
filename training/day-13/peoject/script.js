document.addEventListener("DOMContentLoaded", () => {
    const form = document.getElementById("user-form");
    const nationalitySelect = document.getElementById("nationality");
    const formTitle = document.getElementById("form-title");
    const toggleText = document.getElementById("toggle-text");
    const toggleLink = document.querySelector(".toggle a");

    let isLoginMode = true;

    // 🌍 Load countries
    fetch("https://restcountries.com/v3.1/all?fields=name")
        .then(response => {
            if (!response.ok) throw new Error("Network response was not ok");
            return response.json();
        })
        .then(data => {
            const countries = data
                .map(country => country.name.common)
                .filter(Boolean)
                .sort();

            countries.forEach(name => {
                const option = document.createElement("option");
                option.value = name;
                option.textContent = name;
                nationalitySelect.appendChild(option);
            });
        })
        .catch(error => {
            console.error("Error loading countries:", error);
            const fallback = document.createElement("option");
            fallback.value = "Other";
            fallback.textContent = "Other";
            nationalitySelect.appendChild(fallback);
        });


    // 🔁 Toggle between Login and Sign Up
    window.toggleForm = function () {
        isLoginMode = !isLoginMode;
        formTitle.textContent = isLoginMode ? "Login" : "Sign Up";
        toggleText.textContent = isLoginMode
            ? "Don't have an account?"
            : "Already have an account?";
        toggleLink.textContent = isLoginMode ? "Sign Up" : "Login";
    };

    // 🧠 Handle form submission
    form.addEventListener("submit", (e) => {
        e.preventDefault();

        const username = document.getElementById("username").value.trim();
        const phone = document.getElementById("phone").value.trim();
        const fullname = document.getElementById("fullname").value.trim();
        const nationality = nationalitySelect.value;

        if (!username || !phone || !fullname || !nationality) {
            alert("Please fill in all fields.");
            return;
        }

        const userKey = `user_${username}`;
        const existingUser = JSON.parse(localStorage.getItem(userKey));

        if (isLoginMode) {
            if (!existingUser) {
                alert("User not found. Please sign up first.");
                return;
            }

            const today = new Date().toDateString();
            if (existingUser.date === today) {
                alert(`Welcome back, ${existingUser.fullname}! You logged in on ${today}.`);
            } else {
                alert(`Login date mismatch. Last registered on ${existingUser.date}.`);
            }

        } else {
            const today = new Date().toDateString();
            const newUser = {
                username,
                phone,
                fullname,
                nationality,
                date: today
            };

            localStorage.setItem(userKey, JSON.stringify(newUser));
            alert(`User ${fullname} registered successfully on ${today}.`);
            toggleForm();
        }

        form.reset();
    });
});

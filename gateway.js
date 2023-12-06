import http from 'k6/http';

export function createUser(user, latency) {
  console.log(`Creating user ${user.name}`)

  const payload = JSON.stringify({
    email: user.name,
    password: user.password,
    passwordType: 'PBKDF2'
  });

  const params = {
    headers: {
       'Content-Type': 'application/json',
    }
  };

  return http.post('http://localhost:8080/users?latency=' + latency, payload, params);
}

export function getUser(id) {
  console.log(`Getting user ${id}`)

  const params = {
    headers: {
       'Content-Type': 'application/json',
    }
  };

  return http.get(`http://localhost:8080/users/${id}`, params);
}

export function loginUser(user) {
  console.log(`Login user ${user.name}`)

  const payload = JSON.stringify({
    email: user.name,
    password: user.password,
  });

  const params = {
    headers: {
       'Content-Type': 'application/json',
    }
  };

  return http.post('http://localhost:8080/users/login', payload, params);
}

function randomIntFromInterval(min, max) { // min and max included
  return Math.floor(Math.random() * (max - min + 1) + min)
}
<template>
  <div class="home">
    <h1>Favorites</h1>
    <p>
      Do you want to save your favorites? Feel free to register into our
      database, to save your favorites and dont forget who to vote.
    </p>
    <div class="container">
      <div class="row">
        <div class="col-6">
          <h2>Register</h2>
          <Register />
        </div>
        <div class="col-6">
          <h2>Login</h2>
          <Login />
        </div>
      </div>
    </div>
  </div>
</template>

<script>
// @ is an alias to /src
import Login from "@/components/Login.vue";
import Register from "@/components/Register.vue";

export default {
  name: "login",
  components: {
    Login,
    Register,
  },
};
</script>

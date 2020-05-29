<template>
  <form @submit.prevent="login">
    <div class="form-group">
      <label for="exampleInputEmail1">Username</label>
      <input
        type="text"
        class="form-control"
        id="username-login"
        aria-describedby="nameHelp"
        placeholder="Enter your username"
        required
        v-model="username"
      />
    </div>
    <div class="form-group">
      <label for="exampleInputPassword1">Password</label>
      <input
        type="password"
        class="form-control"
        id="password"
        placeholder="Enter your password"
        required
        v-model="password"
      />
    </div>
    <button type="submit" class="btn btn-primary">Log in</button>
  </form>
</template>

<script>
import axios from "axios";

export default {
  name: "Login",
  data() {
    return {
      username: "",
      password: "",
    };
  },
  methods: {
    login: function() {
      const config = {
        headers: {
          "Content-Type": "multipart/form-data",
        },
      };
      let form = new FormData();
      form.append("username", this.username);
      form.append("password", this.password);
      //axios.post("http://localhost:8080/registered_user/", params, config)ç
      axios({
        method: "get",
        url: "http://localhost:8080/registered_user/",
        data: form,
      })
        .then((response) => {
          console.log(response.data);
          localStorage.setItem(
            "username",
            JSON.stringify(response.data.username)
          );
          localStorage.setItem(
            "password",
            JSON.stringify(response.data.password)
          );

          console.log(localStorage);
        })
        .catch((error) => console.log(error));

      console.log(this.username);
      console.log(this.password);
    },
  },
};
</script>

<style scoped></style>

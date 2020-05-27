<template>
  <form>
    <div class="form-group">
      <label for="exampleInputEmail1">Username</label>
      <input
        type="text"
        class="form-control"
        id="username-register"
        aria-describedby="nameHelp"
        placeholder="Choose a username"
        v-model="username"
      />
    </div>
    <div class="form-group">
      <label for="exampleInputPassword1">Password</label>
      <input
        type="password"
        class="form-control"
        id="password-register"
        placeholder="Choose a password"
        v-model="password"
      />
    </div>
    <!-- <div class="form-group">
      <label for="exampleInputPassword1">Country</label>
      <input
        type="text"
        class="form-control"
        id="country"
        placeholder="Write your country"
      />
    </div> -->
    <button class="btn btn-primary">Submit</button>
  </form>
</template>

<script>
import axios from "axios";

export default {
  name: "Register",
  data() {
    return {
      username: "",
      password: "",
    };
  },
  methods: {
    register: function() {
      const config = {
        headers: {
          "Content-Type": "multipart/form-data",
        },
      };
      let form_user = new FormData();
      let form_password = new FormData();
      form_user.append("username", this.username);
      form_password.append("password", this.password);

      axios.post(
        "http://localhost:8080/registered_user/",
        form_user,
        form_password
      );
    },
  },
};
</script>

<style scoped></style>

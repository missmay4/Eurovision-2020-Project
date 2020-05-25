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
      />
    </div>
    <div class="form-group">
      <label for="exampleInputPassword1">Password</label>
      <input
        type="password"
        class="form-control"
        id="password-register"
        placeholder="Choose a password"
      />
    </div>
    <div class="form-group">
      <label for="exampleInputPassword1">Country</label>
      <input
        type="text"
        class="form-control"
        id="country"
        placeholder="Write your country"
      />
    </div>
    <button type="submit" class="btn btn-primary">Submit</button>
  </form>
</template>

<script>
export default {};
</script>

<style scoped></style>

<template>
    <div class="card border-primary mb-3" style="max-width: 18rem;">
  <div class="card-header">{{ usuario.username }}</div>
  <div class="card-body text-primary">
    <h5 class="card-title">Primary card title</h5>
    <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
  </div>
</div>
</template>
<script>
import axios from "axios"
export default {
   name: "UserFavorites",
  data() {
    return {
      usuario: Object,
      participants: Object,
    };
  },
  
    methods: {
    loadImage(imageName) {
      return require("../assets/" + imageName);
    },
      mounted() {
    axios.get("http://localhost:8080/user_favorites/").then((response) => {
      this.usuario = response.data;
      console.log(response.data)
    });
  },
  }
   
}

</script>
<style scoped>

</style>
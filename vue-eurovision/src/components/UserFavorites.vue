<template>
    <h1>Holi</h1>
</template>
<script>
//import axios from "axios"
export default {
   name: "UserFavorites",
   props:{
       user: Object,
       participant: Object,
       
   },
    methods: {
    loadImage(imageName) {
      return require("../assets/" + imageName);
    },
  }
   
}
</script>
<style scoped>

</style>
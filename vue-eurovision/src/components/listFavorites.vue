<template>
    <h1>Favorites</h1>
     <UserFavorites
          v-for="usuario in usuarios"
          :usuario="usuario"
          v-bind:key="usuario.username"
        />
</template>
<script>
import UserFavorites from "@/components/UserFavorites.vue";
import axios from "axios";
export default {
  name: "listFavorites",
  data() {
    return {
      usuarios: [],
      participants: [],
    };
  },
  mounted() {
    axios.get("http://localhost:8080/user_favorites/").then((response) => {
      this.usuarios = response.data;
      console.log(response.data);
    });
  },
  components: {
    UserFavorites,
  },
};
</script>
<style scoped>

</style>
<template>
  <div>
    <h1>Favorites</h1>
   <div class="row no-gutters">
        <UserFavorites
          v-for="usuario in usuarios"
          :usuario="usuario"
          v-bind:key="usuario.username"
        />
  </div>
</div>
</template>

<script>
import UserFavorites from "@/components/UserFavorites.vue";
import axios from "axios";

export default {
  name: "listFavorites",
  data() {
    return {
      usuarios: [],
    };
  },
  mounted() {
    axios.get("http://localhost:8080/user_favorites/").then((response) => {
      this.usuarios= response.data;
      console.log(response.data);
    });
  },
  components: {
    UserFavorites,
  },
};
</script>

<style lang="css" scoped>
.nombre {
  color: #273b75;
}
</style>

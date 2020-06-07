<template>
  <div>
    <h1 class="title display-4">Favoritos</h1>
    <div class="row no-gutters">
      <UserFavorites
        v-for="usuario in users"
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
      users: [],
    };
  },
  mounted() {
    axios.get("http://localhost:8080/user_favorites/").then((response) => {
      this.users = response.data;
      //console.log(response.data);
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
.title {
  color: #224488;
}
</style>

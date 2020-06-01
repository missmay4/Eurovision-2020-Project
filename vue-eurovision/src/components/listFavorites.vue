<template>
  <div>
    <h1>Favorites</h1>
    <table class="table">
      <thead>
        <tr>
          <th scope="col" class="nombre">Name</th>
          <th scope="col" class="nombre">Country</th>
          <th scope="col">Favorite 1</th>
          <th scope="col">Favorite 2</th>
          <th scope="col">Favorite 3</th>
          <th scope="col">Favorite 4</th>
          <th scope="col">Favorite 5</th>
          <th scope="col">Favorite 6</th>
          <th scope="col">Favorite 7</th>
          <th scope="col">Favorite 8</th>
          <th scope="col">Favorite 9</th>
          <th scope="col">Favorite 10</th>
        </tr>
      </thead>
      <tbody>
        <UserFavorites
          v-for="usuario in usuarios"
          :usuario="usuario"
          v-bind:key="usuario.username"
        />
      </tbody>
    </table>
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

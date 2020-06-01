<template>
  <tr>
    <th scope="row" class="nombreUser">{{ usuario_fav.username }}</th>
    <th scope="row">{{ usuario_fav.favorites[0].participant_fav.gala.gala_id }}</th>
    <th scope="row">
      <img
        class="flags"
        :src="
          loadImage(
            'EuroFlags/Euro' +
              usuario_fav.favorites[0].participant_fav.country.code +
              '.png'
          )
        "
        :alt="'Euro' + usuario_fav.favorites[0].participant_fav.country.code"
      />
      <p class="nombrePais">{{ usuario_fav.favorites[0].participant_fav.country.name }}</p>
    </th>
    <th scope="row">
      <img
        class="flags"
        :src="
          loadImage(
            'EuroFlags/Euro' +
              usuario_fav.favorites[1].participant_fav.country.code +
              '.png'
          )
        "
        :alt="'Euro' + usuario_fav.favorites[1].participant_fav.country.code"
      />
      <p class="nombrePais">{{ usuario_fav.favorites[1].participant_fav.country.name }}</p>
    </th>
    <th scope="row">
      <img
        class="flags"
        :src="
          loadImage(
            'EuroFlags/Euro' +
              usuario_fav.favorites[2].participant_fav.country.code +
              '.png'
          )
        "
        :alt="'Euro' + usuario_fav.favorites[2].participant_fav.country.code"
      />
      <p class="nombrePais">{{ usuario_fav.favorites[2].participant_fav.country.name }}</p>
    </th>
    <th scope="row">
      <img
        class="flags"
        :src="
          loadImage(
            'EuroFlags/Euro' +
              usuario_fav.favorites[3].participant_fav.country.code +
              '.png'
          )
        "
        :alt="'Euro' + usuario_fav.favorites[3].participant_fav.country.code"
      />
      <p class="nombrePais">{{ usuario_fav.favorites[3].participant_fav.country.name }}</p>
    </th>
    <th scope="row">
      <img
        class="flags"
        :src="
          loadImage(
            'EuroFlags/Euro' +
              usuario_fav.favorites[4].participant_fav.country.code +
              '.png'
          )
        "
        :alt="'Euro' + usuario_fav.favorites[4].participant_fav.country.code"
      />
      <p class="nombrePais">{{ usuario_fav.favorites[4].participant_fav.country.name }}</p>
    </th>
    <th scope="row">
      <img
        class="flags"
        :src="
          loadImage(
            'EuroFlags/Euro' +
              usuario_fav.favorites[5].participant_fav.country.code +
              '.png'
          )
        "
        :alt="'Euro' + usuario_fav.favorites[5].participant_fav.country.code"
      />
      <p class="nombrePais">{{ usuario_fav.favorites[5].participant_fav.country.name }}</p>
    </th>
    <th scope="row">
      <img
        class="flags"
        :src="
          loadImage(
            'EuroFlags/Euro' +
              usuario_fav.favorites[6].participant_fav.country.code +
              '.png'
          )
        "
        :alt="'Euro' + usuario_fav.favorites[6].participant_fav.country.code"
      />
      <p class="nombrePais">{{ usuario_fav.favorites[6].participant_fav.country.name }}</p>
    </th>
    <th scope="row">
      <img
        class="flags"
        :src="
          loadImage(
            'EuroFlags/Euro' +
              usuario_fav.favorites[7].participant_fav.country.code +
              '.png'
          )
        "
        :alt="'Euro' + usuario_fav.favorites[7].participant_fav.country.code"
      />
      <p class="nombrePais">{{ usuario_fav.favorites[7].participant_fav.country.name }}</p>
    </th>
    <th scope="row">
      <img
        class="flags"
        :src="
          loadImage(
            'EuroFlags/Euro' +
              usuario_fav.favorites[8].participant_fav.country.code +
              '.png'
          )
        "
        :alt="'Euro' + usuario_fav.favorites[8].participant_fav.country.code"
      />
      <p class="nombrePais">{{ usuario_fav.favorites[8].participant_fav.country.name }}</p>
    </th>
    <th scope="row">
      <img
        class="flags"
        :src="
          loadImage(
            'EuroFlags/Euro' +
              usuario_fav.favorites[9].participant_fav.country.code +
              '.png'
          )
        "
        :alt="'Euro' + usuario_fav.favorites[9].participant_fav.country.code"
      />
      <p class="nombrePais">{{ usuario_fav.favorites[9].participant_fav.country.name }}</p>
    </th>
  </tr>
</template>

<script>
export default {
  name: "UserFavorites",
  props: {
    usuario_fav: Object,
    participant_fav: Object,
  },
  methods: {
    loadImage(imageName) {
      return require("../assets/" + imageName);
    },
  },
};
</script>

<style>
.nombrePais {
  display: inline-block;
  margin-left: 10px;
}

.nombreUser {
  color: #273b75;
}

th {
  background-color: #ffffff;
}
</style>

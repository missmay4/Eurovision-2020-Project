<template>
  <tr>
    <th scope="row" class="nombreUser">{{ usuario.username }}</th>
    <th scope="row" class="nombreUser">{{ usuario.country }}</th>
    <th scope="row">
      <img
        class="flags"
        :src="
          loadImage(
            'EuroFlags/Euro' +
              usuario.favorites[0].participant.country.code +
              '.png'
          )
        "
        :alt="'Euro' + usuario.favorites[0].participant.country.code"
      />
      <p class="nombrePais">{{ usuario.favorites[0].participant.country.name }}</p>
    </th>
    <th scope="row">
      <img
        class="flags"
        :src="
          loadImage(
            'EuroFlags/Euro' +
              usuario.favorites[1].participant.country.code +
              '.png'
          )
        "
        :alt="'Euro' + usuario.favorites[1].participant.country.code"
      />
      <p class="nombrePais">{{ usuario.favorites[1].participant.country.name }}</p>
    </th>
    <th scope="row">
      <img
        class="flags"
        :src="
          loadImage(
            'EuroFlags/Euro' +
              usuario.favorites[2].participant.country.code +
              '.png'
          )
        "
        :alt="'Euro' + usuario.favorites[2].participant.country.code"
      />
      <p class="nombrePais">{{ usuario.favorites[2].participant.country.name }}</p>
    </th>
    <th scope="row">
      <img
        class="flags"
        :src="
          loadImage(
            'EuroFlags/Euro' +
              usuario.favorites[3].participant.country.code +
              '.png'
          )
        "
        :alt="'Euro' + usuario.favorites[3].participant.country.code"
      />
      <p class="nombrePais">{{ usuario.favorites[3].participant.country.name }}</p>
    </th>
    <th scope="row">
      <img
        class="flags"
        :src="
          loadImage(
            'EuroFlags/Euro' +
              usuario.favorites[4].participant.country.code +
              '.png'
          )
        "
        :alt="'Euro' + usuario.favorites[4].participant.country.code"
      />
      <p class="nombrePais">{{ usuario.favorites[4].participant.country.name }}</p>
    </th>
    <th scope="row">
      <img
        class="flags"
        :src="
          loadImage(
            'EuroFlags/Euro' +
              usuario.favorites[5].participant.country.code +
              '.png'
          )
        "
        :alt="'Euro' + usuario.favorites[5].participant.country.code"
      />
      <p class="nombrePais">{{ usuario.favorites[5].participant.country.name }}</p>
    </th>
    <th scope="row">
      <img
        class="flags"
        :src="
          loadImage(
            'EuroFlags/Euro' +
              usuario.favorites[6].participant.country.code +
              '.png'
          )
        "
        :alt="'Euro' + usuario.favorites[6].participant.country.code"
      />
      <p class="nombrePais">{{ usuario.favorites[6].participant.country.name }}</p>
    </th>
    <th scope="row">
      <img
        class="flags"
        :src="
          loadImage(
            'EuroFlags/Euro' +
              usuario.favorites[7].participant.country.code +
              '.png'
          )
        "
        :alt="'Euro' + usuario.favorites[7].participant.country.code"
      />
      <p class="nombrePais">{{ usuario.favorites[7].participant.country.name }}</p>
    </th>
    <th scope="row">
      <img
        class="flags"
        :src="
          loadImage(
            'EuroFlags/Euro' +
              usuario.favorites[8].participant.country.code +
              '.png'
          )
        "
        :alt="'Euro' + usuario.favorites[8].participant.country.code"
      />
      <p class="nombrePais">{{ usuario.favorites[8].participant.country.name }}</p>
    </th>
    <th scope="row">
      <img
        class="flags"
        :src="
          loadImage(
            'EuroFlags/Euro' +
              usuario.favorites[9].participant.country.code +
              '.png'
          )
        "
        :alt="'Euro' + usuario.favorites[9].participant.country.code"
      />
      <p class="nombrePais">{{ usuario.favorites[9].participant.country.name }}</p>
    </th>
  </tr>
</template>

<script>
export default {
  name: "UserFavorites",
  props: {
    usuario: Object,
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

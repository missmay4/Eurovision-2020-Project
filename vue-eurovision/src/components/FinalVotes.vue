<template>
  <div class="col-xl-2 col-lg-3 col-md-4 col-sm-6">
    <div class="card" style="width: 18rem;">
      <div class="card-header bg-danger text-white">
        {{ usuario.name }}
      </div>
      <div
        class="card-header bg-primary text-white"
        v-if="usuario.votos[0].gala_id == 3"
      >
        Final
      </div>
      <div class="card-header bg-primary text-white" v-else>
        Semifinal
      </div>
      <ul class="list-group list-group-flush">
        <li class="list-group-item">
          <img
            class="flags"
            :src="
              loadImage(
                'EuroFlags/Euro' +
                  usuario.votos[0].participant.country.code +
                  '.png'
              )
            "
            :alt="'Euro' + usuario.votos[0].participant.country.code"
          />
          <p class="countryName">
            {{ usuario.votos[0].participant.country.name }}
          </p>
        </li>
        <li class="list-group-item">
          <img
            class="flags"
            :src="
              loadImage(
                'EuroFlags/Euro' +
                  usuario.votos[1].participant.country.code +
                  '.png'
              )
            "
            :alt="'Euro' + usuario.votos[1].participant.country.code"
          />
          <p class="countryName">
            {{ usuario.votos[1].participant.country.name }}
          </p>
        </li>
        <li class="list-group-item">
          <img
            class="flags"
            :src="
              loadImage(
                'EuroFlags/Euro' +
                  usuario.votos[2].participant.country.code +
                  '.png'
              )
            "
            :alt="'Euro' + usuario.votos[2].participant.country.code"
          />
          <p class="countryName">
            {{ usuario.votos[2].participant.country.name }}
          </p>
        </li>
      </ul>
    </div>
  </div>
</template>

<script>
export default {
  name: "FinalVotes",
  props: {
    usuario: Object,
    participant: Object,
  },
  methods: {
    loadImage(imageName) {
      return require("../assets/" + imageName);
    },
  },
};
</script>

<style>
.countryName {
  display: inline-block;
  margin-left: 10px;
}

.username {
  color: #273b75;
}

th {
  background-color: #ffffff;
}
</style>

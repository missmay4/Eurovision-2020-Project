<template>
  <div>
    <h1 class="display-4 title">Participantes</h1>
    <p>
      Aqui, puedes ver el artista de cada país, escuchar su cancion y, si quieres, seleccionarlo
      como favoritos después de escuchar su canción. Puedes guardar en nuestra base de datos un total
      de 10 favoritos. Solo tienes que seleccionarlo como favorito y una vez hayas seleccionado 10,
      pulsar en el boton 'Guardar como favorito'.
    </p>
    <span class="badge badge-danger elem">
      Has seleccionado
      <b>{{ checked.length }}</b>
    </span>

    <div class="row no-gutters">
      <Participant
        v-for="participant in participants"
        :id="participant.id"
        :name="participant.name"
        :country="participant.country.name"
        :countryCode="participant.country.code"
        :songLink="participant.song_link"
        :songName="participant.song"
        v-bind:key="participant.name"
        v-model="checked"
        :disabled="
          checked.length >= 10 && checked.indexOf(participant.id) === -1
        "
      />
    </div>
    <div class="row">
      <div class="col-12">
        <FavoritesButton
          :selectedParticipants="checked"
          :participants="participants"
          :disabled="checked.length < 10"
        />
      </div>
    </div>
  </div>
</template>

<script>
import Participant from "@/components/Participant.vue";
import FavoritesButton from "@/components/FavoritesButton.vue";
import axios from "axios";

export default {
  name: "listParticipants",
  data() {
    return {
      participants: [],
      checked: []
    };
  },

  mounted() {
    axios.get("http://localhost:8080/onlyparticipants/").then(response => {
      let data = response.data;
      data.sort((a, b) => a.country.name.localeCompare(b.country.name));
      this.participants = data;
    });
  },
  components: {
    Participant,
    FavoritesButton
  }
};
</script>

<style scoped>
.title {
  color: #224488;
}
.elem {
  font-size: 1em;
  position: fixed;
  /* right: 0; */
  bottom: 0;
  left: 0;
  z-index: 1030;
  margin-bottom: 25em;
}
</style>
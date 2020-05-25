<template>
  <div>
    <h1>Participants</h1>
    <!-- <div class="row">
      <div class="col-md-12">
    <ul class="nav nav-tabs justify-content-center">-->
    <!-- <li class="nav-item">
            <a class="nav-link" href="#participants" @click="gala=undefined">Ver todos</a>
    </li>-->
    <!-- <li class="nav-item">
            <a class="nav-link" href="#first-semi-final" @click="gala=1">1st Semifinal</a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="#second-semi-final" @click="gala=2">2nd Semifinal</a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="#grand-final" @click="gala=3">Final</a>
          </li>
        </ul>
      </div>
    </div>-->
    <div class="row no-gutters">
      <Participant
        v-for="participant in participants"
        :name="participant.name"
        :country="participant.country.name"
        :countryCode="participant.country.code"
        :songLink="participant.song_link"
        v-bind:key="participant.name"
      />

      <!-- <Participant
        v-for="participant in participants"
        v-if="gala===undefined || participant.gala.gala_id===gala"
        :name="participant.name"
        :country="participant.country.name"
        :countryCode="participant.country.code"
        :songLink="participant.song_link"
      />-->
    </div>
  </div>
</template>

<script>
import Participant from "@/components/Participant.vue";
import axios from "axios";

export default {
  name: "listParticipants",
  data() {
    return {
      participants: [],
      gala: undefined,
    };
  },
  mounted() {
    axios.get("http://localhost:8080/onlyparticipants/").then((response) => {
      let data = response.data;
      data.sort((a, b) => a.country.name.localeCompare(b.country.name));
      this.participants = data;
    });
    /* let currentRoute = this.$router.currentRoute.hash;

    if (currentRoute === "#first-semi-final") {
      this.gala = 1;
    } else if (currentRoute === "#second-semi-final") {
      this.gala = 2;
    } else if (currentRoute === "#grand-final") {
      this.gala = 3;
    } */
  },
  components: {
    Participant,
  },
};
</script>

<style scoped></style>

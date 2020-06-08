<template>
  <div class="modal fade bd-example-modal-sm">
    <div class="modal-dialog modal-sm">
      <div class="modal-content">
        <div class="modal-header">
          <h6 class="modal-title">Tus votos</h6>
        </div>
        <div class="modal-body">
          <!-- Votos  -->
          <imageCountry
            v-for="participant in participants.filter((participant) => {
              return selectedParticipants.indexOf(participant.id) !== -1;
            })"
            :participant="participant"
            v-bind:key="participant.id"
          />
          <form action>
            <div class="form-group row">
              <div class="col-sm-12">
                <input
                  type="name"
                  class="marg"
                  required
                  v-bind:class="{ 'form-control': true, 'is-invalid': !valido }"
                  placeholder="Tu nombre"
                  v-model="name"
                />
                <div class="invalid-feedback">El usuario ya existe</div>
              </div>
            </div>
          </form>
        </div>
        <div class="modal-footer">
          <button @click="vote()" class="btn btn-primary" data-dismiss="modal">
            A votar!
          </button>
          <!-- <button type="button" class="btn btn-default" data-dismiss="modal">Salir</button> -->
        </div>
      </div>
    </div>
  </div>
</template>

<script>
import imageCountry from "@/components/imageCountry.vue";
import axios from "axios";

export default {
  name: "VoteModal",
  props: {
    selectedParticipants: Array,
    participants: Array,
  },
  data() {
    return {
      name: "",
      valido: true,
    };
  },
  methods: {
    vote: function() {
      const config = {
        headers: {
          "Content-Type": "multipart/form-data",
        },
      };
      let form_user = new FormData();
      form_user.append("name", this.name);

      let form_votes = new FormData();
      form_votes.append("vote1", this.selectedParticipants[0]);
      form_votes.append("vote2", this.selectedParticipants[1]);
      form_votes.append("vote3", this.selectedParticipants[2]);
      form_votes.append("gala", this.participants[0].gala.gala_id);

      axios
        .post("http://localhost:8080/user/", form_user)
        .then((response) => {
          axios
            .post(
              "http://localhost:8080/user/" + response.data.id + "/vote",
              form_votes
            )
            .then((response) => {
              this.valido = true;
            });

          console.log(response.data);
          alert(this.name + " has guardado tus votos");
        })
        .catch((error) => {
          // handle error
          this.valido = false;
        });
    },
  },
  components: {
    imageCountry,
  },
};
</script>

<style scoped>
.marg {
  margin-top: 10px;
}
</style>

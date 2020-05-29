<template>
  <div class="votonCentrado">
    <div class="col-md-12">
      <button
        type="button"
        class="btn btn-danger btn-block"
        @click="showModal"
        :disabled="disabled"
      >
        Save your favorites
      </button>
      <FavoritesModal
        :selectedParticipants="selectedParticipants"
        :participants="participants"
        ref="modal"
      />
    </div>
  </div>
</template>

<script>
import FavoritesModal from "@/components/FavoritesModal.vue";

export default {
  name: "FavoritesButton",
  props: {
    disabled: Boolean,
    selectedParticipants: Array,
    participants: Array,
  },
  methods: {
    showModal() {
      let element = this.$refs.modal.$el;
      $(element).modal("show");
    },
  },
  components: {
    FavoritesModal,
  },
};
</script>

<style lang="css" scoped>
.votonCentrado {
  text-align: center;
  margin-top: 20px;
}
</style>

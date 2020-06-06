<template>
  <div class="centeredButton">
    <div class="col-md-12">
      <button type="button" class="btn btn-danger btn-block" @click="showModal" :disabled="disabled">Vota</button>
      <VoteModal :selectedParticipants="selectedParticipants" :participants="participants" ref="modal" />
    </div>
  </div>
</template>


<script>
  import VoteModal from "@/components/VoteModal.vue";

  export default {
    name: "VotesButton",
    props: {
      disabled: Boolean,
      selectedParticipants: Array,
      participants: Array
    },
    methods: {
      showModal() {
        let element = this.$refs.modal.$el;
        $(element).modal("show");
      }
    },
    components: {
      VoteModal
    }
  };
</script>

<style lang="css" scoped>
  .centeredButton {
    text-align: center;
    margin-top: 20px;
  }
</style>
<template>
	<div class="day">
		{{ day }}
	</div>
</template>

<script>
	export default {
		name: "Day",
		props: {
			day: {
				type: Number,
				required: true
			}
		}
	}
</script>

<style scoped>
	.day {
		display: inline-block;

		border: 1px solid black;
		border-radius: 5px;

		font-size: 25px;

		width: 35px;
		height: 35px;

		text-align: center;
	}
</style>
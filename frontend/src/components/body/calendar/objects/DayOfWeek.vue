<template>
	<div class="dayOfWeek" v-for="dow in dayOfWeekTexts" :key="dow">
		<p class="text" v-text="dow"/>
	</div>
</template>

<script>
export default {
	name: "DayOfWeek",
	data() {
		return {
			dayOfWeekTexts: ["Пн", "Вт", "Ср", "Чт", "Пт", "Сб", "Вс"]
		}
	}
}
</script>

<style scoped>
	.dayOfWeek {
		display: inline-block;

		border: 1px solid black;
		border-radius: 5px;

		width: 35px;
		height: 35px;

		font-size: 25px;
		text-align: center;
		margin: 4.9px;

		background: #F0C5F6;
	}

	.text {
		margin: 0px
	}
</style>
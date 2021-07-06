<template>
	<div class="month">
		<h2>{{monthLabel}}</h2>
		<div class="innerDiv">
			<div class="header">
				<DayOfWeek/>
			</div>
			<Day class="day" v-for="day in days" :key="day" v-bind:day="day"/>
		</div>
	</div>
</template>

<script>
	import Day from './Day'
	import DayOfWeek from "./DayOfWeek";

	export default {
		props: {
			monthNumber: {
				type: Number,
				required: true
			},
			yearNumber: {
				type: Number,
				required: true
			}
		},
		name: "Month",
		data() {
			return {
				days: [],
				dayOfWeek: -1,
				monthLabel: "",
				monthsDaysCount: [31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31],
				monthsLabels: ["Январь", "Февраль", "Март", "Апрель", "Май", "Июнь", "Июль", "Август", "Сентябрь", "Октябрь",
					"Ноябрь", "Декабрь"],
				monthCode: [1, 4, 4, 0, 2, 5, 0, 3, 6, 1, 4, 6],
				yearCode: 0
			}
		},
		methods: {
			isLeapYear: function (year) {
				return (year && ((year % 4 === 0) && (year % 100 !== 0) || (year % 400 === 0)));
			}
		},
		components: {
			Day,
			DayOfWeek
		},
		beforeMount() {
			if (this.isLeapYear(this.yearNumber)) {
				this.monthsDaysCount[1] = 29;
			}

			this.monthLabel = this.monthsLabels[this.monthNumber - 1];

			this.days = Array.from(Array(this.monthsDaysCount[this.monthNumber - 1]).keys());
			this.days = this.days.map(key => key + 1);

			this.yearCode = (6 + (this.yearNumber % 100) + Math.floor((this.yearNumber % 100) / 4)) % 7;

			this.dayOfWeek = (((this.monthCode[this.monthNumber - 1] + this.yearCode) % 7) + 6) % 7;

			this.days = (new Array(this.dayOfWeek).fill(0)).concat(this.days)
		}
	}
</script>

<style scoped>
	.day {
		margin: 5px;
	}

	.month {
		display: inline-table;

		text-align: left;
	}

	.innerDiv {
		width: 330px;
		height: 335px;

		border: 1px solid black;
		border-radius: 5px;

		background: #FAF3EB;
	}

	.header {
		height: 50px;
		border-radius: 5px;
		background: #C9ECF3;
	}
</style>
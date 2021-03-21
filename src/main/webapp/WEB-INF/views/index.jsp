<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>index.jspddd</title>


<!-- <script src="/webjars/jquery/3.6.0/jquery.min.js"></script> -->
<script src="http://code.jquery.com/jquery-latest.min.js"></script>
<script>
	$(document)
			.ready(
					function() {
						console.log("ready11111111111!");

						var param = {};
						param.segmentGroup = [];
						param.pricingOptionGroup = [];


						setSegmentGroup(param);
						setPricingOptionGroup(param);

						console.log('param=', param);

						$.ajax({
							method : "POST",
							url : "/rest/upsell",
							dataType : 'json',
					        contentType: "application/json",
// 							data : param
							data : JSON.stringify(param)
						}).done(function(msg) {
							alert("Data Saved: " + msg);
						});
					});
	$(function() {
		console.log("ready2222222222!");
	});



	function setPricingOptionGroup(param){

		var pricingOptionKeys = ['RP', 'VC'];//
		var otherCompanys = ['', 'EY'];//

		$.each(pricingOptionKeys, function(index, value) {
			// get
			var pricingOptionKey = pricingOptionKeys[index];// 출발일
			var otherCompany = otherCompanys[index];// 출발일

			// set
			var o = {};
			var pricingOptionKey_={};
			pricingOptionKey_.pricingOptionKey = pricingOptionKey;
			o.pricingOptionKey = pricingOptionKey_;
			if (otherCompany != '') {
				var carrierInformation = {};
				carrierInformation.companyIdentification = {};
				carrierInformation.companyIdentification.otherCompany = otherCompany;
				o.carrierInformation = carrierInformation;
			}
			param.pricingOptionGroup.push(o);
		});
	}



	function setSegmentGroup(param){

		// TODO SET
		var departureDates = ['010321', '020321', '020321', '020321'];// 출발일
		var trueLocationId_boards = ['ICN', 'AUH', 'MXP', 'AUH'];// 출발지
		var trueLocationId_offs = ['AUH', 'MXP', 'AUH', 'ICN'];// 도착지
		var marketingCompanys = ['EY', 'EY', 'EY', 'EY'];// 항공사?
		var flightNumbers = ['873', '81', '88', '876'];// 비행번호
		var bookingClasss = ['Q', 'Q', 'Q', 'Q'];// 부킹클래스
		var flightIndicators = [1, 1, 2, 2];//
		var itemNumbers = [1, 2, 3, 4];// seg의 순번


		$.each(departureDates, function(index, value) {
			// get
			var departureDate = departureDates[index];// 출발일
			var trueLocationId_board = trueLocationId_boards[index];// 출발지
			var trueLocationId_off = trueLocationId_offs[index];// 도착지
			var marketingCompany = marketingCompanys[index];// 항공사?
			var flightNumber = flightNumbers[index];// 비행번호
			var bookingClass = bookingClasss[index];// 부킹클래스
			var flightIndicator = flightIndicators[index];//
			var itemNumber = itemNumbers[index];//

			// set
			var segmentInformation = {};
			segmentInformation.flightDate = {};
			segmentInformation.flightDate.departureDate = departureDate;// 출발일
			segmentInformation.boardPointDetails = {};
			segmentInformation.boardPointDetails.trueLocationId = trueLocationId_board;// 출발지
			segmentInformation.offpointDetails = {};
			segmentInformation.offpointDetails.trueLocationId = trueLocationId_off;// 도착지
			segmentInformation.companyDetails = {};
			segmentInformation.companyDetails.marketingCompany = marketingCompany;// 항공사?
			segmentInformation.flightIdentification = {};
			segmentInformation.flightIdentification.flightNumber = flightNumber;// 비행번호
			segmentInformation.flightIdentification.bookingClass = bookingClass;// 부킹클래스
			segmentInformation.flightTypeDetails = {};
			segmentInformation.flightTypeDetails.flightIndicator = flightIndicator;//
			segmentInformation.itemNumber = itemNumber;//
			param.segmentGroup.push(segmentInformation);
		});


	}





</script>
</head>
<body>index.jsp

</body>
</html>
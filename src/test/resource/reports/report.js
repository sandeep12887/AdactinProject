$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("adactin.feature");
formatter.feature({
  "line": 2,
  "name": "AdactIn Hotel Application",
  "description": "",
  "id": "adactin-hotel-application",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@FeatureTag_1"
    }
  ]
});
formatter.scenarioOutline({
  "line": 5,
  "name": "TC-1.Verify user login with valid credentials",
  "description": "",
  "id": "adactin-hotel-application;tc-1.verify-user-login-with-valid-credentials",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 4,
      "name": "@tc_1"
    },
    {
      "line": 4,
      "name": "@test"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "user should launch the hotel reservation application",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user should launch the hotel reservation application",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "User should enter valid username \u0027\u003cusername\u003e\u0027",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "user should enter valid password \"\u003cpassword\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "User click the login button",
  "keyword": "Then "
});
formatter.examples({
  "line": 11,
  "name": "",
  "description": "",
  "id": "adactin-hotel-application;tc-1.verify-user-login-with-valid-credentials;",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 12,
      "id": "adactin-hotel-application;tc-1.verify-user-login-with-valid-credentials;;1"
    },
    {
      "cells": [
        "thenmozhi123",
        "A58702"
      ],
      "line": 13,
      "id": "adactin-hotel-application;tc-1.verify-user-login-with-valid-credentials;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 483951,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "TC-1.Verify user login with valid credentials",
  "description": "",
  "id": "adactin-hotel-application;tc-1.verify-user-login-with-valid-credentials;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@FeatureTag_1"
    },
    {
      "line": 4,
      "name": "@tc_1"
    },
    {
      "line": 4,
      "name": "@test"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "user should launch the hotel reservation application",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user should launch the hotel reservation application",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "User should enter valid username \u0027thenmozhi123\u0027",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "user should enter valid password \"A58702\"",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "User click the login button",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_should_launch_the_hotel_reservation_application()"
});
formatter.result({
  "duration": 2282536631,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_should_launch_the_hotel_reservation_application()"
});
formatter.result({
  "duration": 191595684,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "thenmozhi123",
      "offset": 34
    }
  ],
  "location": "StepDefinition.user_should_enter_valid_username(String)"
});
formatter.result({
  "duration": 181557944,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "A58702",
      "offset": 34
    }
  ],
  "location": "StepDefinition.user_should_enter_valid_password(String)"
});
formatter.result({
  "duration": 79403551,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_click_the_login_button()"
});
formatter.result({
  "duration": 497934812,
  "status": "passed"
});
formatter.after({
  "duration": 600396168,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 16,
  "name": "TC-2.To verify whether the check-out date field accepts a",
  "description": "       later date than checkin date",
  "id": "adactin-hotel-application;tc-2.to-verify-whether-the-check-out-date-field-accepts-a",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 15,
      "name": "@tc_2"
    },
    {
      "line": 15,
      "name": "@test"
    }
  ]
});
formatter.step({
  "line": 18,
  "name": "User should select the location \"\u003clocation\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 19,
  "name": "User should select the hotel \"\u003chotel\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 20,
  "name": "User should select the room type\"\u003croomtype\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 21,
  "name": "User should select the no of rooms\"\u003crooms\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 22,
  "name": "user should enter checkin date \"\u003ccheckindate\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 23,
  "name": "user should enter the checkout date with day before in checkin\"\u003ccheckoutdate\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 24,
  "name": "user should click the search button",
  "keyword": "Then "
});
formatter.step({
  "line": 25,
  "name": "Verify that system gives an error saying check-in-date should not be later than check-out-date",
  "keyword": "Then "
});
formatter.examples({
  "line": 26,
  "name": "",
  "description": "",
  "id": "adactin-hotel-application;tc-2.to-verify-whether-the-check-out-date-field-accepts-a;",
  "rows": [
    {
      "cells": [
        "location",
        "hotel",
        "roomtype",
        "rooms",
        "checkindate",
        "checkoutdate"
      ],
      "line": 27,
      "id": "adactin-hotel-application;tc-2.to-verify-whether-the-check-out-date-field-accepts-a;;1"
    },
    {
      "cells": [
        "Sydney",
        "Hotel Creek",
        "Standard",
        "4",
        "07/06/2019",
        "05/06/2019"
      ],
      "line": 28,
      "id": "adactin-hotel-application;tc-2.to-verify-whether-the-check-out-date-field-accepts-a;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 272988,
  "status": "passed"
});
formatter.scenario({
  "line": 28,
  "name": "TC-2.To verify whether the check-out date field accepts a",
  "description": "       later date than checkin date",
  "id": "adactin-hotel-application;tc-2.to-verify-whether-the-check-out-date-field-accepts-a;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@FeatureTag_1"
    },
    {
      "line": 15,
      "name": "@tc_2"
    },
    {
      "line": 15,
      "name": "@test"
    }
  ]
});
formatter.step({
  "line": 18,
  "name": "User should select the location \"Sydney\"",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 19,
  "name": "User should select the hotel \"Hotel Creek\"",
  "matchedColumns": [
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 20,
  "name": "User should select the room type\"Standard\"",
  "matchedColumns": [
    2
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 21,
  "name": "User should select the no of rooms\"4\"",
  "matchedColumns": [
    3
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 22,
  "name": "user should enter checkin date \"07/06/2019\"",
  "matchedColumns": [
    4
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 23,
  "name": "user should enter the checkout date with day before in checkin\"05/06/2019\"",
  "matchedColumns": [
    5
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 24,
  "name": "user should click the search button",
  "keyword": "Then "
});
formatter.step({
  "line": 25,
  "name": "Verify that system gives an error saying check-in-date should not be later than check-out-date",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Sydney",
      "offset": 33
    }
  ],
  "location": "StepDefinition.user_should_select_the_location(String)"
});
formatter.result({
  "duration": 174423120,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Hotel Creek",
      "offset": 30
    }
  ],
  "location": "StepDefinition.user_should_select_the_hotel(String)"
});
formatter.result({
  "duration": 169982226,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Standard",
      "offset": 33
    }
  ],
  "location": "StepDefinition.user_should_select_the_room_type(String)"
});
formatter.result({
  "duration": 116218607,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "4",
      "offset": 35
    }
  ],
  "location": "StepDefinition.user_should_select_the_no_of_rooms(String)"
});
formatter.result({
  "duration": 121978614,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "07/06/2019",
      "offset": 32
    }
  ],
  "location": "StepDefinition.user_should_enter_checkin_date(String)"
});
formatter.result({
  "duration": 321168973,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "05/06/2019",
      "offset": 63
    }
  ],
  "location": "StepDefinition.user_should_enter_the_checkout_date_with_day_before_in_checkin(String)"
});
formatter.result({
  "duration": 168093434,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_should_click_the_search_button()"
});
formatter.result({
  "duration": 90730775,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.verify_that_system_gives_an_error_saying_check_in_date_should_not_be_later_than_check_out_date()"
});
formatter.result({
  "duration": 68615192,
  "status": "passed"
});
formatter.after({
  "duration": 397972224,
  "status": "passed"
});
});
Feature: ASK_360
  Scenario: Verify if Teacher can create Quiz with Alphanumeric & Sp. characters in Title.
    Given I open url"http://local.school.portnov.com:4520/#/login"
    Then Type email "dragonscorp1+2@gmail.com"
    And Type Password "Portnov"
    And Push Sign In button
    And Click on Quizzes on left navigational panel
    And Push "Create New Quiz" button
    And Type Title of the Quiz "Who are you? #$&*"
    And Click Add Question
    And Select textual radio button
    And Type text in Question "How"
    And Push on Save button
    And Verify if Quiz "Who are you? #$&*" appears in the List of Quizzes
    And Delete this quiz "Who are you? #$&*"

  Scenario: Quiz - Title: The field is required
    Given I open url"http://local.school.portnov.com:4520/#/login"
    Then Type email "dragonscorp1+2@gmail.com"
    And Type Password "Portnov"
    And Push Sign In button
    And Click on Quizzes on left navigational panel
    And Push "Create New Quiz" button
    And Click to "Title of the Quiz"
    And Click to an "Any" place
    And Verify if Quiz "This field is required" appears in the List of Quizzes

  Scenario: Verify if Teacher can create Quiz with min 1 Character in Title.
    Given I open url"http://local.school.portnov.com:4520/#/login"
    Then Type email "dragonscorp1+2@gmail.com"
    And Type Password "Portnov"
    And Push Sign In button
    And Click on Quizzes on left navigational panel
    And Push "Create New Quiz" button
    And Type Title of the Quiz "Who are you?"
    And Click Add Question
    And Select textual radio button
    And Type text in Question "H"
    And Push on Save button
    And Verify if Quiz "Who are you?" appears in the List of Quizzes
    And Delete this quiz "Who are you?"

  Scenario: Verify if Teacher can create a Quiz with max 1000 characters in Title.
    Given I open url"http://local.school.portnov.com:4520/#/login"
    Then Type email "dragonscorp1+2@gmail.com"
    And Type Password "Portnov"
    And Push Sign In button
    And Click on Quizzes on left navigational panel
    And Push "Create New Quiz" button
    And Type Title of the Quiz "One morning, when Gregor Samsa woke from troubled dreams, he found himself transformed in his bed into a horrible vermin. He lay on his armour-like back, and if he lifted his head a little he could see his brown belly, slightly domed and divided by arches into stiff sections. The bedding was hardly able to cover it and seemed ready to slide off any moment. His many legs, pitifully thin compared with the size of the rest of him, waved about helplessly as he looked. What's happened to me? he thought. It wasn't a dream. His room, a proper human room although a little too small, lay peacefully between its four familiar walls. A collection of textile samples lay spread out on the table - Samsa was a travelling salesman - and above it there hung a picture that he had recently cut out of an illustrated magazine and housed in a nice, gilded frame. It showed a lady fitted out with a fur hat and fur boa who sat upright, raising a heavy fur muff that covered the whole of her lower arm towards too"
    And Click Add Question
    And Select textual radio button
    And Type text in Question "How"
    And Push on Save button
    And Verify if Quiz "One morning, when Gregor Samsa woke from" appears in the List of Quizzes
    And Delete this quiz "One morning, when Gregor Samsa woke from"

  Scenario: Verify that Teacher can't create Quiz with 1001 and more characters in Title.
    Given I open url"http://local.school.portnov.com:4520/#/login"
    Then Type email "dragonscorp1+2@gmail.com"
    And Type Password "Portnov"
    And Push Sign In button
    And Click on Quizzes on left navigational panel
    And Push "Create New Quiz" button
    And Type Title of the Quiz "One morning, when a Gregor Samsa woke from troubled dreams, he found himself transformed in his bed into a horrible vermin. He lay on his armour-like back, and if he lifted his head a little he could see his brown belly, slightly domed and divided by arches into stiff sections. The bedding was hardly able to cover it and seemed ready to slide off any moment. His many legs, pitifully thin compared with the size of the rest of him, waved about helplessly as he looked. What's happened to me? he thought. It wasn't a dream. His room, a proper human room although a little too small, lay peacefully between its four familiar walls. A collection of textile samples lay spread out on the table - Samsa was a travelling salesman - and above it there hung a picture that he had recently cut out of an illustrated magazine and housed in a nice, gilded frame. It showed a lady fitted out with a fur hat and fur boa who sat upright, raising a heavy fur muff that covered the whole of her lower arm towards too"
    And Click Add Question
    And Select textual radio button
    And Type text in Question "How"
    And Push on Save button
    And Verify if Quiz "One morning, when Gregor Samsa woke from" appears in the List of Quizzes
    And Delete this quiz "One morning, when Gregor Samsa woke from"

  Scenario: Quiz - Title: Leading and trailing space characters should be eliminated
    Given I open url"http://local.school.portnov.com:4520/#/login"
    Then Type email "dragonscorp1+2@gmail.com"
    And Type Password "Portnov"
    And Push Sign In button
    And Click on Quizzes on left navigational panel
    And Push "Create New Quiz" button
    And Type Title of the Quiz " 1 Quiz ASK-368 "
    And Click Add Question
    And Select textual radio button
    And Type text in Question "How"
    And Push on Save button
    And Verify if Quiz " 1 Quiz ASK-368 " appears in the List of Quizzes
    And Delete this quiz " 1 Quiz ASK-368 "
Feature: Horekuapp validation

  Scenario Outline: Horekuapp validation
    Given User navigates to 'https://the-internet.herokuapp.com/'
    When User clicks '<link>'
    Then User validates '<url>'

    Examples:
    | link                             | url                                                     |
    | A/B Testing                      | https://the-internet.herokuapp.com/abtest               |
    | Add/Remove Elements              | https://the-internet.herokuapp.com/add_remove_elements/ |
    | Basic Auth                       | https://the-internet.herokuapp.com/basic_auth           |
    | Broken Images                    | https://the-internet.herokuapp.com/broken_images        |
    | Challenging DOM                  | https://the-internet.herokuapp.com/challenging_dom      |
    | Checkboxes                       | https://the-internet.herokuapp.com/checkboxes           |
    | Context Menu                     | https://the-internet.herokuapp.com/context_menu         |
    | Digest Authentication            | https://the-internet.herokuapp.com/digest_auth          |
    | Disappearing Elements            | https://the-internet.herokuapp.com/disappearing_elements|
    | Drag and Drop                    | https://the-internet.herokuapp.com/drag_and_drop        |



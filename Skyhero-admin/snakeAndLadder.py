import time
import random
import sys

SLEEP_BETWEEN_ACTIONS = 1
MAX_VAL = 100
DICE_FACE = 6

snakes = {
    17: 7,
    54: 34,
    62: 19,
    64: 60,
    87: 36,
    95: 75,
    93: 73,
    98: 79,
    
}

ladders = {
    
    4: 14,
    9: 31,
    1: 38,
    21: 42,
    28: 84,
    51: 67,
    72: 91,
    80: 99
    
}

def welcome_msg():
    msg = "Welcome to Snake and Ladder Game"
    print(msg)
    
def get_player_names():
    player1_name = input("Please enter a valid name for first player: ").strip()
    player2_name = input("Please enter a valid name for second player: ").strip()
    print("\nMatch will be played between '" + player1_name + "' and '" + player2_name + "'\n")
    return player1_name, player2_name

def get_dice_value():
    time.sleep(SLEEP_BETWEEN_ACTIONS)
    dice_value = random.randint(1, DICE_FACE)
    print("Its a " + str(dice_value))
    return dice_value

def got_snake_bite(old_value, current_value, player_name):
    print("\n" + "Snake Bite" + " ~~~~~~~~>")
    print("\n" + player_name + " got a snake bite. Down from " + str(old_value) +" to " + str(current_value))
    
def got_ladder_jump(old_value, current_value, player_name):
    print("\n" +"Woww , nailed it" + " ########")
    print("\n" + player_name + " climbed the ladder from " + str(old_value) + " to " + str(current_value))

def snake_ladder(player_name, current_value, dice_value):
    time.sleep(SLEEP_BETWEEN_ACTIONS)
    old_value = current_value
    current_value = current_value + dice_value
    if current_value > MAX_VAL:
        print("You need " + str(MAX_VAL - old_value) + " to win this game. Keep trying.")
        return (old_value)
    print("\n" + player_name + " moved from " + str(old_value) + " to " + str(current_value))
    if current_value in snakes:
        final_value = snakes.get(current_value)
        got_snake_bite(current_value, final_value, player_name)
    elif current_value in ladders:
        final_value = ladders.get(current_value)
        got_ladder_jump(current_value, final_value, player_name)
    else:
        final_value = current_value
    
    return final_value

def check_win(player_name, position):
    
    time.sleep(SLEEP_BETWEEN_ACTIONS)
    if MAX_VAL == position:
        
        print("\n\n\nThats it.\n\n" + player_name + " won the game.")
        print("Congratulations " + player_name)
        print("\nThank you for playing the game. Hope you enjoyed the game\n\n")
        sys.exit(1)
        
welcome_msg()
time.sleep(SLEEP_BETWEEN_ACTIONS)
player1_name, player2_name = get_player_names()
time.sleep(SLEEP_BETWEEN_ACTIONS)
player1_current_position = 0
player2_current_position = 0
while True:
    time.sleep(SLEEP_BETWEEN_ACTIONS)
    input_1 = input("\n" + player1_name + ": " + " Hit the enter to roll dice: ")
    print("\nRolling dice...")
    dice_value = get_dice_value()
    time.sleep(SLEEP_BETWEEN_ACTIONS)
    print(player1_name + " moving....")
    player1_current_position = snake_ladder(player1_name, player1_current_position, dice_value)
    check_win(player1_name, player1_current_position)
    input_2 = input("\n" + player2_name + ": "  + " Hit the enter to roll dice: ")
    print("\nRolling dice...")
    dice_value = get_dice_value()
    time.sleep(SLEEP_BETWEEN_ACTIONS)
    print(player2_name + " moving....")
    player2_current_position = snake_ladder(player2_name, player2_current_position, dice_value)
    check_win(player2_name, player2_current_position)
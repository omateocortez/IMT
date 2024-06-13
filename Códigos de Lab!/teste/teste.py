import tkinter as tk

class CustomOptionMenu:
    def __init__(self, master, options):
        self.var = tk.StringVar(master)
        self.var.set(options[0])  # Set the default option

        self.menu = tk.OptionMenu(master, self.var, *options)
        self.menu.pack()

# Create a tkinter window
window = tk.Tk()
window.title("Dropdown Menu Example")

# Define options for the dropdown menu
options = ["Option 1", "Option 2", "Option 3", "Option 4"]

# Create a CustomOptionMenu instance
dropdown = CustomOptionMenu(window, options)

# Function to print the selected option
def print_selected_option():
    selected_option = dropdown.var.get()
    print("Selected Option:", selected_option)

# Create a button to print the selected option
btn_print = tk.Button(window, text="Print Selected Option", command=print_selected_option)
btn_print.pack()

# Run the tkinter event loop
window.mainloop()

contacts = []

def create_contact(first_name,last_name,phone_number):
    
    for contact in contacts:  
        if contact[-1] == phone_number:
            return None
    
    contact = [first_name,last_name,phone_number]
    
    
    contacts.append([first_name,last_name,phone_number])
    return contact
    
def clear_contacts:
    contacts.clear()

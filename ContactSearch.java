class ContactSearch {
 
    static long getMobileByEmail(String email) { 
        System.out.println("Running getMobileByEmail: " + email);

        if (email == "ranbir.kapoor@example.com") 
  {
            return 9876543210L;
        } 
  
  else if (email == "anushka.sharma@example.com") 
  {
            return 8765432109L;
        } 
  
  else if (email == "suresh.shetty@example.com") 
  {
            return 7654321098L;
        } 
  
  else if (email == "kareena.kapoor@example.com")
   {
            return 6543210987L;
        } 
  
  else if (email == "rohith.sharma@example.com")
   {
            return 5432109876L;
        } 
  
  else if (email == "shilpa.shetty@example.com")
   {
            return 4321098765L;
        } 
  
  else if (email == "shahidh.kapoor@example.com") 
  {
            return 3210987654L;
        } 
  
  else if (email == "ravi.sharma@example.com")
   {
            return 2109876543L;
        } 
  
  else if (email == "anushka.shetty@example.com") 
  {
            return 1098765432L;
        } 
  
  else if (email == "karishma.kapoor@example.com")
   {
            return 9988776655L;
        } 
  
  else if (email == "manish.sharma@example.com") 
  {
            return 8877665544L;
        }

  else if (email == "sunil.shetty@example.com") 
  {
            return 7766554433L;
        } 
  
  else if (email == "shraddha.kapoor@example.com") 
  {
            return 6655443322L;
        } 
  
  else if (email == "mohith.sharma@example.com")
   {
            return 5544332211L;
        } 
  
  else if (email == "preethi.shetty@example.com") 
  {
            return 4433221100L;
        } 
  
  else
   {
            System.out.println("No mobile number found");
            return 0;
        }
    }

    static String getEmailByName(String name) { 
        System.out.println("Running getEmailByName: " + name);

        if (name == "ranbir Kapoor") 
  {
            return "ranbir.kapoor@example.com";
        }

  else if (name == "anushka Sharma")
   {
            return "anushka.sharma@example.com";
        }

  else if (name == "suresh Shetty")
   {
            return "suresh.shetty@example.com";
        }

  else if (name == "kareena Kapoor") 
  {
            return "kareena.kapoor@example.com";
        } 
  
  else if (name == "rohith Sharma") 
  {
            return "rohith.sharma@example.com";
        } 
  
  else if (name == "shilpaShetty")
   {
            return "shilpa.shetty@example.com";
        } 
  
  else if (name == "shahidh Kapoor") 
  {
            return "shahidh.kapoor@example.com";
        }

  else if (name == "ravi Sharma")
   {
            return "ravi.sharma@example.com";
        } 
  
  else if (name == "anushka Shetty") 
  {
            return "anushka.shetty@example.com";
        }

  else if (name == "karishma Kapoor") 
  {
            return "karishma.kapoor@example.com";
        }

  else if (name == "manish Sharma") 
  {
            return "manish.sharma@example.com";
        } 
  
  else if (name == "sunil Shetty") 
  {
            return "sunil.shetty@example.com";
        }

  else if (name == "shraddha Kapoor")
   {
            return "shraddha.kapoor@example.com";
        } 
  
  else if (name == "mohith Sharma") 
  {
            return "nohith.sharma@example.com";
        }

  else if (name == "preethi Shetty") 
  {
            return "preethi.shetty@example.com";
        } 
  
  else 
  {
            System.out.println("No email found");
            return null;
        }
    }

    static String[] searchByLastName(String name) { 
        System.out.println("Running searchByLastName: " + name);

        if (name == "Kapoor") 
  {
            return new String[]{"ranbir Kapoor", "kareena Kapoor", "shahidh Kapoor", "karishma Kapoor", "shraddha Kapoor"};
        } 
  
  else if (name == "Sharma")
   {
            return new String[]{"anushka Sharma", "rohith Sharma", "ravi Sharma", "manish Sharma", "mohith Sharma"};
			} 
  
  else if (name == "Shetty") 
  {
            return new String[]{"suresh Shetty", "shilpa Shetty", "anushka Shetty", "sunil Shetty", "preethi Shetty"};
        } 
  
  else 
  {
            System.out.println("No records found");
            return new String[0];
        }
    }
}
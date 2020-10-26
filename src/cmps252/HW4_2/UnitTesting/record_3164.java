package cmps252.HW4_2.UnitTesting;

import static org.junit.jupiter.api.Assertions.*;
import java.io.FileNotFoundException;
import java.util.List;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import cmps252.HW4_2.Customer;
import cmps252.HW4_2.FileParser;

@Tag("35")
class Record_3164 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3164: FirstName is Bernard")
	void FirstNameOfRecord3164() {
		assertEquals("Bernard", customers.get(3163).getFirstName());
	}

	@Test
	@DisplayName("Record 3164: LastName is Bussy")
	void LastNameOfRecord3164() {
		assertEquals("Bussy", customers.get(3163).getLastName());
	}

	@Test
	@DisplayName("Record 3164: Company is New Jersey Book Agency")
	void CompanyOfRecord3164() {
		assertEquals("New Jersey Book Agency", customers.get(3163).getCompany());
	}

	@Test
	@DisplayName("Record 3164: Address is 284 Springfield Ave")
	void AddressOfRecord3164() {
		assertEquals("284 Springfield Ave", customers.get(3163).getAddress());
	}

	@Test
	@DisplayName("Record 3164: City is Berkeley Hyghts")
	void CityOfRecord3164() {
		assertEquals("Berkeley Hyghts", customers.get(3163).getCity());
	}

	@Test
	@DisplayName("Record 3164: County is Union")
	void CountyOfRecord3164() {
		assertEquals("Union", customers.get(3163).getCounty());
	}

	@Test
	@DisplayName("Record 3164: State is NJ")
	void StateOfRecord3164() {
		assertEquals("NJ", customers.get(3163).getState());
	}

	@Test
	@DisplayName("Record 3164: ZIP is 7922")
	void ZIPOfRecord3164() {
		assertEquals("7922", customers.get(3163).getZIP());
	}

	@Test
	@DisplayName("Record 3164: Phone is 908-464-5766")
	void PhoneOfRecord3164() {
		assertEquals("908-464-5766", customers.get(3163).getPhone());
	}

	@Test
	@DisplayName("Record 3164: Fax is 908-464-8998")
	void FaxOfRecord3164() {
		assertEquals("908-464-8998", customers.get(3163).getFax());
	}

	@Test
	@DisplayName("Record 3164: Email is bernard@bussy.com")
	void EmailOfRecord3164() {
		assertEquals("bernard@bussy.com", customers.get(3163).getEmail());
	}

	@Test
	@DisplayName("Record 3164: Web is http://www.bernardbussy.com")
	void WebOfRecord3164() {
		assertEquals("http://www.bernardbussy.com", customers.get(3163).getWeb());
	}
}

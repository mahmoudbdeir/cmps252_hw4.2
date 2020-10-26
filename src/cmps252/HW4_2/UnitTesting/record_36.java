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

@Tag("11")
class Record_36 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 36: FirstName is Olivia")
	void FirstNameOfRecord36() {
		assertEquals("Olivia", customers.get(35).getFirstName());
	}

	@Test
	@DisplayName("Record 36: LastName is Shollenberger")
	void LastNameOfRecord36() {
		assertEquals("Shollenberger", customers.get(35).getLastName());
	}

	@Test
	@DisplayName("Record 36: Company is Joevan Foods Inc")
	void CompanyOfRecord36() {
		assertEquals("Joevan Foods Inc", customers.get(35).getCompany());
	}

	@Test
	@DisplayName("Record 36: Address is 1000 Garfield Ave")
	void AddressOfRecord36() {
		assertEquals("1000 Garfield Ave", customers.get(35).getAddress());
	}

	@Test
	@DisplayName("Record 36: City is Jersey City")
	void CityOfRecord36() {
		assertEquals("Jersey City", customers.get(35).getCity());
	}

	@Test
	@DisplayName("Record 36: County is Hudson")
	void CountyOfRecord36() {
		assertEquals("Hudson", customers.get(35).getCounty());
	}

	@Test
	@DisplayName("Record 36: State is NJ")
	void StateOfRecord36() {
		assertEquals("NJ", customers.get(35).getState());
	}

	@Test
	@DisplayName("Record 36: ZIP is 7304")
	void ZIPOfRecord36() {
		assertEquals("7304", customers.get(35).getZIP());
	}

	@Test
	@DisplayName("Record 36: Phone is 201-432-9964")
	void PhoneOfRecord36() {
		assertEquals("201-432-9964", customers.get(35).getPhone());
	}

	@Test
	@DisplayName("Record 36: Fax is 201-432-5217")
	void FaxOfRecord36() {
		assertEquals("201-432-5217", customers.get(35).getFax());
	}

	@Test
	@DisplayName("Record 36: Email is olivia@shollenberger.com")
	void EmailOfRecord36() {
		assertEquals("olivia@shollenberger.com", customers.get(35).getEmail());
	}

	@Test
	@DisplayName("Record 36: Web is http://www.oliviashollenberger.com")
	void WebOfRecord36() {
		assertEquals("http://www.oliviashollenberger.com", customers.get(35).getWeb());
	}
}

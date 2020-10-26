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

@Tag("2")
class Record_1486 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1486: FirstName is Elise")
	void FirstNameOfRecord1486() {
		assertEquals("Elise", customers.get(1485).getFirstName());
	}

	@Test
	@DisplayName("Record 1486: LastName is Basemore")
	void LastNameOfRecord1486() {
		assertEquals("Basemore", customers.get(1485).getLastName());
	}

	@Test
	@DisplayName("Record 1486: Company is Spartan Planning Agency")
	void CompanyOfRecord1486() {
		assertEquals("Spartan Planning Agency", customers.get(1485).getCompany());
	}

	@Test
	@DisplayName("Record 1486: Address is 600 W Nelson St")
	void AddressOfRecord1486() {
		assertEquals("600 W Nelson St", customers.get(1485).getAddress());
	}

	@Test
	@DisplayName("Record 1486: City is Quanah")
	void CityOfRecord1486() {
		assertEquals("Quanah", customers.get(1485).getCity());
	}

	@Test
	@DisplayName("Record 1486: County is Hardeman")
	void CountyOfRecord1486() {
		assertEquals("Hardeman", customers.get(1485).getCounty());
	}

	@Test
	@DisplayName("Record 1486: State is TX")
	void StateOfRecord1486() {
		assertEquals("TX", customers.get(1485).getState());
	}

	@Test
	@DisplayName("Record 1486: ZIP is 79252")
	void ZIPOfRecord1486() {
		assertEquals("79252", customers.get(1485).getZIP());
	}

	@Test
	@DisplayName("Record 1486: Phone is 254-663-8730")
	void PhoneOfRecord1486() {
		assertEquals("254-663-8730", customers.get(1485).getPhone());
	}

	@Test
	@DisplayName("Record 1486: Fax is 254-663-6111")
	void FaxOfRecord1486() {
		assertEquals("254-663-6111", customers.get(1485).getFax());
	}

	@Test
	@DisplayName("Record 1486: Email is elise@basemore.com")
	void EmailOfRecord1486() {
		assertEquals("elise@basemore.com", customers.get(1485).getEmail());
	}

	@Test
	@DisplayName("Record 1486: Web is http://www.elisebasemore.com")
	void WebOfRecord1486() {
		assertEquals("http://www.elisebasemore.com", customers.get(1485).getWeb());
	}
}

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

@Tag("30")
class Record_4037 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4037: FirstName is Del")
	void FirstNameOfRecord4037() {
		assertEquals("Del", customers.get(4036).getFirstName());
	}

	@Test
	@DisplayName("Record 4037: LastName is Mikesell")
	void LastNameOfRecord4037() {
		assertEquals("Mikesell", customers.get(4036).getLastName());
	}

	@Test
	@DisplayName("Record 4037: Company is Guerrero Mexican Food Products")
	void CompanyOfRecord4037() {
		assertEquals("Guerrero Mexican Food Products", customers.get(4036).getCompany());
	}

	@Test
	@DisplayName("Record 4037: Address is 4931 26th Ave")
	void AddressOfRecord4037() {
		assertEquals("4931 26th Ave", customers.get(4036).getAddress());
	}

	@Test
	@DisplayName("Record 4037: City is Rockford")
	void CityOfRecord4037() {
		assertEquals("Rockford", customers.get(4036).getCity());
	}

	@Test
	@DisplayName("Record 4037: County is Winnebago")
	void CountyOfRecord4037() {
		assertEquals("Winnebago", customers.get(4036).getCounty());
	}

	@Test
	@DisplayName("Record 4037: State is IL")
	void StateOfRecord4037() {
		assertEquals("IL", customers.get(4036).getState());
	}

	@Test
	@DisplayName("Record 4037: ZIP is 61109")
	void ZIPOfRecord4037() {
		assertEquals("61109", customers.get(4036).getZIP());
	}

	@Test
	@DisplayName("Record 4037: Phone is 815-398-6960")
	void PhoneOfRecord4037() {
		assertEquals("815-398-6960", customers.get(4036).getPhone());
	}

	@Test
	@DisplayName("Record 4037: Fax is 815-398-2502")
	void FaxOfRecord4037() {
		assertEquals("815-398-2502", customers.get(4036).getFax());
	}

	@Test
	@DisplayName("Record 4037: Email is del@mikesell.com")
	void EmailOfRecord4037() {
		assertEquals("del@mikesell.com", customers.get(4036).getEmail());
	}

	@Test
	@DisplayName("Record 4037: Web is http://www.delmikesell.com")
	void WebOfRecord4037() {
		assertEquals("http://www.delmikesell.com", customers.get(4036).getWeb());
	}
}

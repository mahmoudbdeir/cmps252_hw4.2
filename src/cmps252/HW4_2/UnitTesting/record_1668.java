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

@Tag("24")
class Record_1668 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1668: FirstName is Lawanda")
	void FirstNameOfRecord1668() {
		assertEquals("Lawanda", customers.get(1667).getFirstName());
	}

	@Test
	@DisplayName("Record 1668: LastName is Filippelli")
	void LastNameOfRecord1668() {
		assertEquals("Filippelli", customers.get(1667).getLastName());
	}

	@Test
	@DisplayName("Record 1668: Company is Dayton Rogers Of Texas Inc")
	void CompanyOfRecord1668() {
		assertEquals("Dayton Rogers Of Texas Inc", customers.get(1667).getCompany());
	}

	@Test
	@DisplayName("Record 1668: Address is 550 Kinderkamack Rd")
	void AddressOfRecord1668() {
		assertEquals("550 Kinderkamack Rd", customers.get(1667).getAddress());
	}

	@Test
	@DisplayName("Record 1668: City is Oradell")
	void CityOfRecord1668() {
		assertEquals("Oradell", customers.get(1667).getCity());
	}

	@Test
	@DisplayName("Record 1668: County is Bergen")
	void CountyOfRecord1668() {
		assertEquals("Bergen", customers.get(1667).getCounty());
	}

	@Test
	@DisplayName("Record 1668: State is NJ")
	void StateOfRecord1668() {
		assertEquals("NJ", customers.get(1667).getState());
	}

	@Test
	@DisplayName("Record 1668: ZIP is 07649")
	void ZIPOfRecord1668() {
		assertEquals("07649", customers.get(1667).getZIP());
	}

	@Test
	@DisplayName("Record 1668: Phone is 201-265-0203")
	void PhoneOfRecord1668() {
		assertEquals("201-265-0203", customers.get(1667).getPhone());
	}

	@Test
	@DisplayName("Record 1668: Fax is 201-265-4817")
	void FaxOfRecord1668() {
		assertEquals("201-265-4817", customers.get(1667).getFax());
	}

	@Test
	@DisplayName("Record 1668: Email is lawanda@filippelli.com")
	void EmailOfRecord1668() {
		assertEquals("lawanda@filippelli.com", customers.get(1667).getEmail());
	}

	@Test
	@DisplayName("Record 1668: Web is http://www.lawandafilippelli.com")
	void WebOfRecord1668() {
		assertEquals("http://www.lawandafilippelli.com", customers.get(1667).getWeb());
	}
}

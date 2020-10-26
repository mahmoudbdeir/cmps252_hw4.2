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

@Tag("34")
class Record_760 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 760: FirstName is Aron")
	void FirstNameOfRecord760() {
		assertEquals("Aron", customers.get(759).getFirstName());
	}

	@Test
	@DisplayName("Record 760: LastName is Pollet")
	void LastNameOfRecord760() {
		assertEquals("Pollet", customers.get(759).getLastName());
	}

	@Test
	@DisplayName("Record 760: Company is Farkas Store Fixtures")
	void CompanyOfRecord760() {
		assertEquals("Farkas Store Fixtures", customers.get(759).getCompany());
	}

	@Test
	@DisplayName("Record 760: Address is 405 Tarrytown Rd  #-416")
	void AddressOfRecord760() {
		assertEquals("405 Tarrytown Rd  #-416", customers.get(759).getAddress());
	}

	@Test
	@DisplayName("Record 760: City is White Plains")
	void CityOfRecord760() {
		assertEquals("White Plains", customers.get(759).getCity());
	}

	@Test
	@DisplayName("Record 760: County is Westchester")
	void CountyOfRecord760() {
		assertEquals("Westchester", customers.get(759).getCounty());
	}

	@Test
	@DisplayName("Record 760: State is NY")
	void StateOfRecord760() {
		assertEquals("NY", customers.get(759).getState());
	}

	@Test
	@DisplayName("Record 760: ZIP is 10607")
	void ZIPOfRecord760() {
		assertEquals("10607", customers.get(759).getZIP());
	}

	@Test
	@DisplayName("Record 760: Phone is 914-591-8734")
	void PhoneOfRecord760() {
		assertEquals("914-591-8734", customers.get(759).getPhone());
	}

	@Test
	@DisplayName("Record 760: Fax is 914-591-7878")
	void FaxOfRecord760() {
		assertEquals("914-591-7878", customers.get(759).getFax());
	}

	@Test
	@DisplayName("Record 760: Email is aron@pollet.com")
	void EmailOfRecord760() {
		assertEquals("aron@pollet.com", customers.get(759).getEmail());
	}

	@Test
	@DisplayName("Record 760: Web is http://www.aronpollet.com")
	void WebOfRecord760() {
		assertEquals("http://www.aronpollet.com", customers.get(759).getWeb());
	}
}

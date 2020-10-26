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

@Tag("44")
class Record_4996 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4996: FirstName is Royal")
	void FirstNameOfRecord4996() {
		assertEquals("Royal", customers.get(4995).getFirstName());
	}

	@Test
	@DisplayName("Record 4996: LastName is Duck")
	void LastNameOfRecord4996() {
		assertEquals("Duck", customers.get(4995).getLastName());
	}

	@Test
	@DisplayName("Record 4996: Company is Antler Translation Services")
	void CompanyOfRecord4996() {
		assertEquals("Antler Translation Services", customers.get(4995).getCompany());
	}

	@Test
	@DisplayName("Record 4996: Address is 601 N Main St  #-211")
	void AddressOfRecord4996() {
		assertEquals("601 N Main St  #-211", customers.get(4995).getAddress());
	}

	@Test
	@DisplayName("Record 4996: City is Pueblo")
	void CityOfRecord4996() {
		assertEquals("Pueblo", customers.get(4995).getCity());
	}

	@Test
	@DisplayName("Record 4996: County is Pueblo")
	void CountyOfRecord4996() {
		assertEquals("Pueblo", customers.get(4995).getCounty());
	}

	@Test
	@DisplayName("Record 4996: State is CO")
	void StateOfRecord4996() {
		assertEquals("CO", customers.get(4995).getState());
	}

	@Test
	@DisplayName("Record 4996: ZIP is 81003")
	void ZIPOfRecord4996() {
		assertEquals("81003", customers.get(4995).getZIP());
	}

	@Test
	@DisplayName("Record 4996: Phone is 719-546-6459")
	void PhoneOfRecord4996() {
		assertEquals("719-546-6459", customers.get(4995).getPhone());
	}

	@Test
	@DisplayName("Record 4996: Fax is 719-546-4427")
	void FaxOfRecord4996() {
		assertEquals("719-546-4427", customers.get(4995).getFax());
	}

	@Test
	@DisplayName("Record 4996: Email is royal@duck.com")
	void EmailOfRecord4996() {
		assertEquals("royal@duck.com", customers.get(4995).getEmail());
	}

	@Test
	@DisplayName("Record 4996: Web is http://www.royalduck.com")
	void WebOfRecord4996() {
		assertEquals("http://www.royalduck.com", customers.get(4995).getWeb());
	}
}

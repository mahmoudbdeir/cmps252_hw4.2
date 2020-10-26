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
class Record_1662 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1662: FirstName is Vito")
	void FirstNameOfRecord1662() {
		assertEquals("Vito", customers.get(1661).getFirstName());
	}

	@Test
	@DisplayName("Record 1662: LastName is Mahala")
	void LastNameOfRecord1662() {
		assertEquals("Mahala", customers.get(1661).getLastName());
	}

	@Test
	@DisplayName("Record 1662: Company is Dana Robes Wood Craftsmen")
	void CompanyOfRecord1662() {
		assertEquals("Dana Robes Wood Craftsmen", customers.get(1661).getCompany());
	}

	@Test
	@DisplayName("Record 1662: Address is 58a Hobart St")
	void AddressOfRecord1662() {
		assertEquals("58a Hobart St", customers.get(1661).getAddress());
	}

	@Test
	@DisplayName("Record 1662: City is Hackensack")
	void CityOfRecord1662() {
		assertEquals("Hackensack", customers.get(1661).getCity());
	}

	@Test
	@DisplayName("Record 1662: County is Bergen")
	void CountyOfRecord1662() {
		assertEquals("Bergen", customers.get(1661).getCounty());
	}

	@Test
	@DisplayName("Record 1662: State is NJ")
	void StateOfRecord1662() {
		assertEquals("NJ", customers.get(1661).getState());
	}

	@Test
	@DisplayName("Record 1662: ZIP is 7601")
	void ZIPOfRecord1662() {
		assertEquals("7601", customers.get(1661).getZIP());
	}

	@Test
	@DisplayName("Record 1662: Phone is 201-343-5071")
	void PhoneOfRecord1662() {
		assertEquals("201-343-5071", customers.get(1661).getPhone());
	}

	@Test
	@DisplayName("Record 1662: Fax is 201-343-9692")
	void FaxOfRecord1662() {
		assertEquals("201-343-9692", customers.get(1661).getFax());
	}

	@Test
	@DisplayName("Record 1662: Email is vito@mahala.com")
	void EmailOfRecord1662() {
		assertEquals("vito@mahala.com", customers.get(1661).getEmail());
	}

	@Test
	@DisplayName("Record 1662: Web is http://www.vitomahala.com")
	void WebOfRecord1662() {
		assertEquals("http://www.vitomahala.com", customers.get(1661).getWeb());
	}
}

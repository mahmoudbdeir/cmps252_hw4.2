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

@Tag("40")
class Record_2646 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2646: FirstName is Christoper")
	void FirstNameOfRecord2646() {
		assertEquals("Christoper", customers.get(2645).getFirstName());
	}

	@Test
	@DisplayName("Record 2646: LastName is Boecker")
	void LastNameOfRecord2646() {
		assertEquals("Boecker", customers.get(2645).getLastName());
	}

	@Test
	@DisplayName("Record 2646: Company is Edgerton, Robert H Esq")
	void CompanyOfRecord2646() {
		assertEquals("Edgerton, Robert H Esq", customers.get(2645).getCompany());
	}

	@Test
	@DisplayName("Record 2646: Address is 4551 Fairbanks St")
	void AddressOfRecord2646() {
		assertEquals("4551 Fairbanks St", customers.get(2645).getAddress());
	}

	@Test
	@DisplayName("Record 2646: City is Anchorage")
	void CityOfRecord2646() {
		assertEquals("Anchorage", customers.get(2645).getCity());
	}

	@Test
	@DisplayName("Record 2646: County is Anchorage")
	void CountyOfRecord2646() {
		assertEquals("Anchorage", customers.get(2645).getCounty());
	}

	@Test
	@DisplayName("Record 2646: State is AK")
	void StateOfRecord2646() {
		assertEquals("AK", customers.get(2645).getState());
	}

	@Test
	@DisplayName("Record 2646: ZIP is 99503")
	void ZIPOfRecord2646() {
		assertEquals("99503", customers.get(2645).getZIP());
	}

	@Test
	@DisplayName("Record 2646: Phone is 907-562-4158")
	void PhoneOfRecord2646() {
		assertEquals("907-562-4158", customers.get(2645).getPhone());
	}

	@Test
	@DisplayName("Record 2646: Fax is 907-562-8036")
	void FaxOfRecord2646() {
		assertEquals("907-562-8036", customers.get(2645).getFax());
	}

	@Test
	@DisplayName("Record 2646: Email is christoper@boecker.com")
	void EmailOfRecord2646() {
		assertEquals("christoper@boecker.com", customers.get(2645).getEmail());
	}

	@Test
	@DisplayName("Record 2646: Web is http://www.christoperboecker.com")
	void WebOfRecord2646() {
		assertEquals("http://www.christoperboecker.com", customers.get(2645).getWeb());
	}
}

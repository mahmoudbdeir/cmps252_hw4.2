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

@Tag("22")
class Record_4495 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4495: FirstName is Cameron")
	void FirstNameOfRecord4495() {
		assertEquals("Cameron", customers.get(4494).getFirstName());
	}

	@Test
	@DisplayName("Record 4495: LastName is Sadowski")
	void LastNameOfRecord4495() {
		assertEquals("Sadowski", customers.get(4494).getLastName());
	}

	@Test
	@DisplayName("Record 4495: Company is Washington Cattlemens Assn")
	void CompanyOfRecord4495() {
		assertEquals("Washington Cattlemens Assn", customers.get(4494).getCompany());
	}

	@Test
	@DisplayName("Record 4495: Address is 1903 Litits Pike")
	void AddressOfRecord4495() {
		assertEquals("1903 Litits Pike", customers.get(4494).getAddress());
	}

	@Test
	@DisplayName("Record 4495: City is Lancaster")
	void CityOfRecord4495() {
		assertEquals("Lancaster", customers.get(4494).getCity());
	}

	@Test
	@DisplayName("Record 4495: County is Lancaster")
	void CountyOfRecord4495() {
		assertEquals("Lancaster", customers.get(4494).getCounty());
	}

	@Test
	@DisplayName("Record 4495: State is PA")
	void StateOfRecord4495() {
		assertEquals("PA", customers.get(4494).getState());
	}

	@Test
	@DisplayName("Record 4495: ZIP is 17601")
	void ZIPOfRecord4495() {
		assertEquals("17601", customers.get(4494).getZIP());
	}

	@Test
	@DisplayName("Record 4495: Phone is 717-581-9264")
	void PhoneOfRecord4495() {
		assertEquals("717-581-9264", customers.get(4494).getPhone());
	}

	@Test
	@DisplayName("Record 4495: Fax is 717-581-7475")
	void FaxOfRecord4495() {
		assertEquals("717-581-7475", customers.get(4494).getFax());
	}

	@Test
	@DisplayName("Record 4495: Email is cameron@sadowski.com")
	void EmailOfRecord4495() {
		assertEquals("cameron@sadowski.com", customers.get(4494).getEmail());
	}

	@Test
	@DisplayName("Record 4495: Web is http://www.cameronsadowski.com")
	void WebOfRecord4495() {
		assertEquals("http://www.cameronsadowski.com", customers.get(4494).getWeb());
	}
}

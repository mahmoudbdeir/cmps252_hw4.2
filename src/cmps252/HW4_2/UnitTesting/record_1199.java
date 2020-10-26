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

@Tag("16")
class Record_1199 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1199: FirstName is Judi")
	void FirstNameOfRecord1199() {
		assertEquals("Judi", customers.get(1198).getFirstName());
	}

	@Test
	@DisplayName("Record 1199: LastName is Wehring")
	void LastNameOfRecord1199() {
		assertEquals("Wehring", customers.get(1198).getLastName());
	}

	@Test
	@DisplayName("Record 1199: Company is Stl County Bar Assn")
	void CompanyOfRecord1199() {
		assertEquals("Stl County Bar Assn", customers.get(1198).getCompany());
	}

	@Test
	@DisplayName("Record 1199: Address is 241 N Plum St")
	void AddressOfRecord1199() {
		assertEquals("241 N Plum St", customers.get(1198).getAddress());
	}

	@Test
	@DisplayName("Record 1199: City is Lancaster")
	void CityOfRecord1199() {
		assertEquals("Lancaster", customers.get(1198).getCity());
	}

	@Test
	@DisplayName("Record 1199: County is Lancaster")
	void CountyOfRecord1199() {
		assertEquals("Lancaster", customers.get(1198).getCounty());
	}

	@Test
	@DisplayName("Record 1199: State is PA")
	void StateOfRecord1199() {
		assertEquals("PA", customers.get(1198).getState());
	}

	@Test
	@DisplayName("Record 1199: ZIP is 17602")
	void ZIPOfRecord1199() {
		assertEquals("17602", customers.get(1198).getZIP());
	}

	@Test
	@DisplayName("Record 1199: Phone is 717-397-6018")
	void PhoneOfRecord1199() {
		assertEquals("717-397-6018", customers.get(1198).getPhone());
	}

	@Test
	@DisplayName("Record 1199: Fax is 717-397-9156")
	void FaxOfRecord1199() {
		assertEquals("717-397-9156", customers.get(1198).getFax());
	}

	@Test
	@DisplayName("Record 1199: Email is judi@wehring.com")
	void EmailOfRecord1199() {
		assertEquals("judi@wehring.com", customers.get(1198).getEmail());
	}

	@Test
	@DisplayName("Record 1199: Web is http://www.judiwehring.com")
	void WebOfRecord1199() {
		assertEquals("http://www.judiwehring.com", customers.get(1198).getWeb());
	}
}

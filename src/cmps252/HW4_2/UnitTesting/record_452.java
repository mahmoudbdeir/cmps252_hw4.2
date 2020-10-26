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

@Tag("46")
class Record_452 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 452: FirstName is Arden")
	void FirstNameOfRecord452() {
		assertEquals("Arden", customers.get(451).getFirstName());
	}

	@Test
	@DisplayName("Record 452: LastName is Clemen")
	void LastNameOfRecord452() {
		assertEquals("Clemen", customers.get(451).getLastName());
	}

	@Test
	@DisplayName("Record 452: Company is Hochstrassers Marina")
	void CompanyOfRecord452() {
		assertEquals("Hochstrassers Marina", customers.get(451).getCompany());
	}

	@Test
	@DisplayName("Record 452: Address is 140 Monroe St")
	void AddressOfRecord452() {
		assertEquals("140 Monroe St", customers.get(451).getAddress());
	}

	@Test
	@DisplayName("Record 452: City is Garfield")
	void CityOfRecord452() {
		assertEquals("Garfield", customers.get(451).getCity());
	}

	@Test
	@DisplayName("Record 452: County is Bergen")
	void CountyOfRecord452() {
		assertEquals("Bergen", customers.get(451).getCounty());
	}

	@Test
	@DisplayName("Record 452: State is NJ")
	void StateOfRecord452() {
		assertEquals("NJ", customers.get(451).getState());
	}

	@Test
	@DisplayName("Record 452: ZIP is 7026")
	void ZIPOfRecord452() {
		assertEquals("7026", customers.get(451).getZIP());
	}

	@Test
	@DisplayName("Record 452: Phone is 973-546-3112")
	void PhoneOfRecord452() {
		assertEquals("973-546-3112", customers.get(451).getPhone());
	}

	@Test
	@DisplayName("Record 452: Fax is 973-546-7431")
	void FaxOfRecord452() {
		assertEquals("973-546-7431", customers.get(451).getFax());
	}

	@Test
	@DisplayName("Record 452: Email is arden@clemen.com")
	void EmailOfRecord452() {
		assertEquals("arden@clemen.com", customers.get(451).getEmail());
	}

	@Test
	@DisplayName("Record 452: Web is http://www.ardenclemen.com")
	void WebOfRecord452() {
		assertEquals("http://www.ardenclemen.com", customers.get(451).getWeb());
	}
}

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
class Record_2241 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2241: FirstName is Dalia")
	void FirstNameOfRecord2241() {
		assertEquals("Dalia", customers.get(2240).getFirstName());
	}

	@Test
	@DisplayName("Record 2241: LastName is Mocco")
	void LastNameOfRecord2241() {
		assertEquals("Mocco", customers.get(2240).getLastName());
	}

	@Test
	@DisplayName("Record 2241: Company is Rochester Copier Inc")
	void CompanyOfRecord2241() {
		assertEquals("Rochester Copier Inc", customers.get(2240).getCompany());
	}

	@Test
	@DisplayName("Record 2241: Address is 10854 Drury Ln")
	void AddressOfRecord2241() {
		assertEquals("10854 Drury Ln", customers.get(2240).getAddress());
	}

	@Test
	@DisplayName("Record 2241: City is Lynwood")
	void CityOfRecord2241() {
		assertEquals("Lynwood", customers.get(2240).getCity());
	}

	@Test
	@DisplayName("Record 2241: County is Los Angeles")
	void CountyOfRecord2241() {
		assertEquals("Los Angeles", customers.get(2240).getCounty());
	}

	@Test
	@DisplayName("Record 2241: State is CA")
	void StateOfRecord2241() {
		assertEquals("CA", customers.get(2240).getState());
	}

	@Test
	@DisplayName("Record 2241: ZIP is 90262")
	void ZIPOfRecord2241() {
		assertEquals("90262", customers.get(2240).getZIP());
	}

	@Test
	@DisplayName("Record 2241: Phone is 310-774-9041")
	void PhoneOfRecord2241() {
		assertEquals("310-774-9041", customers.get(2240).getPhone());
	}

	@Test
	@DisplayName("Record 2241: Fax is 310-774-3713")
	void FaxOfRecord2241() {
		assertEquals("310-774-3713", customers.get(2240).getFax());
	}

	@Test
	@DisplayName("Record 2241: Email is dalia@mocco.com")
	void EmailOfRecord2241() {
		assertEquals("dalia@mocco.com", customers.get(2240).getEmail());
	}

	@Test
	@DisplayName("Record 2241: Web is http://www.daliamocco.com")
	void WebOfRecord2241() {
		assertEquals("http://www.daliamocco.com", customers.get(2240).getWeb());
	}
}

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
class Record_2711 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2711: FirstName is Michele")
	void FirstNameOfRecord2711() {
		assertEquals("Michele", customers.get(2710).getFirstName());
	}

	@Test
	@DisplayName("Record 2711: LastName is Ceman")
	void LastNameOfRecord2711() {
		assertEquals("Ceman", customers.get(2710).getLastName());
	}

	@Test
	@DisplayName("Record 2711: Company is Eecho Systems")
	void CompanyOfRecord2711() {
		assertEquals("Eecho Systems", customers.get(2710).getCompany());
	}

	@Test
	@DisplayName("Record 2711: Address is 2101 Poydras St")
	void AddressOfRecord2711() {
		assertEquals("2101 Poydras St", customers.get(2710).getAddress());
	}

	@Test
	@DisplayName("Record 2711: City is New Orleans")
	void CityOfRecord2711() {
		assertEquals("New Orleans", customers.get(2710).getCity());
	}

	@Test
	@DisplayName("Record 2711: County is Orleans")
	void CountyOfRecord2711() {
		assertEquals("Orleans", customers.get(2710).getCounty());
	}

	@Test
	@DisplayName("Record 2711: State is LA")
	void StateOfRecord2711() {
		assertEquals("LA", customers.get(2710).getState());
	}

	@Test
	@DisplayName("Record 2711: ZIP is 70112")
	void ZIPOfRecord2711() {
		assertEquals("70112", customers.get(2710).getZIP());
	}

	@Test
	@DisplayName("Record 2711: Phone is 504-522-9320")
	void PhoneOfRecord2711() {
		assertEquals("504-522-9320", customers.get(2710).getPhone());
	}

	@Test
	@DisplayName("Record 2711: Fax is 504-522-8588")
	void FaxOfRecord2711() {
		assertEquals("504-522-8588", customers.get(2710).getFax());
	}

	@Test
	@DisplayName("Record 2711: Email is michele@ceman.com")
	void EmailOfRecord2711() {
		assertEquals("michele@ceman.com", customers.get(2710).getEmail());
	}

	@Test
	@DisplayName("Record 2711: Web is http://www.micheleceman.com")
	void WebOfRecord2711() {
		assertEquals("http://www.micheleceman.com", customers.get(2710).getWeb());
	}
}

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

@Tag("11")
class Record_2593 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2593: FirstName is Elliott")
	void FirstNameOfRecord2593() {
		assertEquals("Elliott", customers.get(2592).getFirstName());
	}

	@Test
	@DisplayName("Record 2593: LastName is Ottogary")
	void LastNameOfRecord2593() {
		assertEquals("Ottogary", customers.get(2592).getLastName());
	}

	@Test
	@DisplayName("Record 2593: Company is H & R Industries Inc")
	void CompanyOfRecord2593() {
		assertEquals("H & R Industries Inc", customers.get(2592).getCompany());
	}

	@Test
	@DisplayName("Record 2593: Address is 15 Potter St")
	void AddressOfRecord2593() {
		assertEquals("15 Potter St", customers.get(2592).getAddress());
	}

	@Test
	@DisplayName("Record 2593: City is Haddonfield")
	void CityOfRecord2593() {
		assertEquals("Haddonfield", customers.get(2592).getCity());
	}

	@Test
	@DisplayName("Record 2593: County is Camden")
	void CountyOfRecord2593() {
		assertEquals("Camden", customers.get(2592).getCounty());
	}

	@Test
	@DisplayName("Record 2593: State is NJ")
	void StateOfRecord2593() {
		assertEquals("NJ", customers.get(2592).getState());
	}

	@Test
	@DisplayName("Record 2593: ZIP is 8033")
	void ZIPOfRecord2593() {
		assertEquals("8033", customers.get(2592).getZIP());
	}

	@Test
	@DisplayName("Record 2593: Phone is 856-795-2434")
	void PhoneOfRecord2593() {
		assertEquals("856-795-2434", customers.get(2592).getPhone());
	}

	@Test
	@DisplayName("Record 2593: Fax is 856-795-6758")
	void FaxOfRecord2593() {
		assertEquals("856-795-6758", customers.get(2592).getFax());
	}

	@Test
	@DisplayName("Record 2593: Email is elliott@ottogary.com")
	void EmailOfRecord2593() {
		assertEquals("elliott@ottogary.com", customers.get(2592).getEmail());
	}

	@Test
	@DisplayName("Record 2593: Web is http://www.elliottottogary.com")
	void WebOfRecord2593() {
		assertEquals("http://www.elliottottogary.com", customers.get(2592).getWeb());
	}
}

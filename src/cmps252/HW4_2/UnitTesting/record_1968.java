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
class Record_1968 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1968: FirstName is Rochelle")
	void FirstNameOfRecord1968() {
		assertEquals("Rochelle", customers.get(1967).getFirstName());
	}

	@Test
	@DisplayName("Record 1968: LastName is Sarna")
	void LastNameOfRecord1968() {
		assertEquals("Sarna", customers.get(1967).getLastName());
	}

	@Test
	@DisplayName("Record 1968: Company is Little Giant Federal Credit Un")
	void CompanyOfRecord1968() {
		assertEquals("Little Giant Federal Credit Un", customers.get(1967).getCompany());
	}

	@Test
	@DisplayName("Record 1968: Address is 4801 Contractors Dr")
	void AddressOfRecord1968() {
		assertEquals("4801 Contractors Dr", customers.get(1967).getAddress());
	}

	@Test
	@DisplayName("Record 1968: City is East Wenatchee")
	void CityOfRecord1968() {
		assertEquals("East Wenatchee", customers.get(1967).getCity());
	}

	@Test
	@DisplayName("Record 1968: County is Douglas")
	void CountyOfRecord1968() {
		assertEquals("Douglas", customers.get(1967).getCounty());
	}

	@Test
	@DisplayName("Record 1968: State is WA")
	void StateOfRecord1968() {
		assertEquals("WA", customers.get(1967).getState());
	}

	@Test
	@DisplayName("Record 1968: ZIP is 98802")
	void ZIPOfRecord1968() {
		assertEquals("98802", customers.get(1967).getZIP());
	}

	@Test
	@DisplayName("Record 1968: Phone is 509-884-3502")
	void PhoneOfRecord1968() {
		assertEquals("509-884-3502", customers.get(1967).getPhone());
	}

	@Test
	@DisplayName("Record 1968: Fax is 509-884-6558")
	void FaxOfRecord1968() {
		assertEquals("509-884-6558", customers.get(1967).getFax());
	}

	@Test
	@DisplayName("Record 1968: Email is rochelle@sarna.com")
	void EmailOfRecord1968() {
		assertEquals("rochelle@sarna.com", customers.get(1967).getEmail());
	}

	@Test
	@DisplayName("Record 1968: Web is http://www.rochellesarna.com")
	void WebOfRecord1968() {
		assertEquals("http://www.rochellesarna.com", customers.get(1967).getWeb());
	}
}

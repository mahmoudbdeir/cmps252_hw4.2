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

@Tag("27")
class Record_3269 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3269: FirstName is Kerry")
	void FirstNameOfRecord3269() {
		assertEquals("Kerry", customers.get(3268).getFirstName());
	}

	@Test
	@DisplayName("Record 3269: LastName is Rieske")
	void LastNameOfRecord3269() {
		assertEquals("Rieske", customers.get(3268).getLastName());
	}

	@Test
	@DisplayName("Record 3269: Company is Total Lift Equipment Co Inc")
	void CompanyOfRecord3269() {
		assertEquals("Total Lift Equipment Co Inc", customers.get(3268).getCompany());
	}

	@Test
	@DisplayName("Record 3269: Address is 1415 Redeker Rd")
	void AddressOfRecord3269() {
		assertEquals("1415 Redeker Rd", customers.get(3268).getAddress());
	}

	@Test
	@DisplayName("Record 3269: City is Des Plaines")
	void CityOfRecord3269() {
		assertEquals("Des Plaines", customers.get(3268).getCity());
	}

	@Test
	@DisplayName("Record 3269: County is Cook")
	void CountyOfRecord3269() {
		assertEquals("Cook", customers.get(3268).getCounty());
	}

	@Test
	@DisplayName("Record 3269: State is IL")
	void StateOfRecord3269() {
		assertEquals("IL", customers.get(3268).getState());
	}

	@Test
	@DisplayName("Record 3269: ZIP is 60016")
	void ZIPOfRecord3269() {
		assertEquals("60016", customers.get(3268).getZIP());
	}

	@Test
	@DisplayName("Record 3269: Phone is 847-298-8342")
	void PhoneOfRecord3269() {
		assertEquals("847-298-8342", customers.get(3268).getPhone());
	}

	@Test
	@DisplayName("Record 3269: Fax is 847-298-6383")
	void FaxOfRecord3269() {
		assertEquals("847-298-6383", customers.get(3268).getFax());
	}

	@Test
	@DisplayName("Record 3269: Email is kerry@rieske.com")
	void EmailOfRecord3269() {
		assertEquals("kerry@rieske.com", customers.get(3268).getEmail());
	}

	@Test
	@DisplayName("Record 3269: Web is http://www.kerryrieske.com")
	void WebOfRecord3269() {
		assertEquals("http://www.kerryrieske.com", customers.get(3268).getWeb());
	}
}

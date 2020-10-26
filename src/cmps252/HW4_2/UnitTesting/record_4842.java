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
class Record_4842 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4842: FirstName is Christine")
	void FirstNameOfRecord4842() {
		assertEquals("Christine", customers.get(4841).getFirstName());
	}

	@Test
	@DisplayName("Record 4842: LastName is Anhalt")
	void LastNameOfRecord4842() {
		assertEquals("Anhalt", customers.get(4841).getLastName());
	}

	@Test
	@DisplayName("Record 4842: Company is Canale, John F Esq")
	void CompanyOfRecord4842() {
		assertEquals("Canale, John F Esq", customers.get(4841).getCompany());
	}

	@Test
	@DisplayName("Record 4842: Address is 4566 Lewis Rd  #-b")
	void AddressOfRecord4842() {
		assertEquals("4566 Lewis Rd  #-b", customers.get(4841).getAddress());
	}

	@Test
	@DisplayName("Record 4842: City is Stone Mountain")
	void CityOfRecord4842() {
		assertEquals("Stone Mountain", customers.get(4841).getCity());
	}

	@Test
	@DisplayName("Record 4842: County is Dekalb")
	void CountyOfRecord4842() {
		assertEquals("Dekalb", customers.get(4841).getCounty());
	}

	@Test
	@DisplayName("Record 4842: State is GA")
	void StateOfRecord4842() {
		assertEquals("GA", customers.get(4841).getState());
	}

	@Test
	@DisplayName("Record 4842: ZIP is 30083")
	void ZIPOfRecord4842() {
		assertEquals("30083", customers.get(4841).getZIP());
	}

	@Test
	@DisplayName("Record 4842: Phone is 770-934-4748")
	void PhoneOfRecord4842() {
		assertEquals("770-934-4748", customers.get(4841).getPhone());
	}

	@Test
	@DisplayName("Record 4842: Fax is 770-934-7809")
	void FaxOfRecord4842() {
		assertEquals("770-934-7809", customers.get(4841).getFax());
	}

	@Test
	@DisplayName("Record 4842: Email is christine@anhalt.com")
	void EmailOfRecord4842() {
		assertEquals("christine@anhalt.com", customers.get(4841).getEmail());
	}

	@Test
	@DisplayName("Record 4842: Web is http://www.christineanhalt.com")
	void WebOfRecord4842() {
		assertEquals("http://www.christineanhalt.com", customers.get(4841).getWeb());
	}
}

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

@Tag("14")
class Record_49 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 49: FirstName is Alfred")
	void FirstNameOfRecord49() {
		assertEquals("Alfred", customers.get(48).getFirstName());
	}

	@Test
	@DisplayName("Record 49: LastName is Fines")
	void LastNameOfRecord49() {
		assertEquals("Fines", customers.get(48).getLastName());
	}

	@Test
	@DisplayName("Record 49: Company is Saurer Txtl Systems Charlotte")
	void CompanyOfRecord49() {
		assertEquals("Saurer Txtl Systems Charlotte", customers.get(48).getCompany());
	}

	@Test
	@DisplayName("Record 49: Address is 201 S 7th St")
	void AddressOfRecord49() {
		assertEquals("201 S 7th St", customers.get(48).getAddress());
	}

	@Test
	@DisplayName("Record 49: City is Miles City")
	void CityOfRecord49() {
		assertEquals("Miles City", customers.get(48).getCity());
	}

	@Test
	@DisplayName("Record 49: County is Custer")
	void CountyOfRecord49() {
		assertEquals("Custer", customers.get(48).getCounty());
	}

	@Test
	@DisplayName("Record 49: State is MT")
	void StateOfRecord49() {
		assertEquals("MT", customers.get(48).getState());
	}

	@Test
	@DisplayName("Record 49: ZIP is 59301")
	void ZIPOfRecord49() {
		assertEquals("59301", customers.get(48).getZIP());
	}

	@Test
	@DisplayName("Record 49: Phone is 406-232-7958")
	void PhoneOfRecord49() {
		assertEquals("406-232-7958", customers.get(48).getPhone());
	}

	@Test
	@DisplayName("Record 49: Fax is 406-232-6848")
	void FaxOfRecord49() {
		assertEquals("406-232-6848", customers.get(48).getFax());
	}

	@Test
	@DisplayName("Record 49: Email is alfred@fines.com")
	void EmailOfRecord49() {
		assertEquals("alfred@fines.com", customers.get(48).getEmail());
	}

	@Test
	@DisplayName("Record 49: Web is http://www.alfredfines.com")
	void WebOfRecord49() {
		assertEquals("http://www.alfredfines.com", customers.get(48).getWeb());
	}
}

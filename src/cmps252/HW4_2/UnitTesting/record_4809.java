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

@Tag("26")
class Record_4809 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4809: FirstName is Rolland")
	void FirstNameOfRecord4809() {
		assertEquals("Rolland", customers.get(4808).getFirstName());
	}

	@Test
	@DisplayName("Record 4809: LastName is Vantreese")
	void LastNameOfRecord4809() {
		assertEquals("Vantreese", customers.get(4808).getLastName());
	}

	@Test
	@DisplayName("Record 4809: Company is Bo Buck Mill")
	void CompanyOfRecord4809() {
		assertEquals("Bo Buck Mill", customers.get(4808).getCompany());
	}

	@Test
	@DisplayName("Record 4809: Address is 2639 S Main Rd")
	void AddressOfRecord4809() {
		assertEquals("2639 S Main Rd", customers.get(4808).getAddress());
	}

	@Test
	@DisplayName("Record 4809: City is Vineland")
	void CityOfRecord4809() {
		assertEquals("Vineland", customers.get(4808).getCity());
	}

	@Test
	@DisplayName("Record 4809: County is Cumberland")
	void CountyOfRecord4809() {
		assertEquals("Cumberland", customers.get(4808).getCounty());
	}

	@Test
	@DisplayName("Record 4809: State is NJ")
	void StateOfRecord4809() {
		assertEquals("NJ", customers.get(4808).getState());
	}

	@Test
	@DisplayName("Record 4809: ZIP is 8360")
	void ZIPOfRecord4809() {
		assertEquals("8360", customers.get(4808).getZIP());
	}

	@Test
	@DisplayName("Record 4809: Phone is 856-692-3342")
	void PhoneOfRecord4809() {
		assertEquals("856-692-3342", customers.get(4808).getPhone());
	}

	@Test
	@DisplayName("Record 4809: Fax is 856-692-6923")
	void FaxOfRecord4809() {
		assertEquals("856-692-6923", customers.get(4808).getFax());
	}

	@Test
	@DisplayName("Record 4809: Email is rolland@vantreese.com")
	void EmailOfRecord4809() {
		assertEquals("rolland@vantreese.com", customers.get(4808).getEmail());
	}

	@Test
	@DisplayName("Record 4809: Web is http://www.rollandvantreese.com")
	void WebOfRecord4809() {
		assertEquals("http://www.rollandvantreese.com", customers.get(4808).getWeb());
	}
}

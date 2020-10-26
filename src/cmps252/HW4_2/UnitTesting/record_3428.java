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

@Tag("23")
class Record_3428 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3428: FirstName is Stanley")
	void FirstNameOfRecord3428() {
		assertEquals("Stanley", customers.get(3427).getFirstName());
	}

	@Test
	@DisplayName("Record 3428: LastName is Hyndel")
	void LastNameOfRecord3428() {
		assertEquals("Hyndel", customers.get(3427).getLastName());
	}

	@Test
	@DisplayName("Record 3428: Company is Warner Jenkinson Co")
	void CompanyOfRecord3428() {
		assertEquals("Warner Jenkinson Co", customers.get(3427).getCompany());
	}

	@Test
	@DisplayName("Record 3428: Address is 20 E 15th St")
	void AddressOfRecord3428() {
		assertEquals("20 E 15th St", customers.get(3427).getAddress());
	}

	@Test
	@DisplayName("Record 3428: City is Paterson")
	void CityOfRecord3428() {
		assertEquals("Paterson", customers.get(3427).getCity());
	}

	@Test
	@DisplayName("Record 3428: County is Passaic")
	void CountyOfRecord3428() {
		assertEquals("Passaic", customers.get(3427).getCounty());
	}

	@Test
	@DisplayName("Record 3428: State is NJ")
	void StateOfRecord3428() {
		assertEquals("NJ", customers.get(3427).getState());
	}

	@Test
	@DisplayName("Record 3428: ZIP is 7524")
	void ZIPOfRecord3428() {
		assertEquals("7524", customers.get(3427).getZIP());
	}

	@Test
	@DisplayName("Record 3428: Phone is 973-684-3159")
	void PhoneOfRecord3428() {
		assertEquals("973-684-3159", customers.get(3427).getPhone());
	}

	@Test
	@DisplayName("Record 3428: Fax is 973-684-6107")
	void FaxOfRecord3428() {
		assertEquals("973-684-6107", customers.get(3427).getFax());
	}

	@Test
	@DisplayName("Record 3428: Email is stanley@hyndel.com")
	void EmailOfRecord3428() {
		assertEquals("stanley@hyndel.com", customers.get(3427).getEmail());
	}

	@Test
	@DisplayName("Record 3428: Web is http://www.stanleyhyndel.com")
	void WebOfRecord3428() {
		assertEquals("http://www.stanleyhyndel.com", customers.get(3427).getWeb());
	}
}

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

@Tag("48")
class Record_3624 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3624: FirstName is Anita")
	void FirstNameOfRecord3624() {
		assertEquals("Anita", customers.get(3623).getFirstName());
	}

	@Test
	@DisplayName("Record 3624: LastName is Boyken")
	void LastNameOfRecord3624() {
		assertEquals("Boyken", customers.get(3623).getLastName());
	}

	@Test
	@DisplayName("Record 3624: Company is Johrendt, Michael J Esq")
	void CompanyOfRecord3624() {
		assertEquals("Johrendt, Michael J Esq", customers.get(3623).getCompany());
	}

	@Test
	@DisplayName("Record 3624: Address is 2624 Jenks Ave")
	void AddressOfRecord3624() {
		assertEquals("2624 Jenks Ave", customers.get(3623).getAddress());
	}

	@Test
	@DisplayName("Record 3624: City is Panama City")
	void CityOfRecord3624() {
		assertEquals("Panama City", customers.get(3623).getCity());
	}

	@Test
	@DisplayName("Record 3624: County is Bay")
	void CountyOfRecord3624() {
		assertEquals("Bay", customers.get(3623).getCounty());
	}

	@Test
	@DisplayName("Record 3624: State is FL")
	void StateOfRecord3624() {
		assertEquals("FL", customers.get(3623).getState());
	}

	@Test
	@DisplayName("Record 3624: ZIP is 32405")
	void ZIPOfRecord3624() {
		assertEquals("32405", customers.get(3623).getZIP());
	}

	@Test
	@DisplayName("Record 3624: Phone is 850-769-4919")
	void PhoneOfRecord3624() {
		assertEquals("850-769-4919", customers.get(3623).getPhone());
	}

	@Test
	@DisplayName("Record 3624: Fax is 850-769-4303")
	void FaxOfRecord3624() {
		assertEquals("850-769-4303", customers.get(3623).getFax());
	}

	@Test
	@DisplayName("Record 3624: Email is anita@boyken.com")
	void EmailOfRecord3624() {
		assertEquals("anita@boyken.com", customers.get(3623).getEmail());
	}

	@Test
	@DisplayName("Record 3624: Web is http://www.anitaboyken.com")
	void WebOfRecord3624() {
		assertEquals("http://www.anitaboyken.com", customers.get(3623).getWeb());
	}
}

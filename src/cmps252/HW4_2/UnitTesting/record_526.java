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

@Tag("20")
class Record_526 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 526: FirstName is William")
	void FirstNameOfRecord526() {
		assertEquals("William", customers.get(525).getFirstName());
	}

	@Test
	@DisplayName("Record 526: LastName is Gohr")
	void LastNameOfRecord526() {
		assertEquals("Gohr", customers.get(525).getLastName());
	}

	@Test
	@DisplayName("Record 526: Company is Rdi & Associates")
	void CompanyOfRecord526() {
		assertEquals("Rdi & Associates", customers.get(525).getCompany());
	}

	@Test
	@DisplayName("Record 526: Address is 14542 Vanowen St")
	void AddressOfRecord526() {
		assertEquals("14542 Vanowen St", customers.get(525).getAddress());
	}

	@Test
	@DisplayName("Record 526: City is Van Nuys")
	void CityOfRecord526() {
		assertEquals("Van Nuys", customers.get(525).getCity());
	}

	@Test
	@DisplayName("Record 526: County is Los Angeles")
	void CountyOfRecord526() {
		assertEquals("Los Angeles", customers.get(525).getCounty());
	}

	@Test
	@DisplayName("Record 526: State is CA")
	void StateOfRecord526() {
		assertEquals("CA", customers.get(525).getState());
	}

	@Test
	@DisplayName("Record 526: ZIP is 91405")
	void ZIPOfRecord526() {
		assertEquals("91405", customers.get(525).getZIP());
	}

	@Test
	@DisplayName("Record 526: Phone is 818-782-4849")
	void PhoneOfRecord526() {
		assertEquals("818-782-4849", customers.get(525).getPhone());
	}

	@Test
	@DisplayName("Record 526: Fax is 818-782-3351")
	void FaxOfRecord526() {
		assertEquals("818-782-3351", customers.get(525).getFax());
	}

	@Test
	@DisplayName("Record 526: Email is william@gohr.com")
	void EmailOfRecord526() {
		assertEquals("william@gohr.com", customers.get(525).getEmail());
	}

	@Test
	@DisplayName("Record 526: Web is http://www.williamgohr.com")
	void WebOfRecord526() {
		assertEquals("http://www.williamgohr.com", customers.get(525).getWeb());
	}
}

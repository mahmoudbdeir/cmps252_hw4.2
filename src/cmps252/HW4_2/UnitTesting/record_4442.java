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

@Tag("49")
class Record_4442 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4442: FirstName is Kira")
	void FirstNameOfRecord4442() {
		assertEquals("Kira", customers.get(4441).getFirstName());
	}

	@Test
	@DisplayName("Record 4442: LastName is Aemmer")
	void LastNameOfRecord4442() {
		assertEquals("Aemmer", customers.get(4441).getLastName());
	}

	@Test
	@DisplayName("Record 4442: Company is Rice, Thomas S Esq")
	void CompanyOfRecord4442() {
		assertEquals("Rice, Thomas S Esq", customers.get(4441).getCompany());
	}

	@Test
	@DisplayName("Record 4442: Address is 87 Olympia Ave")
	void AddressOfRecord4442() {
		assertEquals("87 Olympia Ave", customers.get(4441).getAddress());
	}

	@Test
	@DisplayName("Record 4442: City is Woburn")
	void CityOfRecord4442() {
		assertEquals("Woburn", customers.get(4441).getCity());
	}

	@Test
	@DisplayName("Record 4442: County is Middlesex")
	void CountyOfRecord4442() {
		assertEquals("Middlesex", customers.get(4441).getCounty());
	}

	@Test
	@DisplayName("Record 4442: State is MA")
	void StateOfRecord4442() {
		assertEquals("MA", customers.get(4441).getState());
	}

	@Test
	@DisplayName("Record 4442: ZIP is 1801")
	void ZIPOfRecord4442() {
		assertEquals("1801", customers.get(4441).getZIP());
	}

	@Test
	@DisplayName("Record 4442: Phone is 781-933-7110")
	void PhoneOfRecord4442() {
		assertEquals("781-933-7110", customers.get(4441).getPhone());
	}

	@Test
	@DisplayName("Record 4442: Fax is 781-933-7576")
	void FaxOfRecord4442() {
		assertEquals("781-933-7576", customers.get(4441).getFax());
	}

	@Test
	@DisplayName("Record 4442: Email is kira@aemmer.com")
	void EmailOfRecord4442() {
		assertEquals("kira@aemmer.com", customers.get(4441).getEmail());
	}

	@Test
	@DisplayName("Record 4442: Web is http://www.kiraaemmer.com")
	void WebOfRecord4442() {
		assertEquals("http://www.kiraaemmer.com", customers.get(4441).getWeb());
	}
}

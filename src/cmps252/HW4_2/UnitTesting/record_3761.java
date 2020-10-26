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

@Tag("44")
class Record_3761 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3761: FirstName is Kelli")
	void FirstNameOfRecord3761() {
		assertEquals("Kelli", customers.get(3760).getFirstName());
	}

	@Test
	@DisplayName("Record 3761: LastName is Musa")
	void LastNameOfRecord3761() {
		assertEquals("Musa", customers.get(3760).getLastName());
	}

	@Test
	@DisplayName("Record 3761: Company is Michael C Bouzos & Associates")
	void CompanyOfRecord3761() {
		assertEquals("Michael C Bouzos & Associates", customers.get(3760).getCompany());
	}

	@Test
	@DisplayName("Record 3761: Address is 3802 Morgan Ave")
	void AddressOfRecord3761() {
		assertEquals("3802 Morgan Ave", customers.get(3760).getAddress());
	}

	@Test
	@DisplayName("Record 3761: City is Corpus Christi")
	void CityOfRecord3761() {
		assertEquals("Corpus Christi", customers.get(3760).getCity());
	}

	@Test
	@DisplayName("Record 3761: County is Nueces")
	void CountyOfRecord3761() {
		assertEquals("Nueces", customers.get(3760).getCounty());
	}

	@Test
	@DisplayName("Record 3761: State is TX")
	void StateOfRecord3761() {
		assertEquals("TX", customers.get(3760).getState());
	}

	@Test
	@DisplayName("Record 3761: ZIP is 78405")
	void ZIPOfRecord3761() {
		assertEquals("78405", customers.get(3760).getZIP());
	}

	@Test
	@DisplayName("Record 3761: Phone is 361-883-7115")
	void PhoneOfRecord3761() {
		assertEquals("361-883-7115", customers.get(3760).getPhone());
	}

	@Test
	@DisplayName("Record 3761: Fax is 361-883-8483")
	void FaxOfRecord3761() {
		assertEquals("361-883-8483", customers.get(3760).getFax());
	}

	@Test
	@DisplayName("Record 3761: Email is kelli@musa.com")
	void EmailOfRecord3761() {
		assertEquals("kelli@musa.com", customers.get(3760).getEmail());
	}

	@Test
	@DisplayName("Record 3761: Web is http://www.kellimusa.com")
	void WebOfRecord3761() {
		assertEquals("http://www.kellimusa.com", customers.get(3760).getWeb());
	}
}

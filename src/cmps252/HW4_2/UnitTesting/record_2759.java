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

@Tag("47")
class Record_2759 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2759: FirstName is Celia")
	void FirstNameOfRecord2759() {
		assertEquals("Celia", customers.get(2758).getFirstName());
	}

	@Test
	@DisplayName("Record 2759: LastName is Hoxworth")
	void LastNameOfRecord2759() {
		assertEquals("Hoxworth", customers.get(2758).getLastName());
	}

	@Test
	@DisplayName("Record 2759: Company is Interel Corp")
	void CompanyOfRecord2759() {
		assertEquals("Interel Corp", customers.get(2758).getCompany());
	}

	@Test
	@DisplayName("Record 2759: Address is 2501 N Port Ave")
	void AddressOfRecord2759() {
		assertEquals("2501 N Port Ave", customers.get(2758).getAddress());
	}

	@Test
	@DisplayName("Record 2759: City is Corpus Christi")
	void CityOfRecord2759() {
		assertEquals("Corpus Christi", customers.get(2758).getCity());
	}

	@Test
	@DisplayName("Record 2759: County is Nueces")
	void CountyOfRecord2759() {
		assertEquals("Nueces", customers.get(2758).getCounty());
	}

	@Test
	@DisplayName("Record 2759: State is TX")
	void StateOfRecord2759() {
		assertEquals("TX", customers.get(2758).getState());
	}

	@Test
	@DisplayName("Record 2759: ZIP is 78401")
	void ZIPOfRecord2759() {
		assertEquals("78401", customers.get(2758).getZIP());
	}

	@Test
	@DisplayName("Record 2759: Phone is 361-887-4320")
	void PhoneOfRecord2759() {
		assertEquals("361-887-4320", customers.get(2758).getPhone());
	}

	@Test
	@DisplayName("Record 2759: Fax is 361-887-6937")
	void FaxOfRecord2759() {
		assertEquals("361-887-6937", customers.get(2758).getFax());
	}

	@Test
	@DisplayName("Record 2759: Email is celia@hoxworth.com")
	void EmailOfRecord2759() {
		assertEquals("celia@hoxworth.com", customers.get(2758).getEmail());
	}

	@Test
	@DisplayName("Record 2759: Web is http://www.celiahoxworth.com")
	void WebOfRecord2759() {
		assertEquals("http://www.celiahoxworth.com", customers.get(2758).getWeb());
	}
}

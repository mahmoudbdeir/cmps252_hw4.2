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

@Tag("17")
class Record_190 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 190: FirstName is Erma")
	void FirstNameOfRecord190() {
		assertEquals("Erma", customers.get(189).getFirstName());
	}

	@Test
	@DisplayName("Record 190: LastName is Klynke")
	void LastNameOfRecord190() {
		assertEquals("Klynke", customers.get(189).getLastName());
	}

	@Test
	@DisplayName("Record 190: Company is Acordia Of Central Indiana")
	void CompanyOfRecord190() {
		assertEquals("Acordia Of Central Indiana", customers.get(189).getCompany());
	}

	@Test
	@DisplayName("Record 190: Address is 501 Tupper Ln")
	void AddressOfRecord190() {
		assertEquals("501 Tupper Ln", customers.get(189).getAddress());
	}

	@Test
	@DisplayName("Record 190: City is Corpus Christi")
	void CityOfRecord190() {
		assertEquals("Corpus Christi", customers.get(189).getCity());
	}

	@Test
	@DisplayName("Record 190: County is Nueces")
	void CountyOfRecord190() {
		assertEquals("Nueces", customers.get(189).getCounty());
	}

	@Test
	@DisplayName("Record 190: State is TX")
	void StateOfRecord190() {
		assertEquals("TX", customers.get(189).getState());
	}

	@Test
	@DisplayName("Record 190: ZIP is 78415")
	void ZIPOfRecord190() {
		assertEquals("78415", customers.get(189).getZIP());
	}

	@Test
	@DisplayName("Record 190: Phone is 361-289-2615")
	void PhoneOfRecord190() {
		assertEquals("361-289-2615", customers.get(189).getPhone());
	}

	@Test
	@DisplayName("Record 190: Fax is 361-289-6312")
	void FaxOfRecord190() {
		assertEquals("361-289-6312", customers.get(189).getFax());
	}

	@Test
	@DisplayName("Record 190: Email is erma@klynke.com")
	void EmailOfRecord190() {
		assertEquals("erma@klynke.com", customers.get(189).getEmail());
	}

	@Test
	@DisplayName("Record 190: Web is http://www.ermaklynke.com")
	void WebOfRecord190() {
		assertEquals("http://www.ermaklynke.com", customers.get(189).getWeb());
	}
}

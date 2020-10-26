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
class Record_2692 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2692: FirstName is Terrie")
	void FirstNameOfRecord2692() {
		assertEquals("Terrie", customers.get(2691).getFirstName());
	}

	@Test
	@DisplayName("Record 2692: LastName is Jurich")
	void LastNameOfRecord2692() {
		assertEquals("Jurich", customers.get(2691).getLastName());
	}

	@Test
	@DisplayName("Record 2692: Company is Mccurry, Robert F Jr")
	void CompanyOfRecord2692() {
		assertEquals("Mccurry, Robert F Jr", customers.get(2691).getCompany());
	}

	@Test
	@DisplayName("Record 2692: Address is 905 Lincoln St")
	void AddressOfRecord2692() {
		assertEquals("905 Lincoln St", customers.get(2691).getAddress());
	}

	@Test
	@DisplayName("Record 2692: City is Laredo")
	void CityOfRecord2692() {
		assertEquals("Laredo", customers.get(2691).getCity());
	}

	@Test
	@DisplayName("Record 2692: County is Webb")
	void CountyOfRecord2692() {
		assertEquals("Webb", customers.get(2691).getCounty());
	}

	@Test
	@DisplayName("Record 2692: State is TX")
	void StateOfRecord2692() {
		assertEquals("TX", customers.get(2691).getState());
	}

	@Test
	@DisplayName("Record 2692: ZIP is 78040")
	void ZIPOfRecord2692() {
		assertEquals("78040", customers.get(2691).getZIP());
	}

	@Test
	@DisplayName("Record 2692: Phone is 956-726-0940")
	void PhoneOfRecord2692() {
		assertEquals("956-726-0940", customers.get(2691).getPhone());
	}

	@Test
	@DisplayName("Record 2692: Fax is 956-726-7145")
	void FaxOfRecord2692() {
		assertEquals("956-726-7145", customers.get(2691).getFax());
	}

	@Test
	@DisplayName("Record 2692: Email is terrie@jurich.com")
	void EmailOfRecord2692() {
		assertEquals("terrie@jurich.com", customers.get(2691).getEmail());
	}

	@Test
	@DisplayName("Record 2692: Web is http://www.terriejurich.com")
	void WebOfRecord2692() {
		assertEquals("http://www.terriejurich.com", customers.get(2691).getWeb());
	}
}

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

@Tag("31")
class Record_3232 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3232: FirstName is Valencia")
	void FirstNameOfRecord3232() {
		assertEquals("Valencia", customers.get(3231).getFirstName());
	}

	@Test
	@DisplayName("Record 3232: LastName is Scierka")
	void LastNameOfRecord3232() {
		assertEquals("Scierka", customers.get(3231).getLastName());
	}

	@Test
	@DisplayName("Record 3232: Company is Decatur Plastics")
	void CompanyOfRecord3232() {
		assertEquals("Decatur Plastics", customers.get(3231).getCompany());
	}

	@Test
	@DisplayName("Record 3232: Address is 3010 Leopard St")
	void AddressOfRecord3232() {
		assertEquals("3010 Leopard St", customers.get(3231).getAddress());
	}

	@Test
	@DisplayName("Record 3232: City is Corpus Christi")
	void CityOfRecord3232() {
		assertEquals("Corpus Christi", customers.get(3231).getCity());
	}

	@Test
	@DisplayName("Record 3232: County is Nueces")
	void CountyOfRecord3232() {
		assertEquals("Nueces", customers.get(3231).getCounty());
	}

	@Test
	@DisplayName("Record 3232: State is TX")
	void StateOfRecord3232() {
		assertEquals("TX", customers.get(3231).getState());
	}

	@Test
	@DisplayName("Record 3232: ZIP is 78408")
	void ZIPOfRecord3232() {
		assertEquals("78408", customers.get(3231).getZIP());
	}

	@Test
	@DisplayName("Record 3232: Phone is 361-852-1338")
	void PhoneOfRecord3232() {
		assertEquals("361-852-1338", customers.get(3231).getPhone());
	}

	@Test
	@DisplayName("Record 3232: Fax is 361-852-3432")
	void FaxOfRecord3232() {
		assertEquals("361-852-3432", customers.get(3231).getFax());
	}

	@Test
	@DisplayName("Record 3232: Email is valencia@scierka.com")
	void EmailOfRecord3232() {
		assertEquals("valencia@scierka.com", customers.get(3231).getEmail());
	}

	@Test
	@DisplayName("Record 3232: Web is http://www.valenciascierka.com")
	void WebOfRecord3232() {
		assertEquals("http://www.valenciascierka.com", customers.get(3231).getWeb());
	}
}

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

@Tag("41")
class Record_601 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 601: FirstName is Monica")
	void FirstNameOfRecord601() {
		assertEquals("Monica", customers.get(600).getFirstName());
	}

	@Test
	@DisplayName("Record 601: LastName is Parthemore")
	void LastNameOfRecord601() {
		assertEquals("Parthemore", customers.get(600).getLastName());
	}

	@Test
	@DisplayName("Record 601: Company is Wilson, Robert C Esq")
	void CompanyOfRecord601() {
		assertEquals("Wilson, Robert C Esq", customers.get(600).getCompany());
	}

	@Test
	@DisplayName("Record 601: Address is 190 Summerhill Rd")
	void AddressOfRecord601() {
		assertEquals("190 Summerhill Rd", customers.get(600).getAddress());
	}

	@Test
	@DisplayName("Record 601: City is Spotswood")
	void CityOfRecord601() {
		assertEquals("Spotswood", customers.get(600).getCity());
	}

	@Test
	@DisplayName("Record 601: County is Middlesex")
	void CountyOfRecord601() {
		assertEquals("Middlesex", customers.get(600).getCounty());
	}

	@Test
	@DisplayName("Record 601: State is NJ")
	void StateOfRecord601() {
		assertEquals("NJ", customers.get(600).getState());
	}

	@Test
	@DisplayName("Record 601: ZIP is 8884")
	void ZIPOfRecord601() {
		assertEquals("8884", customers.get(600).getZIP());
	}

	@Test
	@DisplayName("Record 601: Phone is 732-251-8000")
	void PhoneOfRecord601() {
		assertEquals("732-251-8000", customers.get(600).getPhone());
	}

	@Test
	@DisplayName("Record 601: Fax is 732-251-9468")
	void FaxOfRecord601() {
		assertEquals("732-251-9468", customers.get(600).getFax());
	}

	@Test
	@DisplayName("Record 601: Email is monica@parthemore.com")
	void EmailOfRecord601() {
		assertEquals("monica@parthemore.com", customers.get(600).getEmail());
	}

	@Test
	@DisplayName("Record 601: Web is http://www.monicaparthemore.com")
	void WebOfRecord601() {
		assertEquals("http://www.monicaparthemore.com", customers.get(600).getWeb());
	}
}

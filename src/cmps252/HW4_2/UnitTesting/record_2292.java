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

@Tag("12")
class Record_2292 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2292: FirstName is Galen")
	void FirstNameOfRecord2292() {
		assertEquals("Galen", customers.get(2291).getFirstName());
	}

	@Test
	@DisplayName("Record 2292: LastName is Pham")
	void LastNameOfRecord2292() {
		assertEquals("Pham", customers.get(2291).getLastName());
	}

	@Test
	@DisplayName("Record 2292: Company is Post Rite Accounting Systems")
	void CompanyOfRecord2292() {
		assertEquals("Post Rite Accounting Systems", customers.get(2291).getCompany());
	}

	@Test
	@DisplayName("Record 2292: Address is 440 Amboy Ave")
	void AddressOfRecord2292() {
		assertEquals("440 Amboy Ave", customers.get(2291).getAddress());
	}

	@Test
	@DisplayName("Record 2292: City is Perth Amboy")
	void CityOfRecord2292() {
		assertEquals("Perth Amboy", customers.get(2291).getCity());
	}

	@Test
	@DisplayName("Record 2292: County is Middlesex")
	void CountyOfRecord2292() {
		assertEquals("Middlesex", customers.get(2291).getCounty());
	}

	@Test
	@DisplayName("Record 2292: State is NJ")
	void StateOfRecord2292() {
		assertEquals("NJ", customers.get(2291).getState());
	}

	@Test
	@DisplayName("Record 2292: ZIP is 8861")
	void ZIPOfRecord2292() {
		assertEquals("8861", customers.get(2291).getZIP());
	}

	@Test
	@DisplayName("Record 2292: Phone is 732-826-8296")
	void PhoneOfRecord2292() {
		assertEquals("732-826-8296", customers.get(2291).getPhone());
	}

	@Test
	@DisplayName("Record 2292: Fax is 732-826-1547")
	void FaxOfRecord2292() {
		assertEquals("732-826-1547", customers.get(2291).getFax());
	}

	@Test
	@DisplayName("Record 2292: Email is galen@pham.com")
	void EmailOfRecord2292() {
		assertEquals("galen@pham.com", customers.get(2291).getEmail());
	}

	@Test
	@DisplayName("Record 2292: Web is http://www.galenpham.com")
	void WebOfRecord2292() {
		assertEquals("http://www.galenpham.com", customers.get(2291).getWeb());
	}
}

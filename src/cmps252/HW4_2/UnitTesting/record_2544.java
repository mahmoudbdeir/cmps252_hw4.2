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

@Tag("35")
class Record_2544 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2544: FirstName is Archie")
	void FirstNameOfRecord2544() {
		assertEquals("Archie", customers.get(2543).getFirstName());
	}

	@Test
	@DisplayName("Record 2544: LastName is Topolosky")
	void LastNameOfRecord2544() {
		assertEquals("Topolosky", customers.get(2543).getLastName());
	}

	@Test
	@DisplayName("Record 2544: Company is H R S Corp")
	void CompanyOfRecord2544() {
		assertEquals("H R S Corp", customers.get(2543).getCompany());
	}

	@Test
	@DisplayName("Record 2544: Address is 100 Dunksferry Rd")
	void AddressOfRecord2544() {
		assertEquals("100 Dunksferry Rd", customers.get(2543).getAddress());
	}

	@Test
	@DisplayName("Record 2544: City is Bensalem")
	void CityOfRecord2544() {
		assertEquals("Bensalem", customers.get(2543).getCity());
	}

	@Test
	@DisplayName("Record 2544: County is Bucks")
	void CountyOfRecord2544() {
		assertEquals("Bucks", customers.get(2543).getCounty());
	}

	@Test
	@DisplayName("Record 2544: State is PA")
	void StateOfRecord2544() {
		assertEquals("PA", customers.get(2543).getState());
	}

	@Test
	@DisplayName("Record 2544: ZIP is 19020")
	void ZIPOfRecord2544() {
		assertEquals("19020", customers.get(2543).getZIP());
	}

	@Test
	@DisplayName("Record 2544: Phone is 215-638-1807")
	void PhoneOfRecord2544() {
		assertEquals("215-638-1807", customers.get(2543).getPhone());
	}

	@Test
	@DisplayName("Record 2544: Fax is 215-638-3354")
	void FaxOfRecord2544() {
		assertEquals("215-638-3354", customers.get(2543).getFax());
	}

	@Test
	@DisplayName("Record 2544: Email is archie@topolosky.com")
	void EmailOfRecord2544() {
		assertEquals("archie@topolosky.com", customers.get(2543).getEmail());
	}

	@Test
	@DisplayName("Record 2544: Web is http://www.archietopolosky.com")
	void WebOfRecord2544() {
		assertEquals("http://www.archietopolosky.com", customers.get(2543).getWeb());
	}
}

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

@Tag("25")
class Record_1291 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1291: FirstName is Adam")
	void FirstNameOfRecord1291() {
		assertEquals("Adam", customers.get(1290).getFirstName());
	}

	@Test
	@DisplayName("Record 1291: LastName is Brittain")
	void LastNameOfRecord1291() {
		assertEquals("Brittain", customers.get(1290).getLastName());
	}

	@Test
	@DisplayName("Record 1291: Company is Michard Office Supply")
	void CompanyOfRecord1291() {
		assertEquals("Michard Office Supply", customers.get(1290).getCompany());
	}

	@Test
	@DisplayName("Record 1291: Address is 124 Park Ave")
	void AddressOfRecord1291() {
		assertEquals("124 Park Ave", customers.get(1290).getAddress());
	}

	@Test
	@DisplayName("Record 1291: City is Lyndhurst")
	void CityOfRecord1291() {
		assertEquals("Lyndhurst", customers.get(1290).getCity());
	}

	@Test
	@DisplayName("Record 1291: County is Bergen")
	void CountyOfRecord1291() {
		assertEquals("Bergen", customers.get(1290).getCounty());
	}

	@Test
	@DisplayName("Record 1291: State is NJ")
	void StateOfRecord1291() {
		assertEquals("NJ", customers.get(1290).getState());
	}

	@Test
	@DisplayName("Record 1291: ZIP is 7071")
	void ZIPOfRecord1291() {
		assertEquals("07071", customers.get(1290).getZIP());
	}

	@Test
	@DisplayName("Record 1291: Phone is 201-939-2903")
	void PhoneOfRecord1291() {
		assertEquals("201-939-2903", customers.get(1290).getPhone());
	}

	@Test
	@DisplayName("Record 1291: Fax is 201-939-5484")
	void FaxOfRecord1291() {
		assertEquals("201-939-5484", customers.get(1290).getFax());
	}

	@Test
	@DisplayName("Record 1291: Email is adam@brittain.com")
	void EmailOfRecord1291() {
		assertEquals("adam@brittain.com", customers.get(1290).getEmail());
	}

	@Test
	@DisplayName("Record 1291: Web is http://www.adambrittain.com")
	void WebOfRecord1291() {
		assertEquals("http://www.adambrittain.com", customers.get(1290).getWeb());
	}
}

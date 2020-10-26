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

@Tag("19")
class Record_2533 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2533: FirstName is Sol")
	void FirstNameOfRecord2533() {
		assertEquals("Sol", customers.get(2532).getFirstName());
	}

	@Test
	@DisplayName("Record 2533: LastName is Stoklasa")
	void LastNameOfRecord2533() {
		assertEquals("Stoklasa", customers.get(2532).getLastName());
	}

	@Test
	@DisplayName("Record 2533: Company is Applied Innovation Inc")
	void CompanyOfRecord2533() {
		assertEquals("Applied Innovation Inc", customers.get(2532).getCompany());
	}

	@Test
	@DisplayName("Record 2533: Address is 286 Richmond Valley Rd")
	void AddressOfRecord2533() {
		assertEquals("286 Richmond Valley Rd", customers.get(2532).getAddress());
	}

	@Test
	@DisplayName("Record 2533: City is Staten Island")
	void CityOfRecord2533() {
		assertEquals("Staten Island", customers.get(2532).getCity());
	}

	@Test
	@DisplayName("Record 2533: County is Richmond")
	void CountyOfRecord2533() {
		assertEquals("Richmond", customers.get(2532).getCounty());
	}

	@Test
	@DisplayName("Record 2533: State is NY")
	void StateOfRecord2533() {
		assertEquals("NY", customers.get(2532).getState());
	}

	@Test
	@DisplayName("Record 2533: ZIP is 10309")
	void ZIPOfRecord2533() {
		assertEquals("10309", customers.get(2532).getZIP());
	}

	@Test
	@DisplayName("Record 2533: Phone is 718-317-9896")
	void PhoneOfRecord2533() {
		assertEquals("718-317-9896", customers.get(2532).getPhone());
	}

	@Test
	@DisplayName("Record 2533: Fax is 718-317-3695")
	void FaxOfRecord2533() {
		assertEquals("718-317-3695", customers.get(2532).getFax());
	}

	@Test
	@DisplayName("Record 2533: Email is sol@stoklasa.com")
	void EmailOfRecord2533() {
		assertEquals("sol@stoklasa.com", customers.get(2532).getEmail());
	}

	@Test
	@DisplayName("Record 2533: Web is http://www.solstoklasa.com")
	void WebOfRecord2533() {
		assertEquals("http://www.solstoklasa.com", customers.get(2532).getWeb());
	}
}

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
class Record_2638 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2638: FirstName is Cristopher")
	void FirstNameOfRecord2638() {
		assertEquals("Cristopher", customers.get(2637).getFirstName());
	}

	@Test
	@DisplayName("Record 2638: LastName is Kuchem")
	void LastNameOfRecord2638() {
		assertEquals("Kuchem", customers.get(2637).getLastName());
	}

	@Test
	@DisplayName("Record 2638: Company is Prime Copy & Printing")
	void CompanyOfRecord2638() {
		assertEquals("Prime Copy & Printing", customers.get(2637).getCompany());
	}

	@Test
	@DisplayName("Record 2638: Address is 32 Beechwood Ter")
	void AddressOfRecord2638() {
		assertEquals("32 Beechwood Ter", customers.get(2637).getAddress());
	}

	@Test
	@DisplayName("Record 2638: City is Matawan")
	void CityOfRecord2638() {
		assertEquals("Matawan", customers.get(2637).getCity());
	}

	@Test
	@DisplayName("Record 2638: County is Monmouth")
	void CountyOfRecord2638() {
		assertEquals("Monmouth", customers.get(2637).getCounty());
	}

	@Test
	@DisplayName("Record 2638: State is NJ")
	void StateOfRecord2638() {
		assertEquals("NJ", customers.get(2637).getState());
	}

	@Test
	@DisplayName("Record 2638: ZIP is 7747")
	void ZIPOfRecord2638() {
		assertEquals("7747", customers.get(2637).getZIP());
	}

	@Test
	@DisplayName("Record 2638: Phone is 732-583-8174")
	void PhoneOfRecord2638() {
		assertEquals("732-583-8174", customers.get(2637).getPhone());
	}

	@Test
	@DisplayName("Record 2638: Fax is 732-583-3261")
	void FaxOfRecord2638() {
		assertEquals("732-583-3261", customers.get(2637).getFax());
	}

	@Test
	@DisplayName("Record 2638: Email is cristopher@kuchem.com")
	void EmailOfRecord2638() {
		assertEquals("cristopher@kuchem.com", customers.get(2637).getEmail());
	}

	@Test
	@DisplayName("Record 2638: Web is http://www.cristopherkuchem.com")
	void WebOfRecord2638() {
		assertEquals("http://www.cristopherkuchem.com", customers.get(2637).getWeb());
	}
}

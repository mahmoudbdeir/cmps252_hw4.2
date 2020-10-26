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

@Tag("29")
class Record_2818 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2818: FirstName is Terence")
	void FirstNameOfRecord2818() {
		assertEquals("Terence", customers.get(2817).getFirstName());
	}

	@Test
	@DisplayName("Record 2818: LastName is Morocco")
	void LastNameOfRecord2818() {
		assertEquals("Morocco", customers.get(2817).getLastName());
	}

	@Test
	@DisplayName("Record 2818: Company is Columbia Lithograph Co")
	void CompanyOfRecord2818() {
		assertEquals("Columbia Lithograph Co", customers.get(2817).getCompany());
	}

	@Test
	@DisplayName("Record 2818: Address is 4445 Malone Rd")
	void AddressOfRecord2818() {
		assertEquals("4445 Malone Rd", customers.get(2817).getAddress());
	}

	@Test
	@DisplayName("Record 2818: City is Memphis")
	void CityOfRecord2818() {
		assertEquals("Memphis", customers.get(2817).getCity());
	}

	@Test
	@DisplayName("Record 2818: County is Shelby")
	void CountyOfRecord2818() {
		assertEquals("Shelby", customers.get(2817).getCounty());
	}

	@Test
	@DisplayName("Record 2818: State is TN")
	void StateOfRecord2818() {
		assertEquals("TN", customers.get(2817).getState());
	}

	@Test
	@DisplayName("Record 2818: ZIP is 38118")
	void ZIPOfRecord2818() {
		assertEquals("38118", customers.get(2817).getZIP());
	}

	@Test
	@DisplayName("Record 2818: Phone is 901-794-1303")
	void PhoneOfRecord2818() {
		assertEquals("901-794-1303", customers.get(2817).getPhone());
	}

	@Test
	@DisplayName("Record 2818: Fax is 901-794-9787")
	void FaxOfRecord2818() {
		assertEquals("901-794-9787", customers.get(2817).getFax());
	}

	@Test
	@DisplayName("Record 2818: Email is terence@morocco.com")
	void EmailOfRecord2818() {
		assertEquals("terence@morocco.com", customers.get(2817).getEmail());
	}

	@Test
	@DisplayName("Record 2818: Web is http://www.terencemorocco.com")
	void WebOfRecord2818() {
		assertEquals("http://www.terencemorocco.com", customers.get(2817).getWeb());
	}
}

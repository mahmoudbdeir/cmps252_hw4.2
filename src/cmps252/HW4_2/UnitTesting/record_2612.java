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

@Tag("43")
class Record_2612 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2612: FirstName is Lyle")
	void FirstNameOfRecord2612() {
		assertEquals("Lyle", customers.get(2611).getFirstName());
	}

	@Test
	@DisplayName("Record 2612: LastName is Gani")
	void LastNameOfRecord2612() {
		assertEquals("Gani", customers.get(2611).getLastName());
	}

	@Test
	@DisplayName("Record 2612: Company is Doren, Robert A Esq")
	void CompanyOfRecord2612() {
		assertEquals("Doren, Robert A Esq", customers.get(2611).getCompany());
	}

	@Test
	@DisplayName("Record 2612: Address is 4848 Getwell Rd")
	void AddressOfRecord2612() {
		assertEquals("4848 Getwell Rd", customers.get(2611).getAddress());
	}

	@Test
	@DisplayName("Record 2612: City is Memphis")
	void CityOfRecord2612() {
		assertEquals("Memphis", customers.get(2611).getCity());
	}

	@Test
	@DisplayName("Record 2612: County is Shelby")
	void CountyOfRecord2612() {
		assertEquals("Shelby", customers.get(2611).getCounty());
	}

	@Test
	@DisplayName("Record 2612: State is TN")
	void StateOfRecord2612() {
		assertEquals("TN", customers.get(2611).getState());
	}

	@Test
	@DisplayName("Record 2612: ZIP is 38118")
	void ZIPOfRecord2612() {
		assertEquals("38118", customers.get(2611).getZIP());
	}

	@Test
	@DisplayName("Record 2612: Phone is 901-367-1200")
	void PhoneOfRecord2612() {
		assertEquals("901-367-1200", customers.get(2611).getPhone());
	}

	@Test
	@DisplayName("Record 2612: Fax is 901-367-0117")
	void FaxOfRecord2612() {
		assertEquals("901-367-0117", customers.get(2611).getFax());
	}

	@Test
	@DisplayName("Record 2612: Email is lyle@gani.com")
	void EmailOfRecord2612() {
		assertEquals("lyle@gani.com", customers.get(2611).getEmail());
	}

	@Test
	@DisplayName("Record 2612: Web is http://www.lylegani.com")
	void WebOfRecord2612() {
		assertEquals("http://www.lylegani.com", customers.get(2611).getWeb());
	}
}

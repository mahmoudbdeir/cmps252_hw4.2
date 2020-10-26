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

@Tag("49")
class Record_2437 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2437: FirstName is Heath")
	void FirstNameOfRecord2437() {
		assertEquals("Heath", customers.get(2436).getFirstName());
	}

	@Test
	@DisplayName("Record 2437: LastName is Byne")
	void LastNameOfRecord2437() {
		assertEquals("Byne", customers.get(2436).getLastName());
	}

	@Test
	@DisplayName("Record 2437: Company is Pence/kelly Construction Inc")
	void CompanyOfRecord2437() {
		assertEquals("Pence/kelly Construction Inc", customers.get(2436).getCompany());
	}

	@Test
	@DisplayName("Record 2437: Address is 1276 Dahlia Ln")
	void AddressOfRecord2437() {
		assertEquals("1276 Dahlia Ln", customers.get(2436).getAddress());
	}

	@Test
	@DisplayName("Record 2437: City is Wantagh")
	void CityOfRecord2437() {
		assertEquals("Wantagh", customers.get(2436).getCity());
	}

	@Test
	@DisplayName("Record 2437: County is Nassau")
	void CountyOfRecord2437() {
		assertEquals("Nassau", customers.get(2436).getCounty());
	}

	@Test
	@DisplayName("Record 2437: State is NY")
	void StateOfRecord2437() {
		assertEquals("NY", customers.get(2436).getState());
	}

	@Test
	@DisplayName("Record 2437: ZIP is 11793")
	void ZIPOfRecord2437() {
		assertEquals("11793", customers.get(2436).getZIP());
	}

	@Test
	@DisplayName("Record 2437: Phone is 516-826-1970")
	void PhoneOfRecord2437() {
		assertEquals("516-826-1970", customers.get(2436).getPhone());
	}

	@Test
	@DisplayName("Record 2437: Fax is 516-826-6369")
	void FaxOfRecord2437() {
		assertEquals("516-826-6369", customers.get(2436).getFax());
	}

	@Test
	@DisplayName("Record 2437: Email is heath@byne.com")
	void EmailOfRecord2437() {
		assertEquals("heath@byne.com", customers.get(2436).getEmail());
	}

	@Test
	@DisplayName("Record 2437: Web is http://www.heathbyne.com")
	void WebOfRecord2437() {
		assertEquals("http://www.heathbyne.com", customers.get(2436).getWeb());
	}
}

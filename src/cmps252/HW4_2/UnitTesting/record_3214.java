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

@Tag("2")
class Record_3214 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3214: FirstName is Ernie")
	void FirstNameOfRecord3214() {
		assertEquals("Ernie", customers.get(3213).getFirstName());
	}

	@Test
	@DisplayName("Record 3214: LastName is Vaile")
	void LastNameOfRecord3214() {
		assertEquals("Vaile", customers.get(3213).getLastName());
	}

	@Test
	@DisplayName("Record 3214: Company is Eckstone, Georgia L Esq")
	void CompanyOfRecord3214() {
		assertEquals("Eckstone, Georgia L Esq", customers.get(3213).getCompany());
	}

	@Test
	@DisplayName("Record 3214: Address is 1751 Gilpin St")
	void AddressOfRecord3214() {
		assertEquals("1751 Gilpin St", customers.get(3213).getAddress());
	}

	@Test
	@DisplayName("Record 3214: City is Denver")
	void CityOfRecord3214() {
		assertEquals("Denver", customers.get(3213).getCity());
	}

	@Test
	@DisplayName("Record 3214: County is Denver")
	void CountyOfRecord3214() {
		assertEquals("Denver", customers.get(3213).getCounty());
	}

	@Test
	@DisplayName("Record 3214: State is CO")
	void StateOfRecord3214() {
		assertEquals("CO", customers.get(3213).getState());
	}

	@Test
	@DisplayName("Record 3214: ZIP is 80218")
	void ZIPOfRecord3214() {
		assertEquals("80218", customers.get(3213).getZIP());
	}

	@Test
	@DisplayName("Record 3214: Phone is 303-322-7909")
	void PhoneOfRecord3214() {
		assertEquals("303-322-7909", customers.get(3213).getPhone());
	}

	@Test
	@DisplayName("Record 3214: Fax is 303-322-6726")
	void FaxOfRecord3214() {
		assertEquals("303-322-6726", customers.get(3213).getFax());
	}

	@Test
	@DisplayName("Record 3214: Email is ernie@vaile.com")
	void EmailOfRecord3214() {
		assertEquals("ernie@vaile.com", customers.get(3213).getEmail());
	}

	@Test
	@DisplayName("Record 3214: Web is http://www.ernievaile.com")
	void WebOfRecord3214() {
		assertEquals("http://www.ernievaile.com", customers.get(3213).getWeb());
	}
}
